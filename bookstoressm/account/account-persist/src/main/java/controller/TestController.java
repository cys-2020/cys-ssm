package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import publicpojos.*;
import service.*;

@Controller
public class TestController {
	private UserService userService;
	private SellerService sellerService;
	private CustomerServiceStaffService csss;
	@Autowired
	public TestController(UserService userService, SellerService sellerService, CustomerServiceStaffService csss) {
		super();
		this.userService = userService;
		this.sellerService = sellerService;
		this.csss = csss;
	}
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@RequestParam("id")long id) {
		User cys=userService.getUser(id);
		System.err.println(cys);
		return cys;
	}
	@RequestMapping(value="/getSeller",method=RequestMethod.GET)
	@ResponseBody
	public Seller getSeller(@RequestParam("id")long id) {
		Seller cys=sellerService.getSeller(id);
		System.err.println(cys);
		return cys;
	}
	@RequestMapping(value="/getCss",method=RequestMethod.GET)
	@ResponseBody
	public CustomerServiceStaff getCustomerServiceStaff(@RequestParam("id")long id) {
		CustomerServiceStaff cys=csss.getCustomerServiceStaff(id);
		System.err.println(cys);
		return cys;
	}
}

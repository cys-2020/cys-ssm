package service;

import manager.SellerManager;
import publicpojos.Seller;

/**
 *	@description 账户Seller的服务类
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月4日
 */
public class SellerServiceImp implements SellerService {
	private SellerManager manager;
	
	public SellerServiceImp(SellerManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public Seller getSeller(long id) {
		//
		return manager.getSeller(id);
	}

	@Override
	public void insertSeller(Seller seller) {
		//
		manager.insertSeller(seller);
	}

	@Override
	public void updateSeller(Seller seller) {
		//
		manager.updateSeller(seller);
	}

	@Override
	public void deleteSeller(Seller seller) {
		//
		manager.deleteSeller(seller);
	}

}

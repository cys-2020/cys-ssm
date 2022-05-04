package manager;

import org.springframework.stereotype.Component;

import dao.SellerDAO;
import publicpojos.Seller;

/**
 *	@description 
 *	@author cys(ChenYongsheng)
 * 	@date 2022Äê5ÔÂ4ÈÕ
 */
@Component
public class SellerManagerImp implements SellerManager {
	private SellerDAO dao;
	@Override
	public Seller getSeller(long id) {
		//
		return dao.getSeller(id);
	}

	@Override
	public void insertSeller(Seller seller) {
		//
		dao.insertSeller(seller);
	}

	@Override
	public void updateSeller(Seller seller) {
		//
		dao.updateSeller(seller);
	}

	@Override
	public void deleteSeller(Seller seller) {
		//
		dao.deleteSeller(seller);
	}

}

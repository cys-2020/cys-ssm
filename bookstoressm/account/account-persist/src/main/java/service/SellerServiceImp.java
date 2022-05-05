package service;

import org.springframework.stereotype.Service;

import manager.SellerManager;
import publicpojos.Seller;

/**
 *	@description �˻�Seller�ķ�����
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��4��
 */
@Service
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

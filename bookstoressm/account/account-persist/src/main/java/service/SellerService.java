package service;

import publicpojos.Seller;
/**
 *	@description �������˻�Seller�����е�ҵ���߼�
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��4��
 */
public interface SellerService {
	Seller getSeller(long id);
	void insertSeller(Seller seller);
	void updateSeller(Seller seller);
	void deleteSeller(Seller seller);
}

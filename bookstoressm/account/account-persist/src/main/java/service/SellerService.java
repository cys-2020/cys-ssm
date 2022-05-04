package service;

import publicpojos.Seller;
/**
 *	@description 定义了账户Seller中所有的业务逻辑
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月4日
 */
public interface SellerService {
	Seller getSeller(long id);
	void insertSeller(Seller seller);
	void updateSeller(Seller seller);
	void deleteSeller(Seller seller);
}

package dao;

import publicpojos.Seller;

public interface SellerDAO {
	Seller getSeller(long id);
	void insertSeller(Seller seller);
	void updateSeller(Seller seller);
	void deleteSeller(Seller seller);
}

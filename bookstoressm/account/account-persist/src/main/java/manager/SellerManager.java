package manager;

import publicpojos.Seller;

public interface SellerManager {
	Seller getSeller(long id);
	void insertSeller(Seller seller);
	void updateSeller(Seller seller);
	void deleteSeller(Seller seller);
}

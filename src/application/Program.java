package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===== Test 1: FindById ===== ");
		System.out.println("");
		Seller seller = sellerDao.findById(5);
		System.out.println(seller);
		System.out.println("");
		System.out.println("=========== END ============");

	}

}

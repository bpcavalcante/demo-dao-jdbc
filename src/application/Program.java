package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "TI");

		Seller seller = new Seller(21, "Bruno", "bruno@gmail.com", new Date(), 3000.0, obj);

		SellerDAO sellerDao = DaoFactory.createSellerDao();

		System.out.println(seller);

	}

}

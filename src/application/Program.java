package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department obj = new Department(1, "TI");
		
		Seller seller = new Seller(21, "Bruno", "bruno@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
	}

}

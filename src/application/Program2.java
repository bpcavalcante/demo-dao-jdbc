package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entites.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Department dep = new Department(2, "Comercial");
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(dep);
		
		
	}

}

package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entites.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Department dep = new Department(2, "Comercial");
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("TEST 1 findById");
		
		dep = departmentDao.findById(3);
		
		System.out.println(dep);
		
		System.out.println();
		
		System.out.println("TEST 2 findAll");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department department : list) {
			System.out.println(department);
		}
		
		System.out.println();
		
		System.out.println("Test Insert department");
		Department department = new Department(6, "Logistica");
		departmentDao.insert(department);
		System.out.println("Inserted ! New id = " + department.getId());
		
	}

}

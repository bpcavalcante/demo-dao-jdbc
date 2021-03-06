package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entites.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		Department department = new Department(8, "Logistica");
		departmentDao.insert(department);
		System.out.println("Inserted ! New id = " + department.getId());
		
		System.out.println();
		
		System.out.println("Test update department");
		department = departmentDao.findById(6);
		department.setName("Biblioteca");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("Delete Department");
		
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}

}

package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dd = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department department = new Department(null, "Video Games");
		dd.insert(department);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department update ===");
		department.setName("Video GAMES");
		dd.update(department);
		System.out.println(department);
		
	}

}

package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		DepartmentDao dd = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: findById =======");
		Department dep = dd.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = dd.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		dd.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = dd.findById(1);
		dep2.setName("Food");
		dd.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		dd.deleteById(id);
		System.out.println("Delete completed");

	}

}

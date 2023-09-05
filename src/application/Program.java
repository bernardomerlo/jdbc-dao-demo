package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sd = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sd.findById(1);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(4, null);
		List<Seller> list = sd.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sd.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		//adiciona toda hora, só descomentar para inserir
		//System.out.println("\n=== TEST 4: seller insert ===");
		//Seller sellerNovo = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		//sd.insert(sellerNovo);
		//System.out.println("Inserted new Id = " + sellerNovo.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sd.findById(1);
		seller.setName("Martha Wayne");
		sd.update(seller);
		System.out.println("Update Complete");

		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete teste: ");
		int id = sc.nextInt();
		sd.deleteById(id);
		System.out.println("Delete Complete");
		
		
		sc.close();
		
	}

}

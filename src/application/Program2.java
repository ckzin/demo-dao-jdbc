package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert ===");
		Department dep = new Department(null, "Music");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== TEST 2: department findById ===");
		dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 3: department update ===");
		dep = departmentDao.findById(7);
		dep.setName("Photoshop");
		departmentDao.update(dep);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TEST 4: department delete ===");
		departmentDao.deleteById(14);
		System.out.println("Delete completed");
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department x : list) {
			System.out.println(x);
		}
	}

}

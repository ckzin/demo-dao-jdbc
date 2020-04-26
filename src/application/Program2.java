package application;

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
	}

}

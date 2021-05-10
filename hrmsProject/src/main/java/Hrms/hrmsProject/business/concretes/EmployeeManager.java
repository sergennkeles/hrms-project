package Hrms.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.EmployeeService;
import Hrms.hrmsProject.dataAccess.abstracts.EmployeeDao;
import Hrms.hrmsProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public void add(Employee employee) {
		
		this.employeeDao.save(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

}

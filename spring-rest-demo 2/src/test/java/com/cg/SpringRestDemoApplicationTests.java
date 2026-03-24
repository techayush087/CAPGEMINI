package com.cg;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeNotFoundException;
import com.cg.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {
	@Mock

	private IEmployeeRepo repo;

	@InjectMocks
	private EmployeeService service;

	@Test
	public void testAllEmployees() {

		List<EmployeeDTO> emps = new ArrayList<>();
		emps.add(new EmployeeDTO("Ayush", LocalDate.of(2003, 11, 12), 35000.0));
		emps.add(new EmployeeDTO("Abhay", LocalDate.of(2003, 1, 22), 75000.0));
		emps.add(new EmployeeDTO("Aman", LocalDate.of(2003, 9, 2), 4000.0));

		List<Employee> employees = new ArrayList<>();
		emps.forEach(e -> employees.add(EntityMapper.convertObjectToEntity(e)));
		when(repo.findAll()).thenReturn(employees);
		assertNotNull(service.getAllEmployee());

	}

	@Test
	public void testCreateEmployee() {
		EmployeeDTO emp = new EmployeeDTO("Ayush",LocalDate.of(2004, 10, 20),34000.0);
		Employee employee = EntityMapper.convertObjectToEntity(emp);
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(employee);
		assertNotNull(service.createEmployee(emp));
	}
	
	@Test
	public void testGetEmployeeById() {
		EmployeeDTO emp=new EmployeeDTO("Abhay",LocalDate.of(2003, 1,22),4000.0);
		emp.setEmployeeId(1001);
		Employee employee=EntityMapper.convertObjectToEntity(emp);
		Optional<Employee> op= Optional.of(employee);
		when(repo.findById(1001)).thenReturn(op);
		assertNotNull(service.getEmployee(1001));
		
		
	}
	
	@Test
	public void testGetEmployeeByIdException() {
		when(repo.findById(1100)).thenThrow(EmployeNotFoundException.class);
		assertThrows(EmployeNotFoundException.class,()->service.getEmployee(1100));
	}
	
	@Test
	public void testRemoveEmployeeFound() {
		
		EmployeeDTO emp=new EmployeeDTO("Abhay",LocalDate.of(2003, 1,22),4000.0);
		emp.setEmployeeId(1001);
		Employee employee=EntityMapper.convertObjectToEntity(emp);
		Optional<Employee> op= Optional.of(employee);
		
		if(op != null) {
		when(repo.findById(1001)).thenReturn(op);
		assertEquals("Employee Deleted",service.removeEmployee(1001));
		verify(repo,times(1)).deleteById(1001);
		}
		
		if(op==null) {
			assertEquals("Employee Not Found",service.removeEmployee(1001));
			verify(repo,never()).deleteById(1001);
		
		
		
	}
		
		
	
}
	
	
	@Test
	public void TestUpdateEmployee() {
		Employee emp= new Employee("Ayush",LocalDate.of(2003,04,03),35000.0);
		emp.setEmpid(1002);
		Optional<Employee> op=Optional.of(emp);
		when(repo.findById(1002)).thenReturn(op);
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);
		assertNotNull(service.updateEmployee(emp));
	}
	
	public void TestFindByName() {
		List<EmployeeDTO> emps = new ArrayList<>();
		emps.add(new EmployeeDTO("Ayush", LocalDate.of(2003, 11, 12), 35000.0));
		emps.add(new EmployeeDTO("Abhay", LocalDate.of(2003, 1, 22), 75000.0));
		emps.add(new EmployeeDTO("Aman", LocalDate.of(2003, 9, 2), 4000.0));

		List<Employee> employees = new ArrayList<>();
		emps.forEach(e -> employees.add(EntityMapper.convertObjectToEntity(e)));
		when(repo.findByName("Ayush")).thenReturn(employees);
		assertNotNull(service.getEmployeeByName("Ayush"));
	}
	
	

}

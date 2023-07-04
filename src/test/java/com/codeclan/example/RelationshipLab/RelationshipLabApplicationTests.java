package com.codeclan.example.RelationshipLab;

import com.codeclan.example.RelationshipLab.models.Assignment;
import com.codeclan.example.RelationshipLab.models.Department;
import com.codeclan.example.RelationshipLab.models.Employee;
import com.codeclan.example.RelationshipLab.models.Project;
import com.codeclan.example.RelationshipLab.repositories.AssignmentRepository;
import com.codeclan.example.RelationshipLab.repositories.DepartmentRepository;
import com.codeclan.example.RelationshipLab.repositories.EmployeeRepository;
import com.codeclan.example.RelationshipLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartment(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee = new Employee("John", "Smith", 101, department);
		employeeRepository.save(employee);

	}

	@Test
	public void canAssignEmployeeToProject(){
		Project project = new Project("Audit", 7);
		projectRepository.save(project);
		Assignment assignment = new Assignment(employeeRepository.getReferenceById(1L), project);
		assignmentRepository.save(assignment);
	}

}

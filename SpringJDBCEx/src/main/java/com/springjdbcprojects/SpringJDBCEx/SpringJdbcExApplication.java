package com.springjdbcprojects.SpringJDBCEx;

import com.springjdbcprojects.SpringJDBCEx.model.Student;
import com.springjdbcprojects.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student stud = context.getBean(Student.class);
		stud.setRollNo(4);
		stud.setName("Neela");
		stud.setMarks(89);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(stud);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}
}

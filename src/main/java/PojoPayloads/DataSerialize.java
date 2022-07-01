package PojoPayloads;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataSerialize {

		@Test
		public void createDatafromPOJO() throws JsonProcessingException {

			// Just create an object of Pojo class
			Sample employee = new Sample();

			employee.setFirstName("Yuvaraj");
			employee.setLastName("Loganathan");
			employee.setAge(24);
			employee.setGender("Male");
			employee.setSalary(26000);
			employee.setMarried(false);

			// Converting a Java class object to a JSON payload as string
			ObjectMapper objectmapper = new ObjectMapper();
			String employeeJSON = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);

			System.out.println(employeeJSON);

		}

		@Test
		public void getPojoFromObject() throws JsonProcessingException {

			// Just create an object of Pojo class
			Sample employee = new Sample();

			employee.setFirstName("Mark");
			employee.setLastName("Wood");
			employee.setAge(27);
			employee.setGender("Male");
			employee.setSalary(45893927);
			employee.setMarried(false);

			// Converting a Java class object to a JSON payload as string
			ObjectMapper objectmapper = new ObjectMapper();
			String employeeJSON = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
			
			// Converting json string to  class object
			Sample employeeObj = objectmapper.readValue(employeeJSON, Sample.class);
			System.out.println("FirstName - " + employeeObj.getFirstName());
			System.out.println("Last Name of employee : "+employeeObj.getLastName());
			System.out.println("Age of employee : "+employeeObj.getAge());
			System.out.println("Gender of employee : "+employeeObj.getGender());
			System.out.println("Salary of employee : "+employeeObj.getSalary());
			System.out.println("Marital status of employee : "+employeeObj.getMarried());

		}
	}


package PojoPayloads;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonArraySeril {

	public String completeJson;
	
	@Test
	public void JsonArraySerial() throws JsonProcessingException {
		//employee 1
		JsonArrayinPojo Yuvaraj= new JsonArrayinPojo();

		Yuvaraj.setFirstname("Yuvaraj");
		Yuvaraj.setLastname("Loganathan");
		Yuvaraj.setAge(24);
		Yuvaraj.setSalary(26000);
		Yuvaraj.setMarried(false);
		
		
		//employee 2
		JsonArrayinPojo ram= new JsonArrayinPojo();

		ram.setFirstname("Ram");
		ram.setLastname("kumar");
		ram.setAge(27);
		ram.setSalary(66000);
		ram.setMarried(true);
		
		
		//Employee3
		JsonArrayinPojo Logan= new JsonArrayinPojo();

		Logan.setFirstname("Logan");
		Logan.setLastname("perumal");
		Logan.setAge(34);
		Logan.setSalary(86000);
		Logan.setMarried(true);

		
		List <JsonArrayinPojo> allEmployee=new ArrayList<JsonArrayinPojo>();
		allEmployee.add(Yuvaraj);
		allEmployee.add(ram);
		allEmployee.add(Logan);
		
		
		ObjectMapper objmap=new ObjectMapper();
		
		completeJson=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(allEmployee);
		
		System.out.println(completeJson);
	}
	
	@Test
	public void getJsonArray() throws JsonMappingException, JsonProcessingException {
		ObjectMapper object=new ObjectMapper();
		List<JsonArrayinPojo>allEmployee=object.readValue(completeJson, new TypeReference<List<JsonArrayinPojo>>() {});
		for(JsonArrayinPojo emplo:allEmployee) {
			
			System.out.println("=========================================");
			System.out.println("FirstName - " + emplo.getFirstname());
			System.out.println("Last Name of employee : "+emplo.getLastname());
			System.out.println("Age of employee : "+emplo.getAge());
			System.out.println("Marriage Status: " +emplo.getMarried());
			System.out.println("Salary of employee : "+emplo.getSalary());
			

			System.out.println("=========================================");
			
		}
		
		
	}
}

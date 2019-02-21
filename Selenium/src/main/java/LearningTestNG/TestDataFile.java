package LearningTestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data")
	public static Object[][] testData(Method m){
		Object[][] obj = null;
		
		if(m.getName().equals("registerUser")) {
			
			obj = new Object[3][4];
			
		obj[0][0]="Abhishek";	
		obj[0][1]="Sharma";
		obj[0][2]="Test@gmail.com";
		obj[0][3]="12345";
		
		obj[1][0]="Anand";
		obj[1][1]="Mishra";
		obj[1][2]="Test1@gmail.com";
		obj[1][3]="123456";
		
		obj[2][0]="Prashant";
		obj[2][1]="Tyagi";
		obj[2][2]="Test2@gmail.com";
		obj[2][3]="1234567";
		
		
	}
		
		if(m.getName().equals("loginUser")) {
			
			obj = new Object[3][2];
			
			obj[0][0]="Test@gmail.com";
			obj[0][1]="12345";
			
			obj[1][0]="Test1@gmail.com";
			obj[1][1]="123456";
			
			obj[2][0]="Test2@gmail.com";
			obj[2][1]="1234567";
		}
		
		return obj;
	}


}

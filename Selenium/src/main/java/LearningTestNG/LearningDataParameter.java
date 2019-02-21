package LearningTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataParameter {
	
	@Test(dataProvider="testData")
	public void registerUser(String firstname,
							 String lastname,
							 String email,
							 String password) {
		
		System.out.println(firstname);	
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] testData(){
		Object[][] obj = new Object[3][4];
		
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
		
		return obj;
	}

}

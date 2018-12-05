package com.absa.pageObjectModel;
import org.openqa.selenium.By;

public class UserDetailsPage {	

	public static By  userlistTable = By.xpath("/html/body/table");
	
	public static By  clickAddUser = By.xpath("/html/body/table/thead/tr[2]/td/button");
	
	public static By  addUserDialogDisplayed = By.xpath("/html/body/div[3]/div[1]/h3");
	
	public static By  firstName = By.name("FirstName");
	
	public static By  lastName = By.name("LastName");
	
	public static By  userName = By.name("UserName");
	public static By  password = By.name("Password");
	public static By  optionRadios = By.name("optionsRadios");
	
	public static By  role = By.name("RoleId");
	public static By  email = By.name("Email");
	public static By  cellNumber = By.name("Mobilephone");
	public static By  saveUser = By.xpath("/html/body/div[3]/div[3]/button[2]");
	
}

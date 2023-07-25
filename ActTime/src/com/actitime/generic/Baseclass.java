package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class Baseclass {
public static WebDriver driver;
@BeforeTest
public void openBrower() {
	Reporter.log("openBrower",true);
	driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.quit();
}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("Login",true);
	FileLib f=new FileLib();
	String url = f.getPropertData("url");
	String un = f.getPropertData("username");
	String pw = f.getPropertData("password");
	driver.get(url);
	LoginPage l= new LoginPage(driver);
	l.setLogin(un, pw);
		
}
//public void taskButton() {
	//HomePage h=new HomePage(driver);
	//h.setTaskButton();
//}
@AfterMethod
public void logOut() {
	Reporter.log("logOut",true);
	HomePage h=new HomePage(driver);
	h.setLogoutButton();
	
}

}

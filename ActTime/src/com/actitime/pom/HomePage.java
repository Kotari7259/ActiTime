package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="container_tasks")
private WebElement taskbtn;
@FindBy(id="logoutLink")
private WebElement logOutbtn;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setTaskButton() {
	taskbtn.click();
	
}
public void setLogoutButton() {
	logOutbtn.click();
}

}

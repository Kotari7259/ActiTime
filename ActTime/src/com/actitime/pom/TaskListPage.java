package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement customerNewtbx;
@FindBy(xpath="(//textarea[@class='textarea'])[9]")
private WebElement customerDescriptiontbx;
@FindBy(xpath="//div[@class=\"comboboxButton\"]//div[@class='dropdownButton']")
private WebElement selectCompanyDropdownbtn;
@FindBy(xpath="//div[@class='searchItemList']//div[text()='Big Bang Company']")
private WebElement bigBangCompany;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomerBtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setAddNew() {
	addNewBtn.click();
}
public void setNewCustomer() {
	newCustomerBtn.click();
}
public void setCustomerName(String customerName) {
	customerNewtbx.sendKeys(customerName);
}
public void setCustomerDescription(String customerDescription) {
	customerDescriptiontbx.sendKeys(customerDescription);
}
public void setSelectCompany() {
	selectCompanyDropdownbtn.click();
	bigBangCompany.click();
}
public void setCreateCustomer() {
	createCustomerBtn.click();
}
}

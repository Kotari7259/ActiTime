package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListernerImplementation.class)
public class CustomerModule extends Baseclass {
public void testcreateCustomer() throws EncryptedDocumentException, IOException {
	Reporter.log("createCustomer",true);
	//Assert.fail();
	HomePage h=new HomePage(driver);
	h.setTaskButton();
	TaskListPage t=new TaskListPage(driver);
	t.setAddNew();
	t.setNewCustomer();
	FileLib f=new FileLib();
	String customerName = f.getExcelData("createCustomer", 1, 2);
	t.setCustomerName(customerName);
	String customerDescription = f.getExcelData("createCustomer", 1, 3);
	t.setCustomerDescription(customerDescription);
	t.setSelectCompany();
	t.setCreateCustomer();
	
}
}

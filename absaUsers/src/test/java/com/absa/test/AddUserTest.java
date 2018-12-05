package com.absa.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absa.database.entities.UserDetailsEntity;
import com.absa.database.utilities.retrieval.DataRetrieval;
import com.absa.utilities.BaseMethods;
import com.absa.utilities.UserDetailsUtil;

public class AddUserTest extends BaseMethods {

	@BeforeMethod
	public void initialiseTests() {
		initialise();
	}

	@Test
	public void navigateToTableList() {

		String table = UserDetailsUtil.navigateUserTable();

		assertEquals("User List Table", table);

	}

	@Test
	public void addUserTest() {

		UserDetailsEntity userDetailsEntity = (UserDetailsEntity) DataRetrieval.getInstance()
				.getPositiveData(new UserDetailsEntity());

		currentTestData.add(userDetailsEntity);

		UserDetailsUtil.populateUserDetails(userDetailsEntity);
		UserDetailsUtil.selectCustomerAAA();

		assertTrue(UserDetailsUtil.isAlertPresent());
	}

	@AfterMethod
	public void exitBrowser() {
		{
			driver.quit();
			driver = null;
		}
	}
}

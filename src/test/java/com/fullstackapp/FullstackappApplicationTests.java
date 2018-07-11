package com.fullstackapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fullstackapp.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class FullstackappApplicationTests {

	@Autowired
	private I18NService i18NService;
	
	@Test
	public void testMessageByLocalService() throws Exception
	{
		String expectedResult="Bootstrap starter template";
		String messageId="index.main.callout";
		String actual=i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected strings don't match", expectedResult, actual);
	}

}

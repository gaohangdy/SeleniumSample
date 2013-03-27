package jp.co.aurora.test.sample;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import jp.co.amway.aurora.test.util.AuroraTestCase;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/** Passed in firefox, chrome */
public class SampleKeyboard extends AuroraTestCase {
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSampleKeyboard() throws Exception {
		baseUrl = "http://www.google.com.hk/";
		driver.get(baseUrl + "/");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("thinkpad");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.TAB);
		driver.findElement(By.id("lst-ib")).submit();
		// ERROR: Caught exception [ERROR: Unsupported command [keyPress |
		// lst-ib | 13]]
	}
}

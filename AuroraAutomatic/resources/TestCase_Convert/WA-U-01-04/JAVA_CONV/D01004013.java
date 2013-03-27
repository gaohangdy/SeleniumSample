package jp.co.amway.aurora.test.loginwau0104test;

import jp.co.amway.aurora.test.util.AuroraTestCase;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D01004013 extends AuroraTestCase {
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	  @Test
  public void testD01004013() throws Exception {
    driver.get(baseUrl + "/aurora/source/ts/uc_common/view/WA-C-01-F012.html");
    driver.findElement(By.cssSelector("a.naviOpen.naviOpenBtn > div > span")).click();
    driver.findElement(By.id("aMenuLogin")).click();
    driver.findElement(By.linkText("�p�X���[�h��Y�ꂽ��")).click();
    driver.findElement(By.id("txtIboNumber")).clear();
    driver.findElement(By.id("txtIboNumber")).sendKeys("5243017");
    driver.findElement(By.id("chkHaveNoPinFlg")).click();
    driver.findElement(By.id("txtZipCodeThree")).clear();
    driver.findElement(By.id("txtZipCodeThree")).sendKeys("010");
    driver.findElement(By.id("txtZipCodeFour")).clear();
    driver.findElement(By.id("txtZipCodeFour")).sendKeys("0042");
    driver.findElement(By.id("txtPhoneOutTown")).clear();
    driver.findElement(By.id("txtPhoneOutTown")).sendKeys("03");
    driver.findElement(By.id("txtPhoneTown")).clear();
    driver.findElement(By.id("txtPhoneTown")).sendKeys("5428");
    driver.findElement(By.id("txtPhoneLocal")).clear();
    driver.findElement(By.id("txtPhoneLocal")).sendKeys("7000");
    new Select(driver.findElement(By.id("selBirthYear"))).selectByVisibleText("1974");
    new Select(driver.findElement(By.id("selBirthMonth"))).selectByVisibleText("6");
    new Select(driver.findElement(By.id("selBirthDay"))).selectByVisibleText("28");
    driver.findElement(By.cssSelector("#btnSetPassword > div")).click();
    assertEquals("�f�B�X�g���r���[�^�[�ԍ��i���q�l�ԍ��j���邢�͌l���̂����ꂩ���A���������͂���Ă���܂���B (JWS5337E)", closeAlertAndGetItsText());
  }

}

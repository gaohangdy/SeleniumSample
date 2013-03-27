package jp.co.amway.aurora.test.loginwau0104test;

import jp.co.amway.aurora.test.util.AuroraTestCase;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D01004010 extends AuroraTestCase {
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	  @Test
  public void testD01004010() throws Exception {
    driver.get(baseUrl + "/aurora/source/ts/uc_common/view/WA-C-01-F012.html");
    driver.findElement(By.cssSelector("a.naviOpen.naviOpenBtn > div > span")).click();
    driver.findElement(By.id("aMenuLogin")).click();
    driver.findElement(By.linkText("�p�X���[�h��Y�ꂽ��")).click();
    driver.findElement(By.id("txtIboNumber")).clear();
    driver.findElement(By.id("txtIboNumber")).sendKeys("5243017");
    driver.findElement(By.id("txtPin")).clear();
    driver.findElement(By.id("txtPin")).sendKeys("1061");
    driver.findElement(By.cssSelector("#btnSetPassword > div")).click();
    assertEquals("�f�B�X�g���r���[�^�[�ԍ��i���q�l�ԍ��j�܂��͈Ïؔԍ����A���������͂���Ă���܂���B (JWS5336E)", closeAlertAndGetItsText());
  }

}

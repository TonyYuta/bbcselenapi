/**
 *   File Name: Common.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 30, 2017
 *   
 */

package com.bbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Common //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class Common {

	WebDriver driver;
	WebElement we;
	
	//cssSelector
	public String homePageTab = "#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a";
	public String welcomeToBbComLabel = ".module.module--date.module--highlight > .module__title";
	
	
	// id

	
	// className
	
	public Common(WebDriver driver) {
		this.driver = driver;
	}
	
	public String navigateToHomePage() {
		
System.out.println("====== debug1 ==============");
		String result = "Welcome to BBC.com";
		
System.out.println("======= debug2 ===== we.getText() =========") ;

		//we = driver.findElement(By.cssSelector(homePageTab));
		driver.findElement(By.cssSelector("#orb-nav-links > ul > li.orb-nav-homedotcom.orb-w > a")).click();
System.out.println("======= debug3 ===== we.getText() =========" + we.getText()) ;

		we.click();
System.out.println("======= debug4 ===== we.getText() =========" + we.getText()) ;

		we = driver.findElement(By.cssSelector(welcomeToBbComLabel));
System.out.println("======= debug5 ===== we.getText() =========" + we.getText()) ;

		return result = we.getText();
	}
//	
//	public String logOut() {
//		String result = "Log Out";
//		action = new Actions(driver);		
//		we = driver.findElement(By.cssSelector(labelMyAccount));
//		action.moveToElement(we).build().perform();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		driver.findElement(By.cssSelector(logOutBtn)).click();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		return result;
//	}
//		
//	public String navigateToAllProductsPage() {
//		action = new Actions(driver);
//		we = driver.findElement(By.cssSelector(productsTab));
//		action.moveToElement(we).build().perform();
//		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//		driver.findElement(By.cssSelector(allProductsTab)).click();
//		return driver.getCurrentUrl();
//	}
//	

	

	
}

package com.BaseClass_Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Utility.Base_Class;

public class Automation_Base_Runner extends Base_Class{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = get_Browser("chrome");
		
		get_Url("http://automationpractice.com/index.php");
		
		//Sign In
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		click_Button(signin);
		
		//Email
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		send_Keys(email, "walterwhite20@gamil.com");
		
		//Password
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		send_Keys(pwd, "Walte#08");
		
		//Sign In
		WebElement sign = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		click_Button(sign);
		
		//Women
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		click_Hold(women);
		
		//TShirt
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		click_Button(tshirt);
		
		//Image
		WebElement img1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		click_Hold(img1);
		
		//Add to Cart
		WebElement cart1 = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		click_Button(cart1);
		Thread.sleep(5000);
		
		//Checkout1
		WebElement checkout1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click_Button(checkout1);
		//Thread.sleep(5000);
		
		//summary
		WebElement Quantity1 = driver.findElement(By.xpath("//a[@title='Add']"));
		click_Button(Quantity1);
		//Thread.sleep(5000);
		
		//women
		WebElement women2 = driver.findElement(By.xpath("//a[@title='Women']"));
		click_Hold(women2);
		
		//Blouses
		WebElement blouse = driver.findElement(By.xpath("//a[@title='Blouses']"));
		click_Button(blouse);
		
		//image2
		WebElement img2 = driver.findElement(By.xpath("//img[@title='Blouse']"));
		click_Hold(img2);
		
		//Add to cart
		WebElement cart2 = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		click_Button(cart2);
		Thread.sleep(5000);
		
		//CheckOut2
		WebElement checkout2 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click_Button(checkout2);
		
		//plus
		WebElement plus2 = driver.findElement(By.xpath("(//a[@title='Add'])[2]"));
		click_Button(plus2);
		
//		//Subtract
//		WebElement subtract = driver.findElement(By.xpath("(//a[@title='Subtract'])[2]"));
//		click_Button(subtract);
		Thread.sleep(5000);
		
		//Dresses
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		click_Hold(dresses);
		Thread.sleep(5000);
		
		//Casual Dress
		WebElement cdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		click_Button(cdress);
		
		//image3
		WebElement img3 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		click_Hold(img3);
		
		// Add to cart
		WebElement cart3 = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		click_Button(cart3);
		Thread.sleep(5000);

		// CheckOut3
		WebElement checkout3 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click_Button(checkout3);

		// plus
		WebElement plus3 = driver.findElement(By.xpath("(//a[@title='Add'])[2]"));
		click_Button(plus3);
		
		//Checkout
		WebElement processed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click_Button(processed);
		
		//Address
		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		click_Button(address);
		
		//Agree
		WebElement agree = driver.findElement(By.xpath("//input[@id='cgv']"));
		click_Button(agree);
		Thread.sleep(5000);
		
		//Carrier
		WebElement carrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		click_Button(carrier);
		
		//BankWire
		WebElement bankwire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		click_Button(bankwire);
		
		//Confirm
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click_Button(confirm);
		
		System.out.println("Order Placed for all three dresses");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

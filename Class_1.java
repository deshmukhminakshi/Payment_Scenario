package fiveScenarios_ofPayment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class_1 extends Launch_And_Quit
{
    @Test
    public void credit_card() throws InterruptedException
    {
    	WebElement se=driver.findElement(By.id("twotabsearchtextbox"));
	    se.sendKeys("Kurtis for women");
	    Thread.sleep(4000);
	    List <WebElement> list_1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count=list_1.size();
	    System.out.println(count);
	    list_1.get(7).click();
	    List <WebElement> list_2= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	    int count_2=list_2.size();
	    Thread.sleep(3000);
	    System.out.println(count_2);
	    list_2.get(4).click();
        Thread.sleep(4000);
        String parent=driver.getWindowHandle();
 	    System.out.println("parent" +parent);
        Set<String> parent_child=driver.getWindowHandles();
        System.out.println("parent_child" +parent_child);
        Iterator<String> pc=parent_child.iterator();
	    String id_1=pc.next();
	    System.out.println(id_1);
	    String id_2=pc.next();
	    System.out.println(id_2);
	    driver.switchTo().window(id_2);
	    Thread.sleep(3000);
	    WebElement buy_now=driver.findElement(By.id("buy-now-button"));
	    buy_now.click();
	    WebElement e_mail=driver.findElement(By.id("ap_email"));
	    e_mail.sendKeys("7350904236");
	    Thread.sleep(3000);
	    WebElement continue_button=driver.findElement(By.id("continue"));
	    continue_button.click();
	    WebElement password=driver.findElement(By.id("ap_password"));
	    password.sendKeys("Minakshi@1234");
	    WebElement sign_in=driver.findElement(By.id("signInSubmit"));
	    sign_in.click();
	    Thread.sleep(3000);
	    WebElement use_this_add=driver.findElement(By.xpath("//span[@id='shipToThisAddressButton']"));
	    use_this_add.click();
	    Thread.sleep(3000);
	    //WebElement card_1=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[1]"));
	    WebElement card_details=driver.findElement(By.xpath("(//div[@class='a-fixed-left-grid']//div[@class='a-fixed-left-grid-col a-col-left'])[2]"));
	    card_details.click();
	    WebElement enter_card_details=driver.findElement(By.partialLinkText("Enter card details"));
	    enter_card_details.click();
    }
}

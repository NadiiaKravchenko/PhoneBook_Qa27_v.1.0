import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditContactTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        if(isElement(By.cssSelector("[href='/login']"))){
            login("Mona447233@mail.com","Mona12$447233");
        }
    }
@Test
    public void editTest(){
        wd.findElement(By.xpath("//a[text()='CONTACTS']")).click();
        wd.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();

        wd.findElement(By.xpath("//button[text()='Edit']")).click();
        //String text= wd.findElement(By.xpath("//input[@placeholder='Name']")).getText();
    WebElement name= wd.findElement(By.xpath("//input[@placeholder='Name']"));
        String text2= wd.findElement(By.xpath("//input[@placeholder='Name']")).getAttribute("value");
    System.out.println(text2);
    name.click();
    name.sendKeys("&");


}

}
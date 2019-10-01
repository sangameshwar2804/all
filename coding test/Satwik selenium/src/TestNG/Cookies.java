package TestNG;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Set<Cookie> cookies=driver.manage().getCookies(); //capture all cookies from the bowser
	System.out.println(cookies.size());// print the size of cookies
	//for(Cookie cookie:cookies) {//read and print all the cookies
		//System.out.println(cookie.getName()+" "+cookie.getValue());//printi all the cookie and value
	//}
	//System.out.println(driver.manage().getCookieNamed("wd"));
	Cookie cobj=new Cookie("wbl","12345678");
	driver.manage().addCookie(cobj);
	System.out.println(cookies.size());
	for(Cookie cookie:cookies) {//read and print all the cookies
			System.out.println(cookie.getName()+" "+cookie.getValue());//printi all the cookie and value
		}
}
}

package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Walmart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.walmart.com/ip/Acer-CB3-532-C47C-15-6-Chromebook-Chrome-OS-Intel-Celeron-N3060-Dual-Core-Processor-2GB-RAM-16GB-Internal-Storage/54518466?findingMethod=wpa&requestUUID=73206831-d19f-4bb1-a617-1deddc2a9af7&tgtp=0&cmp=20041&relRank=0&tax=0&pt=sp&slr=F55CDC31AB754BB68FE0B39041159D63&adgrp=21220&bt=1&plmt=1100x200_T-C-OG_TI_5-5_Brand-Amplifier&wpa_qs=RDCRjr-WEolVzjkPOu6kXjz804kI1oOwkl-lnZ0cDY4NYY2SHSk-NYjQCPMEnqUAsHQADLK7ykTqNfIfodSz5XAsJnIr178ci2sbpob0vPl0ZG1xT9wAGu7djbxA6ANj&bkt=__bkt__&tn=WMT&mLoc=top&pgid=laptops&isSlr=false&itemId=54518466&relUUID=73206831-d19f-4bb1-a617-1deddc2a9af7&adUid=b72c3aee-c331-4cde-b64d-08d1a8b1e894&adiuuid=61dfbfb0-727d-459b-923b-34b90ae00dba&adpgm=wpa&pltfm=desktop");
WebElement chose=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[3]/div[4]/div[2]/div[1]/div/div/div/div[12]/div/div/div[1]/select"));
Select s=new Select(chose);
s.selectByIndex(1);
driver.manage().window().maximize();
Thread.sleep(2000);
}
}

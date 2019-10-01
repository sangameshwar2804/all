package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.runner.Describable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;

public class Capabilities extends Utils {
	public static AndroidDriver<WebElement> driver;
	Properties property;
	FileInputStream fs;
	AppiumDriverLocalService appiumServer;
	String appiumServiceUrl;
	AppiumDriverLocalService services;

	public void getCaps() throws JsonIOException, JsonSyntaxException, FileNotFoundException, MalformedURLException {
		JsonParser parser = new JsonParser();
		Utils.setProperties("capabilities.json");
		Object objecct = parser.parse(new FileReader(path));
		JsonObject jsonObject = (JsonObject) objecct;
		String deviceName = (String) jsonObject.get("deviceName").toString();
		String app = (String) jsonObject.get("app").toString();
		String appPackage = (String) jsonObject.get("appPackage").toString();
		String appActivity = (String) jsonObject.get("appActivity").toString();
		String url = (String) jsonObject.get("url").toString();
		String platformName = (String) jsonObject.get("platformName").toString();
		services = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/usr/local/bin/node")).withAppiumJS(new File("/usr/loca/bin/appium"))
				.withIPAddress("127.0.0.1").usingPort(4725).withArgument(new ServerArgument() {

					public String getArgument() {

						return "-avd";
					}
				}, deviceName));
		services.start();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		capabilities.setCapability("app", app);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		driver = new AndroidDriver<WebElement>(new URL(url), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
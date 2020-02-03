package com.utilities;

import java.io.File;
import java.io.IOException;

//import org.apache.maven.surefire.shade.common.org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.TestBase;

public class TestUtils extends TestBase {
	public static String screenshotname;

	public static void screenShot() throws Exception {
		File scfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		screenshotname = "error.jpg";

	//	FileUtils.copyFile(scfile,new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties" + screenshotname));
	}

}

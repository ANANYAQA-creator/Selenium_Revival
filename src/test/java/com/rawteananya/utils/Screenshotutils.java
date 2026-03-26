package com.rawteananya.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshotutils {

    public static String capture(WebDriver driver, String testName) {

        // Create screenshots folder if not exists
        File folder = new File("screenshots");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Take Screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Create readAble TimeStamp
        String timeStamp = new SimpleDateFormat("YYYY-MM-DD_HH-mm-ss").format(new Date());

        // Create Filepath
        String filePath = "screenshots/" + testName + "_" + timeStamp + ".png";
        // Save file
        try {
            Files.copy(src.toPath(), Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }
}

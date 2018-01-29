package com.revature.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSClicker {
	public static void executeJSClick(WebDriver wd, WebElement el) {
        JavascriptExecutor executor = (JavascriptExecutor) wd;
        executor.executeScript("arguments[0].click();", el);
    }
}

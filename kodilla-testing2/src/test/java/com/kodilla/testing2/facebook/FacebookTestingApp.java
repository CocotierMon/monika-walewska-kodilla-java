package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_COOKIES = "//div[contains(@class, \"_9fiw\")]/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECT_COOKIES)).isDisplayed());

        WebElement clickButton = driver.findElement(By.xpath(XPATH_SELECT_COOKIES));
        clickButton.click();

        while (!driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).isDisplayed());

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccount.click();

        Thread.sleep(1000);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBirthDay = new Select(selectDay);
        selectBirthDay.selectByIndex(5);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBirthMonth = new Select(selectMonth);
        selectBirthMonth.selectByIndex(10);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBirthYear = new Select(selectYear);
        selectBirthYear.selectByValue("1998");
    }
}

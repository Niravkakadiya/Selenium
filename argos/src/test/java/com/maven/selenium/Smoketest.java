package com.maven.selenium;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SmokeTest extends Hooks {

    @Test
        public void searchTest(){
        //search
        driver.findElement(By.id ("searchTerm" ))
                .sendKeys(Keys.ENTER);

        //Assert-1
        String url = driver.getCurrentUrl();
        assertThat((reason:"Not")
        driver
    }
}

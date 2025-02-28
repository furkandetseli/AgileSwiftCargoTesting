package tests.K01_MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AgileSwiftCargo;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class T01_HeaderButtonKontrol {

    @Test(groups = "E2E")
    public void alisverisTesti(){

        //1- sitenin anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        //2- header butonlarını tek tek kontrol edin
        AgileSwiftCargo agileSwiftCargo = new AgileSwiftCargo();

        agileSwiftCargo.homeButton.click();

        agileSwiftCargo.pricingButton.click();

        agileSwiftCargo.trackingButton.click();

        agileSwiftCargo.blogsButton.click();

        agileSwiftCargo.aboutButton.click();

        agileSwiftCargo.faqButton.click();

        agileSwiftCargo.contactButton.click();

        //7- sayfayi kapatin
        Driver.quitDriver();


    }
    
}

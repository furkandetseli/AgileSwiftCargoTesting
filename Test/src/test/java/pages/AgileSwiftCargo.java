package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AgileSwiftCargo {

    public AgileSwiftCargo(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[1]/a")
    public WebElement homeButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[2]/a")
    public WebElement pricingButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[3]/a")
    public WebElement trackingButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[4]/a")
    public WebElement blogsButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[5]/a")
    public WebElement aboutButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[6]/a")
    public WebElement faqButton;

    @FindBy(xpath = "//*[@id=\"offcanvasDarkNavbar\"]/div[2]/ul/li[7]/a")
    public WebElement contactButton;

    @FindBy(xpath = "/html/body/section[1]/nav/div/div[3]/ul/li[1]/a")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/section[1]/nav/div/div[3]/ul/li[2]/a")
    public WebElement registerButton;



    @FindBy(xpath = "//*[@*='prod-img']")
    public List<WebElement> bulunanUrunElementleriList;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;

    @FindBy(xpath = "(//span[.='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginSayfasiPasswordKutusu;

    @FindBy(id = "submitlogin")
    public WebElement loginSayfasiSubmitButonu;

    @FindBy(xpath = "//span[.='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "//button[@class='add-to-cart']")
    public WebElement addToCartButonu;

    @FindBy(xpath = "(//span[.='Your Cart'])[1]")
    public WebElement yourCartElementi;

    @FindBy(xpath = "//*[@*='product-title text-center']")
    public WebElement sepettekiUrunIsimElementi;

    @FindBy(xpath = "//*[@*='product-count-text']")
    public WebElement aramaSonucElementi;


}

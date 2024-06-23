package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BestBrandsAndOurLatestBlogPage {

    public BestBrandsAndOurLatestBlogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//div[@class=\"heading-lg\"])[6]")
    public WebElement topBrandsText;

    @FindBy(xpath = "//a[@class=\"brandbox\"]")
    public List<WebElement> numberOfTopBrandsList;

    @FindBy(xpath = "//a[@class=\"brandbox\"]")
    public WebElement benefitsOfIndoorPlantsBlogProduct;

    @FindBy(xpath = "//a[@class=\"brandbox\"]")
    public WebElement bestSportShoesBlogProduct;

    @FindBy(xpath = "//a[@class=\"brandbox\"]")
    public WebElement bestFurnitureBlogProduct;


    @FindBy(xpath = "//a[@class=\"brandbox\"]")
    public WebElement smartWorldsBlogProduct;






































}

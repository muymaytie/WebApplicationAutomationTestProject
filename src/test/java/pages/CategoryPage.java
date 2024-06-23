package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CategoryPage {

    public CategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//li[@class=\"has-sub\"])[1]")
    public WebElement electronicCategoryLink;

    @FindBy(xpath = "//*[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> electronicCategoryProductFoundList;

    @FindBy(xpath = "(//li[@class=\"has-sub\"])[2]")
    public WebElement menFashionCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> menFashionCategoryProductFoundList;

    @FindBy(xpath = "(//li[@class=\"has-sub\"])[3]")
    public WebElement womenFashionCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> womenFashionCategoryProductFoundList;


    @FindBy(xpath = "(//li[@class=\"has-sub\"])[4]")
    public WebElement shoseCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> shoseCategoryProductFoundList;

    @FindBy(xpath = "(//li[@class=\"has-sub\"])[5]")
    public WebElement furnitureCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> furnitureCategoryProductFoundList;


    @FindBy(xpath = "(//li[@class=\"has-sub\"])[6]")
    public WebElement travelCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> travelCategoryProductFoundList;

    @FindBy(xpath = "(//li[@class=\"has-sub\"])[7]")
    public WebElement kidsWearCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> kidsWearCategoryProductFoundList;

    @FindBy(xpath = "(//*[text()='Boys'])[1]")
    public WebElement kidsWearBoysLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> kidsBoysCategoryProductFoundList;

    @FindBy(xpath = "(//*[text()='Girls'])[1]")
    public WebElement kidsWearGirlsLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> kidsGirlsCategoryProductFoundList;

    @FindBy(xpath = "(//li[@class=\"has-sub\"])[8]")
    public WebElement groceryCategoryLink;

    @FindBy(xpath = "//div[@class=\"product-box mb-2 pb-1\"]")
    public List<WebElement> groceryCategoryProductFoundList;





































}

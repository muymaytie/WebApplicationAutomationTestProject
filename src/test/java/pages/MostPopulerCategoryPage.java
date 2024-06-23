package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MostPopulerCategoryPage {


    public MostPopulerCategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "((//*[@class=' product prod-grid-col5 ']) [3] // *[@class='product-box my-2  py-1'])[1]")
    public WebElement dellCoreElement;

    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [3] // *[@class='product-box my-2  py-1']")
    public List<WebElement> electronicCategoryProductsList;

    @FindBy(xpath = "(//label[@class=\"category-name\"])[2]")
    public WebElement menFashionCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [4] // *[@class='product-box my-2  py-1']")
    public List<WebElement> menFashionCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[3]")
    public WebElement womenFashionCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [5] // *[@class='product-box my-2  py-1']")
    public List<WebElement> womenFashionCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[4]")
    public WebElement shoesCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [6] // *[@class='product-box my-2  py-1']")
    public List<WebElement> shoesCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[5]")
    public WebElement furnitureCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [7] // *[@class='product-box my-2  py-1']")
    public List<WebElement> furnitureCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[6]")
    public WebElement travelCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [8] // *[@class='product-box my-2  py-1']")
    public List<WebElement> travelCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[7]")
    public WebElement kidsWearCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [9] // *[@class='product-box my-2  py-1']")
    public List<WebElement> kidsWearCategoryProductsList;


    @FindBy(xpath = "(//label[@class=\"category-name\"])[8]")
    public WebElement groceryCategory;
    @FindBy(xpath = "(//*[@class=' product prod-grid-col5 ']) [10] // *[@class='product-box my-2  py-1']")
    public List<WebElement> groceryCategoryProductsList;





























}

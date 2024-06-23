package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ShopBuyCategoryPage {

    public ShopBuyCategoryPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[7]")
    public WebElement electronicsCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> electronicsCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[8]")
    public WebElement menFashionCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> menFashionCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[9]")
    public WebElement womanFashionCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> womanFashionCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[10]")
    public WebElement shoseCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> shoseCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[11]")
    public WebElement furniturCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> furniturCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[12]")
    public WebElement travelCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> travelCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//button[@type=\"button\"])[4]")
    public WebElement  scrollButton;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[13]")
    public WebElement kidsWearCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> kidsWearCategoryActualNumberOfProductList;

    @FindBy(xpath = "(//div[@class=\"cate-img gray-circle\"])[14]")
    public WebElement groceryCategory;
    @FindBy(xpath = "//a[@class=\"prod-title mb-3 \"]")
    public List<WebElement> groceryCategoryActualNumberOfProductList;























}

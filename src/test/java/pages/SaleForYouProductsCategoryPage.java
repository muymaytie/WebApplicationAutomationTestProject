package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SaleForYouProductsCategoryPage {

    public SaleForYouProductsCategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]")
    public List<WebElement> saleForYouCategoryProductsList;

    @FindBy(xpath = "(//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]//*[@class=\"prod-img\"])[1]")
    public WebElement nikeSneakerGrayProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement nikeSneakerGrayProductActualName;

    @FindBy(xpath = "(//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]//*[@class=\"prod-img\"])[2]")
    public WebElement appleHeadphoneWhiteProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement appleHeadphoneWhiteProductActualName;

    @FindBy(xpath = "(//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]//*[@class=\"prod-img\"])[3]")
    public WebElement infiniteSmartPhoneProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement infiniteSmartPhoneProductActualName;

    @FindBy(xpath = "(//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]//*[@class=\"prod-img\"])[4]")
    public WebElement blueSunHatsProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement blueSunHatsProductActualName;

    @FindBy(xpath = "(//div[@class=\"product-box slider-product-box  mb-3 mt-3 \"]//*[@class=\"prod-img\"])[5]")
    public WebElement bluePartyWearProduct;
    @FindBy(xpath = "//div[@class=\" heading-sm mb-4\"]")
    public WebElement bluePartyWearProductActualName;











































}

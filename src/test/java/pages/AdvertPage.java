package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdvertPage {

    public AdvertPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class=\"banner-slide bg-img sub-slider justify-content-center mb-4\"])[1]")
    public WebElement specialOfferAdvert;

    @FindBy(xpath = "(//div[@class=\"banner-slide bg-img sub-slider justify-content-center mb-4\"])[2]")
    public WebElement menFashionAdvert;

    @FindBy(xpath = "(//div[@class=\"banner-wrapper\"])[1]")
    public WebElement casualSportShoseAdverts;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[1]")
    public WebElement saleOnlyTodayAdvert;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[2]")
    public WebElement springStyleAdvert;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[3]")
    public WebElement especialMakeupAdvert;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[4]")
    public WebElement dgiDronesAdvert;

    @FindBy(xpath = "(//img[@class=\"img-fluid lazy\"])[5]")
    public WebElement dslrCameraAdvert;
























































}

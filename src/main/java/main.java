import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class main {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("webinar.test@gmail.com");

        WebElement fieldPass = driver.findElement(By.id("passwd"));
        fieldPass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(By.className("ladda-button"));
        button.click();




        Sleep();

        WebElement Dashboard = driver.findElement(By.id("tab-AdminDashboard"));
        // Dashboard.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: 1 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        Orders.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: 2 "+ driver.getTitle()+"\n");

        Sleep();


        WebElement Catalog = driver.findElement(By.id("subtab-AdminCatalog"));
        Catalog.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: 3 "+ driver.getTitle()+"\n");

        Sleep();

        //!!!!!!!!
//        WebElement Customer = driver.findElement(By.linkText("account_circle"));
//                By.className()
//        WebElement Customer = driver.findElement(By.className("link-levelone"));

        WebElement Customer = driver.findElement(By.partialLinkText("Клиенты"));
        Customer.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: 4 "+ driver.getTitle()+"\n");

        Sleep();

        //!!!!!!!

        WebElement Threads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        Threads.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 5 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Stats = driver.findElement(By.id("subtab-AdminStats"));
        Stats.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 6 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement ModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        ModulesSf.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 7 "+ driver.getTitle()+"\n");

        Sleep(); //System.out.println("Page title is: "+ driver.getTitle());

        WebElement Themes = driver.findElement(By.partialLinkText("Design"));
        Themes.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 8 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Shipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        Shipping.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 9 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Payment = driver.findElement(By.id("subtab-AdminParentPayment"));
        Payment.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 10 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement International = driver.findElement(By.id("subtab-AdminInternational"));
        International.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 11 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement ShopParameters = driver.findElement(By.id("subtab-ShopParameters"));
        ShopParameters.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 12 "+ driver.getTitle()+"\n");

        Sleep();

        WebElement AdvancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        AdvancedParameters.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: 13 "+ driver.getTitle()+"\n");

        driver.quit();
    }

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }

    public static void  Sleep(){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
 /*   public static void  Sleep2(){
        try {
            Thread.sleep(20000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }*/
}

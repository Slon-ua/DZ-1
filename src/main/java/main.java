import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        Orders.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

//        WebElement Catalog = driver.findElement(By.id("subtab-AdminCatalog"));
//        Catalog.click();
//        System.out.println("Page title is: "+ driver.getTitle());
//        driver.navigate().refresh();
//        System.out.println("Update title is: "+ driver.getTitle()+"\n");
//
//        Sleep();

        WebElement Customer = driver.findElement(By.id("subtab-AdminParentCustomer"));
        Customer.click();
        System.out.println("Page title is: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Threads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        Threads.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Stats = driver.findElement(By.id("subtab-AdminStats"));
        Stats.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        // WebElement ModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        // ModulesSf.click();
        // System.out.println("Page title is: "+ driver.getTitle());
        // Sleep2();
        // driver.navigate().refresh();
        // System.out.println("Update title is: "+ driver.getTitle()+"\n");

        // Sleep2();System.out.println("Page title is: "+ driver.getTitle());

       WebElement Themes = driver.findElement(By.id("subtab-AdminParentThemes"));
       Themes.click();
       System.out.println("Page title is: "+ driver.getTitle());
       Sleep();
       driver.navigate().refresh();
       System.out.println("Update title is: "+ driver.getTitle()+"\n");

       Sleep();

        WebElement Shipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        Shipping.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement Payment = driver.findElement(By.id("subtab-AdminParentPayment"));
        Payment.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement International = driver.findElement(By.id("subtab-AdminInternational"));
        International.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement ShopParameters = driver.findElement(By.id("subtab-ShopParameters"));
        ShopParameters.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();

        WebElement AdvancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        AdvancedParameters.click();
        System.out.println("Page title is: "+ driver.getTitle());
        Sleep();
        driver.navigate().refresh();
        System.out.println("Update title is: "+ driver.getTitle()+"\n");

        Sleep();



    }

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

    public static void  Sleep(){
        try {
              Thread.sleep(1500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    public static void  Sleep2(){
        try {
            Thread.sleep(20000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}

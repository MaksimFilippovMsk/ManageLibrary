package marketplaceclient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainSelenium {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "путь/к/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Открытие страницы
            driver.get("https://market.yandex.ru/");

            // Поиск элемента и ввод текста
            WebElement searchBox = driver.findElement(By.name("text"));
            searchBox.sendKeys("crime and punishment");
            searchBox.submit();





            // Ожидание результатов
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // find book price field

            WebElement element = driver.findElement(By.cssSelector("span.ds-text.ds-text_weight_bold.ds-text_color_price-term"));
            String text = element.getText();
            System.out.println(text);

            wait.until(ExpectedConditions.titleContains("Selenium Java"));

            System.out.println("Заголовок страницы: " + driver.getTitle());

        } finally {
            // Закрытие браузера
            driver.quit();
        }
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutenticacaoUnipe {
    // Acessar -> http://unipe.br/
    // Clicar no elemento com xpath  //button[@type="button"]
    // Clicar no elemento com xpath  //h1[text()="ACESSE AQUI O SEU PORTAL ACADÊMICO"] ou //h1[.="ACESSE AQUI O SEU PORTAL ACADÊMICO"]
    // Digitar matricula no elemento com xpath //input[@name="txtUser"]
    // Digitar senha no elemento com xpath //input[@name="txtPass"]
    // Clicar no elemento com xpath //input[@name="btnLogin"]

    private WebDriver navegador;
    private WebDriverWait espera;

    @Before
    public void setUp(){
        navegador = new FirefoxDriver();
        navegador.get("http://unipe.br/");
        espera = new WebDriverWait(navegador, 10);
    }

    @Test
    public void autenticacao(){
        navegador.findElement(By.xpath("//button[@type=\"button\"]")).click();
        navegador.findElement(By.xpath("//h1[text()=\"ACESSE AQUI O SEU PORTAL ACADÊMICO\"]")).click();
        //navegador.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        System.out.println(navegador.getWindowHandles());
        navegador.switchTo().window((String) navegador.getWindowHandles().toArray()[1]);
        espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"txtUser\"]")));
        navegador.findElement(By.xpath("//input[@name=\"txtUser\"]")).sendKeys("1720020956");
        navegador.findElement(By.xpath("//input[@name=\"txtPass\"]")).sendKeys("11235813");
        navegador.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}

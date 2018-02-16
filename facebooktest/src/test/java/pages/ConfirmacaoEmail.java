package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmacaoEmail {
    public WebDriver navegador;

    ConfirmacaoEmail(WebDriver navegador){
        this.navegador = navegador;
    }

    public ConfirmacaoEmail agoraNao(){
        navegador.findElement(By.cssSelector("layerCancel _4jy0 _4jy3 _517h _51sy _42ft")).click();
        return this;
    }

    public ConfirmacaoEmail timeLine(){
        navegador.findElement(By.xpath("//*[@id=\"bluebar_profile_and_home\"]/div[1]/div/a/span/span")).click();
        return this;
    }
}

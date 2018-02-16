package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaCadastro {

    public WebDriver navegador;

    public PaginaCadastro(WebDriver navegador) {
        this.navegador = navegador;
    }

    public PaginaCadastro inserirNome(String nome) {
        navegador.findElement(By.name("firstname")).sendKeys(nome);
        return this;
    }

    public PaginaCadastro inserirSobrenome(String sobrenome) {
        navegador.findElement(By.name("lastname")).sendKeys(sobrenome);
        return this;
    }

    public PaginaCadastro inserirEmail(String email) {
        navegador.findElement(By.name("reg_email__")).sendKeys(email);
        navegador.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
        return this;
    }

    public PaginaCadastro inserirSenha(String senha) {
        navegador.findElement(By.name("reg_passwd__")).sendKeys(senha);
        return this;
    }

    public PaginaCadastro dataDeNascimento(String dia, String mes, String ano) {
        WebElement campoDia = navegador.findElement(By.id("day"));
        WebElement campoMes = navegador.findElement(By.id("month"));
        WebElement campoAno = navegador.findElement(By.id("year"));
        new Select(campoDia).selectByValue(dia);
        new Select(campoMes).selectByValue(mes);
        new Select(campoAno).selectByValue(ano);
        return this;
    }

    public PaginaCadastro sexoGenero(String genero) {
        if (genero == "Masculino") {
            navegador.findElement(By.id("u_0_4")).click();
        } else {
            navegador.findElement(By.id("u_0_3")).click();
        }
        return this;
    }

    public ConfirmacaoEmail criarConta(){
        return new ConfirmacaoEmail(navegador);
//        navegador.findElement(By.id("u_0_y")).click();
    }

}

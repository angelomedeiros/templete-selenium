package tests;

import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PaginaCadastro;


public class CadastroFacebookTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void cadastrarUsuarioFacebook(){
        new PaginaCadastro(navegador)
                .inserirNome("Angelo")
                .inserirSobrenome("Medeiros")
                .inserirEmail("angelomedeiros1005@gmail.com")
                .inserirSenha("1wdv4esz")
                .dataDeNascimento("14","11","1995")
                .sexoGenero("Feminino")
                .criarConta()
                .agoraNao()
                .timeLine()               ;

    }

    @After
    public void tearDown(){

    }

}

package pe.com.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.test.system.selenium.driver.VisorDriver;

public class BienvenidaPage {
	private By linkMenu = By.xpath("/html/body/section/div[1]/div");
	private By linkModAlmacen = By.xpath("/html/body/section/div[1]/nav/ul/li/span");
	private By linkMntCategoria = By.linkText("Playlist");
	private WebDriver webdriver = null;
	
	//sistemas que tienen un loggeo debe ser con webdriver
	public BienvenidaPage(WebDriver webdriver) {
		this.webdriver = webdriver;
	}
	
	public void hacerCleanMenuPrincipal() throws Exception {
		this.webdriver.findElement(linkMenu).click();
		Thread.sleep(2000);
	}
	
	public void hacerClickModAmacen() throws Exception {
		this.webdriver.findElement(linkModAlmacen).click();
		Thread.sleep(2000);
	}
	
	public void hacerClickMntCategoria() throws Exception {
		this.webdriver.findElement(linkMntCategoria).click();
		Thread.sleep(2000);
	}
	
	public void cerrarPagina() throws Exception {
		VisorDriver.cerrarPagina(this.webdriver);
	}
	
	public WebDriver getWebDriver() {
		return this.webdriver;
	}
}

package pe.com.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.test.system.selenium.driver.VisorDriver;

public class ActualizarCategoriaPage {
	
	private WebDriver webDriver = null;
	private By campoNombre = By.id("txtNombre");
	private By botonGuardar = By.id("btnGuardar");
	private By botonVolver = By.id("btnVolver");
	private By mensajeText = By.id("messages");

	public ActualizarCategoriaPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void escribirCampoNombre(String nombre) throws Exception {
		this.webDriver.findElement(campoNombre).clear();
		this.webDriver.findElement(campoNombre).sendKeys(nombre);
		Thread.sleep(1000);
	}

	public String hacerClickBotonGuardar() throws Exception {
		this.webDriver.findElement(botonGuardar).click();
		Thread.sleep(2000);
		return this.webDriver.findElement(mensajeText).getText();
	}
	
	public void hacerClickBotonVolver() throws Exception {
		this.webDriver.findElement(botonVolver).click();
		Thread.sleep(2000);
	}
	
	public void cerrarPagina() throws Exception {
		VisorDriver.cerrarPagina(this.webDriver);
	}
	
	public WebDriver getDriver() {
		return this.webDriver;
	}
}

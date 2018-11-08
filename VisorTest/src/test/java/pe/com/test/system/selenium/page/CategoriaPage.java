package pe.com.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.test.system.selenium.driver.VisorDriver;

public class CategoriaPage {
	private By botonNuevaCategoria = By.id("btnNuevo");
	private By campoNombre = By.id("txtNombre");
	private By botonGuardarCategoria = By.id("btnGuardar");
	private By botonVolver = By.id("btnVolver");
	private By linkMenaje = By.xpath("//*[@id=\"messages\"]/div/ul/li/span");
	//ya reconoce el mensaje pese a los elemntos interiors que cubren el texto (.getText())
	private By mensajeRespuesta = By.id("messages");
	private By botonFiltrar = By.id("btnFiltrar");
	private By campoFiltro = By.id("txtFiltro");
	private By tablaCategoria_data = By.id("tablaCategorias_data");//tablaCategorias_data
	private By tablaCategoria_datafirefox = By.id("//*[@id=\"tablaCategorias_data\"]/tr[1]/td[1]");
	private By botonActualizar = By.id("btnActualizar");
	private By botonEliminar = By.id("btnEliminar");
	private By botonSiConfirmacionEliminar = By.id("btnSi");
	private By botonNoConfirmacionEliminar = By.id("btnNo");
	private By botonCerrarPopUpConfirmacionEliminar = By.id("//*[@id=\"frmConfirmacion\"]/div[1]/a");
	
	private WebDriver webDriver = null;
	
	public CategoriaPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void escribirCampoFiltrar(String nombre) throws Exception {
		this.webDriver.findElement(campoFiltro).clear();
		this.webDriver.findElement(campoFiltro).sendKeys(nombre);
		Thread.sleep(1000);
	}
	
	public void hacerClickBotonFiltrar() throws Exception {
		this.webDriver.findElement(botonFiltrar).click();
		Thread.sleep(3000);
	}
	
	public void seleccionarItemTabla() throws Exception {
		Thread.sleep(2000);
		this.webDriver.findElement(tablaCategoria_data).click();
		Thread.sleep(2000);
	}
	
	public void hacerClickBotonEditar() throws Exception {
		this.webDriver.findElement(botonActualizar).click();
		Thread.sleep(2000);
	}
	
	public void hacerClickBotonNuevo() throws Exception {
		this.webDriver.findElement(botonNuevaCategoria).click();
		Thread.sleep(2000);
	}
	
	public void escribirCampoNombre(String nombre) throws Exception {
		this.webDriver.findElement(campoNombre).clear();
		this.webDriver.findElement(campoNombre).sendKeys(nombre);
	}

	public String hacerClickBotonGuardar() throws Exception {
		this.webDriver.findElement(botonGuardarCategoria).click();
		Thread.sleep(2000);
		return this.webDriver.findElement(mensajeRespuesta).getText();
	}
	
	public void hacerClictBotonEliminar() throws Exception {
		this.webDriver.findElement(this.botonEliminar).click();
		Thread.sleep(2000);
	}
	
	public String  hacerClickBotonSiConfirmacionEliminar() throws Exception {
		this.webDriver.findElement(this.botonSiConfirmacionEliminar).click();
		Thread.sleep(2000);
		return this.webDriver.findElement(this.mensajeRespuesta).getText();
	}
	
	public void hacerClickBotonNoConfirmacionEliminar() throws Exception {
		this.webDriver.findElement(this.botonNoConfirmacionEliminar).click();
		Thread.sleep(2000);
	}
	
	public void cerrarPagina() throws Exception {
		VisorDriver.cerrarPagina(this.webDriver);
	}
	
	public WebDriver getWebDriver() {
		return this.webDriver;
	}
}

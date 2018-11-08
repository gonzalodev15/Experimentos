package pe.com.test.system.testCase;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pe.com.test.system.selenium.dataManager.Excel;
import pe.com.test.system.selenium.page.ActualizarCategoriaPage;
import pe.com.test.system.selenium.page.BienvenidaPage;
import pe.com.test.system.selenium.page.CategoriaPage;
import pe.com.test.system.selenium.page.IniciarSesionPage;
import pe.com.test.system.selenium.util.Utilitario;
import pe.com.test.system.testlink.util.VisorTestlink;

public class MantenimientoCategoria {
	//parameters tipos primitivos
	//data provider son objetos
	private IniciarSesionPage iniciarSesionPage;
	private BienvenidaPage bienvenidaPage;
	private CategoriaPage categoriaPage;
	private ActualizarCategoriaPage actualizarCategoriaPage;
	private String rutaCarpetaError = "C:\\CapturasPantalla\\Categoria";
	private Integer idNavgadorTestlink;
	private String nombreNavegadorTestlink;
	
	@BeforeTest
	@Parameters({"navegador", "remoto", "testlinkIdNavegador", "testlinkNombreNavegador"})
	//navegador guarda su valor en la primera variable que encuentra y remoto el segundo, ...
	public void antesDelTest(String navegador, int remoto, int testlinkIdNavegador, String testlinkNombreNavegador) {
		this.iniciarSesionPage = new IniciarSesionPage(navegador, remoto == 1);
		this.bienvenidaPage = new BienvenidaPage(this.iniciarSesionPage.getWebDriver());
		this.categoriaPage = new CategoriaPage(this.bienvenidaPage.getWebDriver());
		this.actualizarCategoriaPage = new ActualizarCategoriaPage(this.categoriaPage.getWebDriver());
		this.idNavgadorTestlink = testlinkIdNavegador;
		this.nombreNavegadorTestlink = testlinkNombreNavegador;
	}
	
	//TestNG no lee dataproviders pero ITestContext le decimos que vaya al archivo y lea del xml actual dame el dataProvider
	@DataProvider(name = "DatosDeEntradaInsertar")
	public static Object[][] DatosDeEntradaInsertar(ITestContext contexto) {
		String rutaArchivo = contexto.getCurrentXmlTest().getParameter("rutaArchivoExcel");
		return Excel.leerExcel(rutaArchivo, 1);
	}
	@DataProvider(name = "DatosDeEntradaActualizar")
	public static Object[][] DatosDeEntradaActualizar(ITestContext contexto) {
		String rutaArchivo = contexto.getCurrentXmlTest().getParameter("rutaArchivoExcel");
		return Excel.leerExcel(rutaArchivo, 3);
	}
	@DataProvider(name = "DatosDeEntradaEliminar")
	public static Object[][] DatosDeEntradaEliminar(ITestContext contexto) {
		String rutaArchivo = contexto.getCurrentXmlTest().getParameter("rutaArchivoExcel");
		return Excel.leerExcel(rutaArchivo, 2);
	}
	
//varios dataProvider pero ese nomre no se puede repetir
	@Test(dataProvider = "DatosDeEntradaInsertar")
	public void insertarCategoria(String casoPrueba, String urlInicial, String usuario, String clave, String nombre, String valorEsperado, 
			String urlTestlink, String keyTestlink, String idTestCaseInternoTestlink, String idTestCaseExternoTestlink,
			String idTestPlanTestlink, String idBuidTestink, String nombreBuildTestlink) {
		try {
			this.iniciarSesionPage.ingresarPaginaIniciarSesion(urlInicial);
			this.iniciarSesionPage.iniciarSesion(usuario, clave);
			
			this.bienvenidaPage.hacerCleanMenuPrincipal();
			this.bienvenidaPage.hacerClickModAmacen();
			this.bienvenidaPage.hacerClickMntCategoria();
			
			this.categoriaPage.hacerClickBotonNuevo();
			this.categoriaPage.escribirCampoNombre(nombre.trim());
			String valorObtenido = this.categoriaPage.hacerClickBotonGuardar();
			
			Assert.assertEquals(valorObtenido, valorEsperado);
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					true, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Se ejecuto correctamente", this.idNavgadorTestlink, this.nombreNavegadorTestlink);
		} catch(AssertionError e) {
			Utilitario.caputarPantallarError(this.rutaCarpetaError, "Error: " + e.getMessage(), this.categoriaPage.getWebDriver());
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					false, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Error: " + e.getMessage(), this.idNavgadorTestlink, this.nombreNavegadorTestlink);
			Assert.fail(e.getMessage());
		
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR: " + e.getMessage());
		}
	}
	
	@Test(dependsOnMethods= {"insertarCategoria"}, dataProvider="DatosDeEntradaActualizar")
	public void actualizarCategoria(String casoPrueba, String urlInicial, String usuario, String clave, String nombre, String valorEsperado,
			String urlTestlink, String keyTestlink, String idTestCaseInternoTestlink, String idTestCaseExternoTestlink,
			String idTestPlanTestlink, String idBuidTestink, String nombreBuildTestlink) {
		try {
			this.iniciarSesionPage.ingresarPaginaIniciarSesion(urlInicial);
			this.iniciarSesionPage.iniciarSesion(usuario, clave);
			
			this.bienvenidaPage.hacerCleanMenuPrincipal();
			this.bienvenidaPage.hacerClickModAmacen();
			this.bienvenidaPage.hacerClickMntCategoria();
			
			this.categoriaPage.escribirCampoFiltrar("");
			this.categoriaPage.hacerClickBotonFiltrar();
			this.categoriaPage.seleccionarItemTabla();
			this.categoriaPage.hacerClickBotonEditar();
			
			this.actualizarCategoriaPage.escribirCampoNombre(nombre.trim());
			String valorObtenido = this.actualizarCategoriaPage.hacerClickBotonGuardar();
			
			Assert.assertEquals(valorObtenido, valorEsperado);
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					true, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Se ejecuto correctamente", this.idNavgadorTestlink, this.nombreNavegadorTestlink);
		} catch(AssertionError e) {
			Utilitario.caputarPantallarError(this.rutaCarpetaError, "Error: " + e.getMessage(), this.categoriaPage.getWebDriver());
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					false, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Error: " + e.getMessage(), this.idNavgadorTestlink, this.nombreNavegadorTestlink);
			Assert.fail(e.getMessage());
		
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR: " + e.getMessage());
		}
	}
	
	@Test(dependsOnMethods= {"actualizarCategoria"}, dataProvider="DatosDeEntradaEliminar")
	public void eliminarCategoria(String casoPrueba, String urlInicial, String usuario, String clave, String valorEsperado,
			String urlTestlink, String keyTestlink, String idTestCaseInternoTestlink, String idTestCaseExternoTestlink,
			String idTestPlanTestlink, String idBuidTestink, String nombreBuildTestlink) {
		try {
			this.iniciarSesionPage.ingresarPaginaIniciarSesion(urlInicial);
			this.iniciarSesionPage.iniciarSesion(usuario, clave);
			
			this.bienvenidaPage.hacerCleanMenuPrincipal();
			this.bienvenidaPage.hacerClickModAmacen();
			this.bienvenidaPage.hacerClickMntCategoria();

			this.categoriaPage.escribirCampoFiltrar("");
			this.categoriaPage.hacerClickBotonFiltrar();
			this.categoriaPage.seleccionarItemTabla();
			this.categoriaPage.hacerClictBotonEliminar();
			String valorObtenido = this.categoriaPage.hacerClickBotonSiConfirmacionEliminar();
			
			Assert.assertEquals(valorEsperado, valorObtenido);
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					true, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Se ejecuto correctamente", this.idNavgadorTestlink, this.nombreNavegadorTestlink);
		} catch(AssertionError e) {
			Utilitario.caputarPantallarError(this.rutaCarpetaError, "Error: " + e.getMessage(), this.categoriaPage.getWebDriver());
			VisorTestlink.reportarCasoDePrueba(urlTestlink, keyTestlink, Integer.parseInt(idTestCaseInternoTestlink),
					Integer.parseInt(idTestCaseExternoTestlink), Integer.parseInt(idTestPlanTestlink), 
					false, Integer.parseInt(idBuidTestink), nombreBuildTestlink, 
					"Error: " + e.getMessage(), this.idNavgadorTestlink, this.nombreNavegadorTestlink);
			Assert.fail(e.getMessage());
		
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR: " + e.getMessage());
		}
	}
	
	
	@AfterTest
	public void despuesDelTest() {
		try {
			this.categoriaPage.cerrarPagina();
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR: " + e.getMessage());
		}
	}
}

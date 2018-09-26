package pe.com.core.test.integration.test;

import javax.servlet.http.HttpServletResponse;

import org.mockito.Mock;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import pe.com.core.business.ProductoBusiness;
import pe.com.core.entity.Producto;

public class ProductoIntegrationTest {
	
	private final ProductoBusiness productoBusiness = new ProductoBusiness();
	private static Producto producto = new Producto();
	private String mensaje = "";
	private String nombreProducto = "";
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar sesion e la aplicacion$")
	public void despues_de_iniciar_sesion_e_la_aplicacion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el enclace de mantenimiento de categorias$")
	public void hago_click_en_el_enclace_de_mantenimiento_de_categorias() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^luego hago clic en el boton de Nuevo$")
	public void luego_hago_clic_en_el_boton_de_Nuevo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escrio en el campo Nombre el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escrio_en_el_campo_Nombre_el_valor_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^el sistema me mostrara el emensaje de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_emensaje_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago clic e el enlace de Mantenimiento de Categoria$")
	public void hago_clic_e_el_enlace_de_Mantenimiento_de_Categoria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^busco la categoria \"([^\"]*)\" para selecciona de la tabla de Categorias$")
	public void busco_la_categoria_para_selecciona_de_la_tabla_de_Categorias(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago clic en el boton Ediar$")
	public void hago_clic_en_el_boton_Ediar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo de nombre de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_de_nombre_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^el sistema me motrara el emensaje de \"([^\"]*)\"$")
	public void el_sistema_me_motrara_el_emensaje_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el enlace de Mantenimiento de Producto$")
	public void hago_click_en_el_enlace_de_Mantenimiento_de_Producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^luego hago click en el boton de Nuevo Producto$")
	public void luego_hago_click_en_el_boton_de_Nuevo_Producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo en el campo Nombre Producto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Producto_el_valor_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo en el campo Precio Producto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Precio_Producto_el_valor_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo en el campo Categoria Producto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Categoria_Producto_el_valor_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^presiono el boton de Guardar Producto$")
	public void presiono_el_boton_de_Guardar_Producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^el sistema me mostrara el mensaje Producto de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_Producto_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^busco el producto \"([^\"]*)\" para seleccionarla de la tabla de Productos$")
	public void busco_el_producto_para_seleccionarla_de_la_tabla_de_Productos(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton de Editar Producto$")
	public void hago_click_en_el_boton_de_Editar_Producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo el precio Producto de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_el_precio_Producto_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hago click en el boton de Eliminar Producto$")
	public void hago_click_en_el_boton_de_Eliminar_Producto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

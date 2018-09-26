package pe.com.core.test.integration.test;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.core.business.UserBusiness;
import pe.com.core.entity.User;
import cucumber.api.java.en.Given;

public class UserIntegrationTest {
	
	
	private final UserBusiness userBusiness = new UserBusiness();
	private static User user = new User();
	private String mensaje = "";
	private String firstname = "";
	private String lastname = "";
	private String email = "";
	private String password = "";
	
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar la aplicacion$")
	public void despues_de_iniciar_la_aplicacion() throws Throwable {
		MockitoAnnotations.initMocks(this);
		Mockito.doNothing().when(response).sendRedirect("http://visorupc.com");
		Assert.assertTrue(true);
	}

	@When("^hago click en el enlace de Registrar usuario$")
	public void hago_click_en_el_enlace_de_Registrar_usuario() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://visorupc.com/mntCategoria.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Firstname Registrar el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Firstname_Registrar_el_valor_de(String arg1) throws Throwable {
		firstname = arg1;
		user.setFirstname(firstname);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo LastName Registrar el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_LastName_Registrar_el_valor_de(String arg1) throws Throwable {
		lastname = arg1;
		user.setFirstname(lastname);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Email Registrar el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Email_Registrar_el_valor_de(String arg1) throws Throwable {
		email = arg1;
		user.setFirstname(email);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Password Registrar el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Password_Registrar_el_valor_de(String arg1) throws Throwable {
		password = arg1;
		user.setFirstname(password);
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Finalizar Registrar usuario$")
	public void hago_click_en_el_boton_de_Finalizar_Registrar_usuario() throws Throwable {
		try {
			userBusiness.insertar(user);
			mensaje = "Se registro correctamente el usuario";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Then("^el sistema me mostrara el mensaje Regisrar usuario de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_Regisrar_usuario_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@When("^hago click en el enlace de Configuracion de User$")
	public void hago_click_en_el_enlace_de_Configuracion_de_User() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("https://www.visorupc.com/actCategoria.xhtml");
		Assert.assertTrue(true);
	}

	@When("^busco el Firstname Registrar y escribo el valor de \"([^\"]*)\"$")
	public void busco_el_Firstname_Registrar_y_escribo_el_valor_de(String arg1) throws Throwable {
		firstname = arg1;
		user.setFirstname(firstname);
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Guardar usuario cambios Registrar$")
	public void hago_click_en_el_boton_de_Guardar_usuario_cambios_Registrar() throws Throwable {
		try {
			userBusiness.insertar(user);
			mensaje = "Se registro correctamente el usuario";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Then("^el sistema me mostrara el mensaje Registrar usuario de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_Registrar_usuario_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

}

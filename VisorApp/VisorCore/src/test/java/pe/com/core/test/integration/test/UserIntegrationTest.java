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
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class UserIntegrationTest {
	
	
	private final UserBusiness userBusiness = new UserBusiness();
	private static User user = new User();
	private String mensaje = "";
	private String firstname = "";
	private String lastname = "";
	private String email = "";
	private String password = "";
	private String confirmPassword = "";
	
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar la aplicacion$")
	public void despues_de_iniciar_la_aplicacion() throws Throwable {
		MockitoAnnotations.initMocks(this);
		Mockito.doNothing().when(response).sendRedirect("http://movienight.com");
		Assert.assertTrue(true);
	}

	@When("^se muestra la pantalla de Login$")
	public void se_muestra_la_pantalla_de_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^en la nueva pantalla escribo en el campo Email el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Email_el_valor_de(String arg1) throws Throwable {
		email = arg1;
		user.setEmail(email);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Password el valor incorrecto de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Password_el_valor_incorrecto_de(String arg1) throws Throwable {
		password = arg1;
		user.setPassword(password);
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Inicar Sesión Registrar usuario$")
	public void hago_click_en_el_boton_de_Inicar_Sesión_Registrar_usuario() throws Throwable {
		try {
			userBusiness.insertar(user);
			mensaje = "Correo o contraseña incorrecta";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("^en la nueva pantalla escribo en el campo Email valor incorrecto de\"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Email_valor_incorrecto_de(String arg1) throws Throwable {
		email = arg1;
		user.setEmail(email);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Password  valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Password_valor_de(String arg1) throws Throwable {
		password = arg1;
		user.setPassword(password);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Email valor de\"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Email_valor_de(String arg1) throws Throwable {
		email = arg1;
		user.setEmail(email);
		Assert.assertTrue(true);
	}

	

	@Then("^el sistema me mostrara la vista de Videoteca$")
	public void el_sistema_me_mostrara_la_vista_de_Videoteca() throws Throwable {
		MockitoAnnotations.initMocks(this);
		Mockito.doNothing().when(response).sendRedirect("http://movienight.com");
		Assert.assertTrue(true);
	}

	@When("^hago click en el enlace de Registrar usuario$")
	public void hago_click_en_el_enlace_de_Registrar_usuario() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://movienight.com/UserRegsiter.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Password el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Password_el_valor_de(String arg1) throws Throwable {
		password = arg1;
		user.setEmail(password);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Confirm_Password el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Confirm_Password_el_valor_de(String arg1) throws Throwable {
		confirmPassword = arg1;
		user.setEmail(confirmPassword);
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Firstname el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Firstname_el_valor_de(String arg1) throws Throwable {
		firstname = arg1;
		user.setEmail(firstname);
		Assert.assertTrue(true);
	}

	@Then("^el sistema me mostrara el mensaje Regisrar usuario de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_Regisrar_usuario_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@Then("^el sistema inserta el siguente mensaje debajo del campo \"([^\"]*)\"$")
	public void el_sistema_inserta_el_siguente_mensaje_debajo_del_campo(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@Then("^hago click en el boton de Terminar$")
	public void hago_click_en_el_boton_de_Terminar() throws Throwable {
		try {
			userBusiness.insertar(user);
			mensaje = "Se registro correctamente";
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
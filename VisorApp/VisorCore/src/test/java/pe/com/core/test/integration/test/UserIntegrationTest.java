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
	
	@Mock
	private HttpServletResponse response;
	

}

package pe.com.core.test.unit.test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import pe.com.core.dao.UserDao;
import pe.com.core.entity.Categoria;
import pe.com.core.entity.User;



@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UserTest {
	@Mock
	public UserDao userDao;
	@Mock
	public User user;
	
	@BeforeClass
	public static void inicioClase() {
		System.out.println("Inicio de clase");
	}
	
	@AfterClass
	public static void finClase() {
		System.out.println("Fin de clase");
	}
	
	@Before
	public void antesMtodo() {
		System.out.println("Antes del metodo");
	}
	
	@After
	public void despuesetodo() {
		System.out.println("Despues de metodo");
	}
	
	@Test
	public void a_insertar() {
		try {
			System.out.println("metodo insertar");
			user = new User();
			user.setFirstname("Daniel");
			user.setLastname("Mauricio");
			user.setIdUser(1);
			when(userDao.insertar(Matchers.any())).thenReturn(user);
			userDao.insertar(user);
			Assert.assertTrue(user.getIdUser()>0);
			
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	@Test
	public void b_actualizar() {
		try {
			System.out.println("metodo actualizar");
			User userBuscado;
			user = new User();
			user.setFirstname("Linda_Wawita");
			user.setIdUser(1);
			when(userDao.obtener(Matchers.any())).thenReturn(user);
			userBuscado = userDao.obtener(user);
			userBuscado.setFirstname("Eduardo");
			when(userDao.actualizar(Matchers.any())).thenReturn(userBuscado);
			userDao.actualizar(user);
			System.out.println("Nombre: " + user.getFirstname());
			Assert.assertTrue(true);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void c_listar() {
		try {
			System.out.println("metodo listar");
			List<User> listarUsers = spy(new ArrayList<>());
			when(listarUsers.add(Matchers.any())).thenReturn(true);
			when(userDao.listar()).thenReturn(listarUsers);
			List<User> lista = userDao.listar();
			Assert.assertTrue(lista.size()>0);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}

}

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

import pe.com.core.dao.ProductoDao;
import pe.com.core.entity.Categoria;
import pe.com.core.entity.Producto;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductoTest {

	@Mock
	public ProductoDao productoDao; /*se conectaria a la BD si es que no le pongo mock*/
	@Mock
	public Producto producto;
	
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
			producto = new Producto();
			producto.setNombre("Chocolates");
			producto.setIdCategoria(1);
			producto.setPrecio(5.00);
			when(productoDao.insertar(Matchers.any())).thenReturn(producto);
			productoDao.insertar(producto);
			Assert.assertTrue(producto.getIdCategoria()>0);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("metodo actualizar");
			Producto productoBuscada;
			producto = new Producto();
			producto.setNombre("Galleta");
			producto.setPrecio(5.00);
			producto.setIdCategoria(1);
			when(productoDao.obtener(Matchers.any())).thenReturn(producto);
			productoBuscada = productoDao.obtener(producto);
			productoBuscada.setPrecio(1.00);
			when(productoDao.actualizar(Matchers.any())).thenReturn(productoBuscada);
			productoDao.actualizar(/*categoriaBuscada*/producto);
			System.out.println("Nombre: " + producto.getPrecio());
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
			/*spy es un @Mock*/
			List<Producto> listarProducto = spy(new ArrayList<>());
			when(listarProducto.add(Matchers.any())).thenReturn(true);
			when(productoDao.listar()).thenReturn(listarProducto);
			List<Producto> lista = productoDao.listar();
			Assert.assertTrue(lista.size()>0);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void d_eliminar() {
		try {
			System.out.println("metodo actualizar");
			Producto productoBuscada;
			producto = new Producto();
			producto.setNombre("Galleta");
			producto.setPrecio(1.00);
			producto.setIdCategoria(1);
			when(productoDao.obtener(Matchers.any())).thenReturn(producto);
			productoBuscada = productoDao.obtener(producto);
			
			when(productoDao.eliminar(Matchers.any())).thenReturn(productoBuscada);
			productoDao.eliminar(producto);
			System.out.println("Nombre: " + producto.getNombre());
			Assert.assertTrue(true);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
}

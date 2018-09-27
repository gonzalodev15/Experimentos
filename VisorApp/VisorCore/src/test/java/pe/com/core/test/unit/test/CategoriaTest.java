package pe.com.core.test.unit.test;

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

import pe.com.core.dao.CategoriaDao;
import pe.com.core.entity.Categoria;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoriaTest {
	
	@Mock
	public CategoriaDao categoriaDao; /*se conectaria a la BD si es que no le pongo mock*/
	@Mock
	public Categoria categoria;
	
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
			categoria = new Categoria();
			categoria.setNombre("Chocolates");
			categoria.setIdCategoria(1);
			when(categoriaDao.insertar(Matchers.any())).thenReturn(categoria);
			categoriaDao.insertar(categoria);
			Assert.assertTrue(categoria.getIdCategoria()>0);
			
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("metodo actualizar");
			Categoria categoriaBuscada;
			categoria = new Categoria();
			categoria.setNombre("Chocolates");
			categoria.setIdCategoria(1);
			when(categoriaDao.obtener(Matchers.any())).thenReturn(categoria);
			categoriaBuscada = categoriaDao.obtener(categoria);
			categoriaBuscada.setNombre("Menestras");
			when(categoriaDao.actualizar(Matchers.any())).thenReturn(categoriaBuscada);
			categoriaDao.actualizar(/*categoriaBuscada*/categoria);
			System.out.println("Nombre: " + categoria.getNombre());
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
			List<Categoria> listarCategorias = spy(new ArrayList<>());
			when(listarCategorias.add(Matchers.any())).thenReturn(true);
			when(categoriaDao.listar()).thenReturn(listarCategorias);
			List<Categoria> lista = categoriaDao.listar();
			Assert.assertTrue(lista.size()>0);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
}

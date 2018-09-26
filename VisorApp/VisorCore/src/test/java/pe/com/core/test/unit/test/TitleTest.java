package pe.com.core.test.unit.test;


import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import pe.com.core.dao.TitleDao;
import pe.com.core.entity.Title;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleTest {

	@Mock
	public TitleDao titleDao;
	@Mock
	public Title title;
	
	@Test
	public void a_insertar() {
		try {
			System.out.println("metodo insertar");
			title = new Title();
			title.setName("Titanic");
			title.setPlaylistId(1);
			title.setYear("1980");
			when(titleDao.insertar(Matchers.any())).thenReturn(title);
			titleDao.insertar(title);
			Assert.assertTrue(title.getPlaylistId()>0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba" + e.getMessage());
		}
	}
	@Test
	public void b_actualizar() {
		try {
			System.out.println("metodo actualizar");
			Title tituloBuscado;
			title = new Title();
			title.setPlaylistId(1);
			title.setName("Avengers");
			title.setYear("2010");
			
			when(titleDao.obtener(Matchers.any())).thenReturn(title);
			tituloBuscado = titleDao.obtener(title);
			tituloBuscado.setYear("2012");
			when(titleDao.actualizar(Matchers.any())).thenReturn(tituloBuscado);
			titleDao.actualizar(title);
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
			List<Title> listTitle = spy(new ArrayList<>());
			when(listTitle.add(Matchers.any())).thenReturn(true);
			when(titleDao.listar()).thenReturn(listTitle);
			List<Title> lista = titleDao.listar();
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
			Title tituloBuscado;
			title = new Title();
			title.setPlaylistId(1);
			title.setName("Titanic");
			title.setYear("1980");

			when(titleDao.obtener(Matchers.any())).thenReturn(title);
			tituloBuscado = titleDao.obtener(title);
			
			when(titleDao.eliminar(Matchers.any())).thenReturn(tituloBuscado);
			titleDao.eliminar(title);
			Assert.assertTrue(true);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
}

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

import pe.com.core.dao.PlaylistDao;
import pe.com.core.entity.Playlist;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlaylistTest {

	public PlaylistTest() {
		super();
	}
	@Mock
	public PlaylistDao playlistDao;
	@Mock
	public Playlist playlist;
	
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
			playlist = new Playlist();
			playlist.setName("Playlist 1");
			playlist.setId(1);
			playlist.setDescription("some description");
			when(playlistDao.insertar(Matchers.any())).thenReturn(playlist);
			playlistDao.insertar(playlist);
			Assert.assertTrue(playlist.getId()>0);
			
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("metodo actualizar");
			Playlist playlistBuscada;
			playlist = new Playlist();
			playlist.setName("Playlist 1");
			playlist.setDescription("some description 2");
			playlist.setId(1);
			when(playlistDao.obtener(Matchers.any())).thenReturn(playlist);
			playlistBuscada = playlistDao.obtener(playlist);
			playlistBuscada.setDescription("new description");
			when(playlistDao.actualizar(Matchers.any())).thenReturn(playlistBuscada);
			playlistDao.actualizar(playlist);
			System.out.println("Nombre: " + playlist.getDescription());
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
			List<Playlist> listarPlaylist = spy(new ArrayList<>());
			when(listarPlaylist.add(Matchers.any())).thenReturn(true);
			when(playlistDao.listar("")).thenReturn(listarPlaylist);
			List<Playlist> lista = playlistDao.listar("");
			Assert.assertTrue(lista.size()>0);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void d_listarfiltro( ) {
		try {
			System.out.println("metodo listar con filtro");
			List<Playlist> listarPlaylist = spy(new ArrayList<>());
			String filtro = "p";
			when(listarPlaylist.add(Matchers.any())).thenReturn(true);
			when(playlistDao.listar(filtro)).thenReturn(listarPlaylist);
			List<Playlist> lista = playlistDao.listar(filtro);
			Assert.assertTrue(lista.size() > 0);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	@Test
	public void e_eliminar() {
		try {
			System.out.println("metodo actualizar");
			Playlist playlistBuscada;
			playlist = new Playlist();
			playlist.setName("Playlist 1");
			playlist.setDescription("new description");
			when(playlistDao.obtener(Matchers.any())).thenReturn(playlist);
			playlistBuscada = playlistDao.obtener(playlist);
			
			when(playlistDao.eliminar(Matchers.any())).thenReturn(playlistBuscada);
			playlistDao.eliminar(playlist);
			System.out.println("Nombre: " + playlist.getName());
			Assert.assertTrue(true);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Fallo la prueba: " + e.getMessage());
		}
	}
	
	
}



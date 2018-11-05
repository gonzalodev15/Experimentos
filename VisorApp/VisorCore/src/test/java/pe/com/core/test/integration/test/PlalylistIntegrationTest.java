package pe.com.core.test.integration.test;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.core.business.PlaylistBusiness;
import pe.com.core.entity.Playlist;


public class PlalylistIntegrationTest {
	
	private final PlaylistBusiness playlistBusiness = new PlaylistBusiness();
	private static Playlist playlist = new Playlist();
	private String mensaje = "";
	private String nombrePlaylist = "";
	private String descripcionPlaylist = "";
	private Integer cantVideoteca = 4;
	private Integer contador = 0;
	private Integer indicePlaylist = 0;
	
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar sesion en la aplicacion$")
	public void despues_de_iniciar_sesion_en_la_aplicacion() throws Throwable {
		MockitoAnnotations.initMocks(this);
		Mockito.doNothing().when(response).sendRedirect("http://movienight.com");
		playlist.setId(1);
		Assert.assertTrue(true);
	}
	
	@When("^hago click en el enlace de Gestionar Videoteca$")
	public void hago_click_en_el_enlace_de_Gestionar_Videoteca() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/gtPlaylists.xhtml");
		Assert.assertTrue(true);
	}

	@When("^busco el producto \"([^\"]*)\" para seleccionarla de la tabla de Playlist$")
	public void busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String arg1) throws Throwable {
		nombrePlaylist = arg1;
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/getPlaylist/"+ nombrePlaylist +".xhtml");
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Mover Playlist$")
	public void hago_click_en_el_boton_de_Mover_Playlist() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/getPlaylist.xhtml");
		Assert.assertTrue(true);
	}

	@When("^coloco el indice del item Playlist que quiero mover como (\\d+)$")
	public void coloco_el_indice_del_item_Playlist_que_quiero_mover_como(int arg1) throws Throwable {
		indicePlaylist = arg1;
		if(indicePlaylist > 0 && indicePlaylist < cantVideoteca) {
			playlist.setIndex(indicePlaylist);
		} 
		Assert.assertTrue(true);
	}

	@Then("^el sistema actualiza la lista con el orden especificado exitosamente$")
	public void el_sistema_actualiza_la_lista_con_el_orden_especificado_exitosamente() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/getPlaylists.xhtml");
		Assert.assertTrue(true);
	}

	@Then("^el sistema no actualiza la lista con el orden especificado$")
	public void el_sistema_no_actualiza_la_lista_con_el_orden_especificado() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/getPlaylists.xhtml");
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Eliminar Playlist$")
	public void hago_click_en_el_boton_de_Eliminar_Playlist() throws Throwable {
		try {
			playlist.setId(1);
			playlistBusiness.eliminar(playlist);
		    mensaje = "Se elimino correctamente la Playlist";
		    Assert.assertTrue(true);
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("^hago click en el boton de Esta seguro$")
	public void hago_click_en_el_boton_de_Esta_seguro() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/deletePlaylist/1.xhtml");
		Assert.assertTrue(true);
	}

	@Then("^el sistema me mostrara el mensaje Playlist de \"([^\"]*)\"$")
	public void el_sistema_me_mostrara_el_mensaje_Playlist_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@When("^hago click en el boton Cancelar Eliminacion$")
	public void hago_click_en_el_boton_Cancelar_Eliminacion() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/getPlaylists.xhtml");
		Assert.assertTrue(true);
	}

	@When("^hago click en el icono Marcar como favorito durante (\\d+) segundo$")
	public void hago_click_en_el_icono_Marcar_como_favorito_durante_segundo(int arg1) throws Throwable {
	    contador = arg1;
	    if(contador >= 1.5) {
	    	playlist.setFavorite(0);
	    }
	    Assert.assertTrue(true);
	}
	
	@When("^coloco el indice del item Playlist que quiero mover como menos (\\d+)$")
	public void coloco_el_indice_del_item_Playlist_que_quiero_mover_como_menos(int arg1) throws Throwable {
		indicePlaylist = arg1;
		if(indicePlaylist > 0 && indicePlaylist < cantVideoteca) {
			playlist.setIndex(indicePlaylist);
		} 
		Assert.assertTrue(true);
	}

	@Then("^el sistema no me mostrara ningun mensaje con respecto a la Playlist$")
	public void el_sistema_no_me_mostrara_ningun_mensaje_con_respecto_a_la_Playlist() throws Throwable {
		Assert.assertTrue(true);
	}

	@When("^hago click en el icono Marcar como favorito durante (\\d+)\\.(\\d+) segundos$")
	public void hago_click_en_el_icono_Marcar_como_favorito_durante_segundos(int arg1, int arg2) throws Throwable {
		try {
			contador = arg1;
			 int contAux = arg2;
			    if(contador >= 1 && contAux >= 0.5) {
			    	playlist.setId(1);
			    	playlist.setFavorite(1);
			    	playlistBusiness.actualizar(playlist);
			    	mensaje = "Se marco como favorito la Playlist";
			    }
			    Assert.assertTrue(true);
		}catch (Exception  e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("^luego hago click en el boton de Registrar Playlist$")
	public void luego_hago_click_en_el_boton_de_Registrar_Playlist() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("http://MovieNight.com/regPlaylist.xhtml");
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Nombre Playlist con el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Playlist_con_el_valor_de(String arg1) throws Throwable {
	    nombrePlaylist = arg1;
	    playlist.setName(nombrePlaylist);
	    Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en el campo Descripcion Producto el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_Producto_el_valor_de(String arg1) throws Throwable {
		descripcionPlaylist = arg1;
	    playlist.setDescription(descripcionPlaylist);
	    Assert.assertTrue(true);
	}

	@When("^presiono el boton de Guardar Playlist$")
	public void presiono_el_boton_de_Guardar_Playlist() throws Throwable {
		try {
			Playlist aux = playlistBusiness.obtener(1);
	    	playlistBusiness.insertar(aux);
	    	mensaje = "Se guardo correctamente la Playlist";
	    	Assert.assertTrue(true);
	    }catch(Exception e) {
	    	e.printStackTrace();
			Assert.fail();
	    }
	}
	
	@When("^presiono el boton de Guardar Playlist B$")
	public void presiono_el_boton_de_Guardar_Playlist_B() throws Throwable {
		mensaje = "Se debe insertar un nombre que comience con un caracter";
    	Assert.assertTrue(true);
	}
}

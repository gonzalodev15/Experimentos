package pe.com.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import pe.com.core.dao.PlaylistDao;
import pe.com.core.entity.Playlist;
import pe.com.web.util.WebUtil;

@ManagedBean
//@SessionScoped
public class PlaylistController implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(PlaylistController.class);
	private String filtro = "";
	private List<Playlist> listaPlaylist = new ArrayList<Playlist>();
	private PlaylistDao playlistDao = new PlaylistDao();
	private Playlist playlistGuardar =  new Playlist();
	private Playlist playlistSeleccionada = new Playlist();
	private String inicioMantenimiento = "";
	
	public PlaylistController() {
		/*this.listaPlaylist.add(new Playlist(1, "Playlis1", "description1", 0, 1));
		this.listaPlaylist.add(new Playlist(2, "Playlis2", "description2", 0, 2));
		this.listaPlaylist.add(new Playlist(3, "Playlis3", "description3", 0, 3));
		this.listaPlaylist.add(new Playlist(4, "Playlis4", "description4", 0, 4));*/
		
	}

	private void limpiar() {
		this.listaPlaylist = new ArrayList<Playlist>();
		this.playlistGuardar = new Playlist();
		this.playlistSeleccionada = new Playlist();
	}
	
	public void insertar() {
		try {
			this.playlistGuardar.setFavorite(0);
			this.playlistGuardar.setDescription("description");
			this.playlistGuardar.setIndex(2);
			//this.playlistGuardar.setName("funcion");
			//this.listaPlaylist.add(this.playlistGuardar);
			this.playlistDao.insertar(playlistGuardar);
			WebUtil.mensajeInformacion(WebUtil.obtenerPropiedad("playlistController.guardarExito"), WebUtil.obtenerPropiedad("playlistController.guardarExito"));
            this.limpiar();
		} catch (Exception e) {
			String mensaje = WebUtil.controlarError(e, LOGGER);
            WebUtil.mensajeError(mensaje, mensaje);
		}
	}
	
	public void actualizar() {
        try {
            this.playlistDao.actualizar(playlistGuardar);
            WebUtil.mensajeInformacion(WebUtil.obtenerPropiedad("playlistController.actualizarExito"), WebUtil.obtenerPropiedad("playlistController.actualizarExito"));
        } catch (Exception exception) {
            String mensaje = WebUtil.controlarError(exception, LOGGER);
            WebUtil.mensajeError(mensaje, mensaje);
        }
    }
	
	public void eliminar() {
        try {
            if (this.playlistSeleccionada != null && this.playlistSeleccionada.getName().length() >= 0) {
                this.playlistDao.eliminar(playlistSeleccionada);
                this.listaPlaylist.remove(playlistSeleccionada);
                WebUtil.mensajeInformacion(WebUtil.obtenerPropiedad("playlistController.eliminarExito"), WebUtil.obtenerPropiedad("playlistController.eliminarExito"));
                this.limpiar();
            } else {
                WebUtil.mensajeAdvertencia(WebUtil.obtenerPropiedad("playlistController.noSeleccionado"), WebUtil.obtenerPropiedad("playlistController.noSeleccionado"));
            }
        } catch (Exception exception) {
            String mensaje = WebUtil.controlarError(exception, LOGGER);
            WebUtil.mensajeError(mensaje, mensaje);
        }
    }
	
	public void buscar() {
        try {
        	
            this.listaPlaylist = this.playlistDao.listar(this.filtro);
        } catch (Exception exception) {
            String mensaje = WebUtil.controlarError(exception, LOGGER);
            WebUtil.mensajeError(mensaje, mensaje);
        }
    }
	
	public String irMantenimiento() {
        this.limpiar();
        return "mntAdmPlaylist";
    }
	
	public String irNuevo() {
        this.limpiar();
        return "registrarAdmPlaylist";
    }
	
	public String irActualizar() {
        String rpta = "";
        if (this.playlistSeleccionada != null && this.playlistSeleccionada.getName().length() >= 0) {
            this.playlistGuardar = this.playlistSeleccionada;
            this.listaPlaylist.clear();
            this.filtro = "";
            rpta = "actualizarAdmCategoria";
        } else {
            WebUtil.mensajeAdvertencia(WebUtil.obtenerPropiedad("playlistController.noSeleccionado"), WebUtil.obtenerPropiedad("playlistController.noSeleccionado"));
        }
        return rpta;
    }

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public List<Playlist> getListaPlaylist() {
		return listaPlaylist;
	}

	public void setListaPlaylist(List<Playlist> listaPlaylist) {
		this.listaPlaylist = listaPlaylist;
	}

	public PlaylistDao getPlaylistDao() {
		return playlistDao;
	}

	public void setPlaylistDao(PlaylistDao playlistDao) {
		this.playlistDao = playlistDao;
	}

	public Playlist getPlaylistGuardar() {
		return playlistGuardar;
	}

	public void setPlaylistGuardar(Playlist playlistGuardar) {
		this.playlistGuardar = playlistGuardar;
	}

	public Playlist getPlaylistSeleccionada() {
		return playlistSeleccionada;
	}

	public void setPlaylistSeleccionada(Playlist playlistSeleccionada) {
		this.playlistSeleccionada = playlistSeleccionada;
	}

	public String getInicioMantenimiento() {
		return inicioMantenimiento;
	}

	public void setInicioMantenimiento(String inicioMantenimiento) {
		this.inicioMantenimiento = inicioMantenimiento;
	}
	
	
}

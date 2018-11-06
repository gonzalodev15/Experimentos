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
@SessionScoped
public class PlaylistController implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(PlaylistController.class);
	private String filtro = "";
	private List<Playlist> listaPlaylist = new ArrayList<>();
	private PlaylistDao playlistDao = new PlaylistDao();
	private Playlist playlistGuardar =  new Playlist();
	private Playlist playlistSeleccionada = new Playlist();
	private String inicioMantenimiento = "";
	
	public PlaylistController() {
	}

	private void limpiar() {
		this.listaPlaylist = new ArrayList<>();
		this.playlistGuardar = new Playlist();
		this.playlistSeleccionada = new Playlist();
	}
	
	public void insertar() {
		try {
			this.playlistGuardar.setFavorite(0);
			this.playlistDao.insertar(playlistGuardar);
			WebUtil.mensajeInformacion(WebUtil.obtenerPropiedad("playlistController.guardarExito"), WebUtil.obtenerPropiedad("PlaylistController.guardarExito"));
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
            this.listaPlaylist = this.playlistDao.listar(this.filtro.trim());
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
            WebUtil.mensajeAdvertencia(WebUtil.obtenerPropiedad("playlistController.noSeleccionado"), WebUtil.obtenerPropiedad("categoriaController.noSeleccionado"));
        }
        return rpta;
    }
	
	public String getInicioMantenimiento() {
        this.limpiar();
        return inicioMantenimiento;
    }

    public void setInicioMantenimiento(String inicioMantenimiento) {
        this.inicioMantenimiento = inicioMantenimiento;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public List<Playlist> getListaCategoria() {
        return listaPlaylist;
    }

    public void setListaCategoria(List<Playlist> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }

    public Playlist getCategoriaSeleccionada() {
        return playlistSeleccionada;
    }

    public void setCategoriaSeleccionada(Playlist playlistSeleccionada) {
        this.playlistSeleccionada = playlistSeleccionada;
    }

    public Playlist getCategoriaGuardar() {
        return playlistGuardar;
    }

    public void setCategoriaDao(PlaylistDao playlistDao) {
        this.playlistDao = playlistDao;
    }
}

package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.PlaylistDao;
import pe.com.core.entity.Playlist;

public class PlaylistBusiness {
	
	private final PlaylistDao playDao = new PlaylistDao();
	
	public void insertar(Playlist play) {
		this.playDao.insertar(play);
	}
	
	public void actualizar(Playlist play) {
		this.playDao.actualizar(play);
	}
	
	public void eliminar(Playlist play){
		this.playDao.eliminar(play);
	}
	
	public Playlist obtener(Integer id) {
		return this.playDao.obtener(new Playlist(id));
	}
	
	public List<Playlist> listar(String filtro) {
		return this.playDao.listar(filtro);
	}

}

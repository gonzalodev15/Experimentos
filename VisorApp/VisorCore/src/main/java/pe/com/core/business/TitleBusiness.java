package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.TitleDao;
import pe.com.core.entity.Title;

public class TitleBusiness {

	private final TitleDao titleDao = new TitleDao();
	
	public void insertar(Title title) {
		this.titleDao.insertar(title);
	}
	public void actualizar(Title title) {
		this.titleDao.actualizar(title);
	}
	
	public void eliminar(Title title) {
		this.titleDao.eliminar(title);
	}
	
	public Title obtener(Integer idTitle) {
		return this.titleDao.obtener(new Title(idTitle));
	}
	
	public List<Title> listar(String filtro) {
		return this.titleDao.listar(filtro.trim().toUpperCase());
	}
	
}

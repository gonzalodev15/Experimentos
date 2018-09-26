package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.TitleDao;
import pe.com.core.entity.Producto;
import pe.com.core.entity.Title;

public class TitleBusiness {

	private final TitleDao titleDao = new TitleDao();
	
	public void insertar(Title title) throws Exception{
		this.titleDao.insertar(title);
	}
	public void actualizar(Title title) throws Exception{
		this.titleDao.actualizar(title);
	}
	
	public void eliminar(Title title) throws Exception{
		this.titleDao.eliminar(title);
	}
	
	public Title obtener(Integer idTitle)throws Exception{
		return this.titleDao.obtener(new Title(idTitle));
	}
	
	public List<Title> listar() throws Exception{
		return this.titleDao.listar();
	}
	
	public List<Title> listar(String filtro) throws Exception{
		return this.titleDao.listar(filtro.trim().toUpperCase());
	}
	
}

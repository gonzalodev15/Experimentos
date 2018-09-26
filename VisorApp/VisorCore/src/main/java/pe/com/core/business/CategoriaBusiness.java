package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.CategoriaDao;
import pe.com.core.entity.Categoria;


public class CategoriaBusiness {

	private final CategoriaDao categoriaDao = new CategoriaDao();
	
	public void insertar(Categoria categoria) throws Exception{
		this.categoriaDao.insertar(categoria);
	}
	
	public void actualizar(Categoria categoria) throws Exception{
		this.categoriaDao.actualizar(categoria);
	}
	
	public void eliminar(Categoria categoria) throws Exception{
		this.categoriaDao.eliminar(categoria);
	}
	
	public Categoria obtener(Integer idProducto)throws Exception{
		return this.categoriaDao.obtener(new Categoria(idProducto));
	}
	
	public List<Categoria> listar() throws Exception{
		return this.categoriaDao.listar();
	}
	
	public List<Categoria> listar(String filtro) throws Exception{
		return this.categoriaDao.listar(filtro.trim().toUpperCase());
	}
}

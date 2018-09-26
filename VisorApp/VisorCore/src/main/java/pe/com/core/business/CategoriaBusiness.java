package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.CategoriaDao;
import pe.com.core.entity.Categoria;

<<<<<<< HEAD

=======
>>>>>>> cd13f4b8e07cb76afdcf02b34622df8795b6abe7
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

package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.UserDao;
import pe.com.core.entity.User;

public class UserBusiness {

private final UserDao userDao = new UserDao();
	
	public void insertar(User user) throws Exception{
		this.userDao.insertar(user);
	}
	
	public void actualizar(User user) throws Exception{
		this.userDao.actualizar(user);
	}
	
	public void eliminar(User user) throws Exception{
		this.userDao.eliminar(user);
	}
	
	public User obtener(Integer idUser)throws Exception{
		return this.userDao.obtener(new User(idUser));
	}
	
	public List<User> listar() throws Exception{
		return this.userDao.listar();
	}
	
	public List<User> listar(String firstname) throws Exception{
		return this.userDao.listar(firstname.trim().toUpperCase());
	}
	
	public Boolean Login (User user) throws Exception {
		return this.userDao.Login(user);
	}
	
}

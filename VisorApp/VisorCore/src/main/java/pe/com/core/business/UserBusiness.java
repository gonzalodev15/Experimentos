package pe.com.core.business;

import java.util.List;

import pe.com.core.dao.UserDao;
import pe.com.core.entity.User;

public class UserBusiness {

private final UserDao userDao = new UserDao();
	
	public void insertar(User user) {
		this.userDao.insertar(user);
	}
	
	public void actualizar(User user) {
		this.userDao.actualizar(user);
	}
	
	public void eliminar(User user) {
		this.userDao.eliminar(user);
	}
	
	public User obtener(Integer idUser) {
		return this.userDao.obtener(new User(idUser));
	}
	
	public List<User> listar(String firstname) {
		return this.userDao.listar(firstname.trim().toUpperCase());
	}
	
	public Boolean login (User user) {
		return this.userDao.login(user);
	}
	
}

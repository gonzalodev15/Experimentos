package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pe.com.core.entity.User;

public class UserDao extends Conexion<User>{

	@Override
	public User insertar(User e) {
		try {
			cn= obtenerConexion();
			String sql = "INSERT INTO users (firstname,lastname,email,password) VALUES (?,?,?,?)";
			pr = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pr.setString(1, e.getFirstname().toUpperCase());
            pr.setString(2, e.getLastname());
            pr.setString(3, e.getEmail());
            pr.setString(4, e.getPassword());
            pr.executeUpdate();
            rs = pr.getGeneratedKeys();
            rs.next();
            e.setIdUser(rs.getInt(1));
            rs.close();
            pr.close();
            cn.close();
		} catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
		return e;
	}

	@Override
	public User actualizar(User e) {
		try{
            cn = obtenerConexion();
            String sql = "UPDATE users SET firstname=?,lastname=?,email=? WHERE id=?";
            pr = cn.prepareStatement(sql);
            pr.setString(1, e.getFirstname().toUpperCase());
            pr.setString(2, e.getLastname());
            pr.setString(3, e.getEmail());
            pr.setInt(4, e.getIdUser());
            pr.executeUpdate();
            pr.close();
            cn.close();
        }catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
       return e;
	}

	@Override
	public User eliminar(User e) {
		try{
            cn = obtenerConexion();
            String sql = "DELETE FROM users WHERE id=?";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getIdUser());
            pr.executeUpdate();
            pr.close();
            cn.close();
        }catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
        return e;
	}

	@Override
	public User obtener(User e) {
		User user = null;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM users WHERE id=? ORDER BY firstname";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getIdUser());
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt(MyClass.ID_USER));
				user.setFirstname(rs.getString(MyClass.FIRSTNAME_USER).toUpperCase());
			}
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
		return user;
	}
	
	@Override
	public List<User> listar(String firstname) {
		List<User> users = new ArrayList<>();
		User user;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM users ";
			if(firstname.isEmpty()) {
				sql += " WHERE UCASE(firstname) LIKE '%?%'";
			}
			sql += " ORDER BY firstname";
			pr = cn.prepareStatement(sql);
			pr.setString(1, firstname);
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt(MyClass.ID_USER));
				user.setFirstname(rs.getString(MyClass.FIRSTNAME_USER).toUpperCase());
				users.add(user);
			}
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
		return users;
	}
	
	public Boolean login (User e) {
		List<User> users = new ArrayList<>();
		User user;
		try {
			String password= e.getPassword();
			String email= e.getEmail();
			cn= obtenerConexion();
			String sql = "SELECT * FROM users ";
			sql += " WHERE UCASE(password) LIKE '%?%'";
			sql += " and UCASE(email) LIKE '%?%'";
			pr = cn.prepareStatement(sql);
			pr.setString(1, password);
			pr.setString(2, email);
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt(MyClass.ID_USER));
				user.setFirstname(rs.getString(MyClass.FIRSTNAME_USER).toUpperCase());
				users.add(user);
			}
			rs.close();
            pr.close();
            cn.close();
		} catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
		
		return users.isEmpty();
	}
	
	
}

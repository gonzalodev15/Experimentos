package pe.com.core.dao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import pe.com.core.entity.Categoria;
import pe.com.core.entity.Producto;
import pe.com.core.entity.User;

public class UserDao extends Conexion<User>{

	@Override
	public User insertar(User e) throws Exception {
		try {
			cn= obtenerConexion();
			String sql = "INSERT INTO PRODUCTO (idUser,firstname,lastname,email,password) VALUES (?,?,?,?,?)";
			pr = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pr.setString(2, e.getFirstname().toUpperCase());
            pr.setString(3, e.getLastname());
            pr.setString(4, e.getEmail());
            pr.setString(5, e.getPassword());
            pr.executeUpdate();
            rs = pr.getGeneratedKeys();
            rs.next();
            e.setIdUser(rs.getInt(1));
		} finally {
        	rs.close();
            pr.close();
            cn.close();
        }
		return e;
	}

	@Override
	public User actualizar(User e) throws Exception {
		try{
            cn = obtenerConexion();
            String sql = "UPDATE User SET firstname=?,lastname=?,email=?,password=? WHERE idUser=?";
            pr = cn.prepareStatement(sql);
            pr.setString(2, e.getFirstname().toUpperCase());
            pr.setString(3, e.getLastname());
            pr.setString(4, e.getEmail());
            pr.setString(5, e.getPassword());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
       return e;
	}

	@Override
	public User eliminar(User e) throws Exception {
		try{
            cn = obtenerConexion();
            String sql = "DELETE FROM User WHERE idUser=?";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getIdUser());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
        return e;
	}

	@Override
	public User obtener(User e) throws Exception {
		User user = null;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM USER WHERE idUser=? ORDER BY firstname";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getIdUser());
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt("idUser"));
				user.setFirstname(rs.getString("firstname").toUpperCase());
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return user;
	}

	@Override
	public List<User> listar() throws Exception {
		List<User> users = new ArrayList<User>();
		User user;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM USER ORDER BY firstname";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt("idUser"));
				user.setFirstname(rs.getString("firstname").toUpperCase());
				users.add(user);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return users;
	}
	
	public List<User> listar(String firstname) throws Exception {
		List<User> users = new ArrayList<User>();
		User user;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM USER ";
			sql += " WHERE UCASE(firstname) LIKE '%" + firstname + "%'";
			sql += " ORDER BY firstname";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setIdUser(rs.getInt("idUser"));
				user.setFirstname(rs.getString("firstname").toUpperCase());
				users.add(user);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return users;
	}
	
	
}

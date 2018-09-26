package pe.com.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static pe.com.core.util.UtilCore.obtenerPropiedad;
import java.sql.SQLException;
import java.util.List;

import pe.com.core.entity.User;

public abstract class Conexion<E> {
    
    protected Connection cn = null;
    protected PreparedStatement pr = null;
    protected ResultSet rs = null;

    public Connection obtenerConexion() throws Exception {
        Class.forName(obtenerPropiedad("conexion.jdbc"));
        return (DriverManager.getConnection(obtenerPropiedad("conexion.url"), obtenerPropiedad("conexion.usuario"), obtenerPropiedad("conexion.clave")));
    }
    
    public abstract E insertar(E e) throws Exception;
    
    public abstract E actualizar(E e) throws Exception;
    
    public abstract E eliminar(E e) throws Exception;
    
    public abstract E obtener(E e) throws Exception;
    
    public abstract List<E> listar() throws Exception;

    protected void cerrar(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
        }
    }

    protected void cerrar(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
        }
    }
    
    protected void cerrar(PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
        }
    }

    protected void rollback(Connection cn) {
        try {
            if (cn != null) {
                cn.rollback();
            }
        } catch (SQLException e) {
        }

    }

	public User Login(User e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}

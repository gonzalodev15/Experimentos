package pe.com.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static pe.com.core.util.UtilCore.obtenerPropiedad;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public abstract class Conexion<E> {
    
    protected Connection cn = null;
    protected PreparedStatement pr = null;
    protected ResultSet rs = null;

    public Connection obtenerConexion() {
    	try {
    		Class.forName(obtenerPropiedad("conexion.jdbc"));
    		return (DriverManager.getConnection(obtenerPropiedad("conexion.url"), obtenerPropiedad("conexion.usuario"), obtenerPropiedad("conexion.clave")));
    	} catch(Exception e) {
    		Logger.getLogger(e.getMessage());
    		return null;
    	}
    }
    
    public abstract E insertar(E e);
    
    public abstract E actualizar(E e);
    
    public abstract E eliminar(E e);
    
    public abstract E obtener(E e);
    
    public abstract List<E> listar(String filter);

    protected void cerrar(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
        	Logger.getLogger(e.getMessage());
        }
    }

    protected void cerrar(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
        	Logger.getLogger(e.getMessage());
        }
    }
    
    protected void cerrar(PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
        	Logger.getLogger(e.getMessage());
        }
    }

    protected void rollback(Connection cn) {
        try {
            if (cn != null) {
                cn.rollback();
            }
        } catch (SQLException e) {
        	Logger.getLogger(e.getMessage());
        }

    }
}

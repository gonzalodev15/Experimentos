package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pe.com.core.entity.Playlist;

public class PlaylistDao extends Conexion<Playlist> {
	
	@Override
	public Playlist insertar(Playlist e) {
		try {
			cn = obtenerConexion();
			String sql = "INSERT INTO playlists (name,description,favorite,index_i) VALUES (?,?,?,?)";
			/*pr = cn.prepareStatement(sql,
					PreparedStatement.RETURN_GENERATED_KEYS);*/
			pr = cn.prepareStatement(sql);
			pr.setString(1, e.getName());
			pr.setString(2, e.getDescription().toUpperCase());
			pr.setInt(3, e.isFavorite());
			pr.setInt(4, e.getIndex());
			pr.executeUpdate();
			rs = pr.getGeneratedKeys();
			rs.next();
			//e.setId(rs.getInt(1));
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			System.out.println(err.getMessage());
			err.printStackTrace();
		}
		return e;
	}

	@Override
	public Playlist actualizar(Playlist e){
		try {
			cn = obtenerConexion();
			String sql = "UPDATE playlists SET favorite=? WHERE id=?";
			pr = cn.prepareStatement(sql);
			//pr.setString(1, e.getName().toUpperCase());
			//pr.setString(2, e.getDescription().toUpperCase());
			pr.setInt(1, e.isFavorite());
			pr.setInt(2, e.getId());
			pr.executeUpdate();
			pr.close();
			cn.close();
		} catch (Exception err) {
			System.out.println(err.getMessage());
			err.printStackTrace();
		}
		return e;
	}

	@Override
	public Playlist eliminar(Playlist e) {
		try {
			cn = obtenerConexion();
			String sql = "DELETE FROM playlists WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getId());
			pr.executeUpdate();
			pr.close();
			cn.close();
		} catch (Exception err) {
			System.out.println(err.getMessage());
			err.printStackTrace();
		}
		return e;
	}

	@Override
	public Playlist obtener(Playlist e) {
		Playlist play = null;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM playlists WHERE id=? ORDER BY name";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getId());
			rs = pr.executeQuery();
			while (rs.next()) {
				play = new Playlist();
				play.setId(rs.getInt(MyClass.ID_PLAY));
				play.setName(rs.getString(MyClass.NAME_PLAY).toUpperCase());
				play.setDescription(rs.getString(MyClass.DESCRIPTION_PLAY).toUpperCase());
				play.setFavorite(rs.getInt(MyClass.FAVORITE_PLAY));
				play.setIndex(rs.getInt(MyClass.INDEX_I_PLAYLIST));
			}
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			System.out.println(err.getMessage());
			err.printStackTrace();
		}
		return play;
	}

	public List<Playlist> listar(String nombre) {
		List<Playlist> plays = new ArrayList<>();
		Playlist play;
	
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM playlists ";
			if(nombre.isEmpty()) {
				sql += " WHERE UCASE(name) LIKE '%?%'";
			}
			sql += " ORDER BY name";
			pr = cn.prepareStatement(sql);
			pr.setString(1, nombre.toUpperCase());
			rs = pr.executeQuery();
			while (rs.next()) {
				play = new Playlist();
				play.setId(rs.getInt(MyClass.ID_PLAY));
				play.setName(rs.getString(MyClass.NAME_PLAY).toUpperCase());
				play.setDescription(rs.getString(MyClass.DESCRIPTION_PLAY).toUpperCase());
				play.setFavorite(rs.getInt(MyClass.FAVORITE_PLAY));
				plays.add(play);
			}
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			System.out.println(err.getMessage());
			err.printStackTrace();
		}
		return plays;
	}
}

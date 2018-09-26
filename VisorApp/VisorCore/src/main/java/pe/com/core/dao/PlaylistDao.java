package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import pe.com.core.entity.Playlist;

public class PlaylistDao extends Conexion<Playlist> {
//id, name, description
	@Override
	public Playlist insertar(Playlist e) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "INSERT INTO playlists (name,description) VALUES (?,?)";
			pr = cn.prepareStatement(sql,
					PreparedStatement.RETURN_GENERATED_KEYS);
			pr.setString(1, e.getName().toUpperCase());
			pr.setString(2, e.getDescription().toUpperCase());
			pr.executeUpdate();
			rs = pr.getGeneratedKeys();
			rs.next();
			e.setId(rs.getInt(1));
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return e;
	}

	@Override
	public Playlist actualizar(Playlist e) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "UPDATE playlists SET name=?, description=? WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setString(1, e.getName().toUpperCase());
			pr.setString(2, e.getDescription().toUpperCase());
			pr.setInt(3, e.getId());
			pr.executeUpdate();
		} finally {
			pr.close();
			cn.close();
		}
		return e;
	}

	@Override
	public Playlist eliminar(Playlist e) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "DELETE FROM playlists WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getId());
			pr.executeUpdate();
		} finally {
			pr.close();
			cn.close();
		}
		return e;
	}

	@Override
	public Playlist obtener(Playlist e) throws Exception {
		Playlist play = null;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM playlists WHERE id=? ORDER BY name";
			pr = cn.prepareStatement(sql);
			pr.setInt(1, e.getId());
			rs = pr.executeQuery();
			while (rs.next()) {
				play = new Playlist();
				play.setId(rs.getInt("id"));
				play.setName(rs.getString("name").toUpperCase());
				play.setDescription(rs.getString("description").toUpperCase());
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return play;
	}

	@Override
	public List<Playlist> listar() throws Exception {
		List<Playlist> plays = new ArrayList<Playlist>();
		Playlist play;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM CATEGORIA ORDER BY nombre";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				play = new Playlist();
				play.setId(rs.getInt("id"));
				play.setName(rs.getString("name").toUpperCase());
				plays.add(play);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return plays;
	}

	public List<Playlist> listar(String nombre) throws Exception {
		List<Playlist> plays = new ArrayList<Playlist>();
		Playlist play;
		try {
			cn = obtenerConexion();
			String sql = "SELECT * FROM playlists ";
			sql += " WHERE UCASE(name) LIKE '%" + nombre + "%'";
			sql += " ORDER BY name";
			pr = cn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				play = new Playlist();
				play.setId(rs.getInt("id"));
				play.setName(rs.getString("name").toUpperCase());
				plays.add(play);
			}
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return plays;
	}
}

package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import pe.com.core.entity.Playlist;
import pe.com.core.entity.Title;

public class TitleDao extends Conexion<Title>{

	@Override 
	public Title insertar(Title e) throws Exception {
		try {
			cn = obtenerConexion();
			String sql = "INSERT INTO titles (playlist_id, title_name, year) VALUES(?, ?, ?)";
			pr = cn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			if(e.getPlaylist() != null) {
				pr.setInt(1, e.getPlaylist().getId());
			} else {
				pr.setInt(1, e.getPlaylistId());
			}
			
			pr.setString(2, e.getName());
			pr.setString(3, e.getYear());
		} finally {
			rs.close();
			pr.close();
			cn.close();
		}
		return e;
	}
	
	@Override
    public Title actualizar(Title e) throws Exception {
       try{
            cn = obtenerConexion();
            String sql = "UPDATE titles SET playlist_id=?,title_name=?,year=? WHERE id=?";
            pr = cn.prepareStatement(sql);
			if(e.getPlaylist() != null) {
				pr.setInt(1, e.getPlaylist().getId());
			} else {
				pr.setInt(1, e.getPlaylistId());
			}
			pr.setString(2, e.getName());
            pr.setString(3, e.getYear());

            pr.setInt(4, e.getTitleId());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
       return e;
    }

    @Override
    public Title eliminar(Title e) throws Exception {
        try{
            cn = obtenerConexion();
            String sql = "DELETE FROM titles WHERE id=?";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getTitleId());
            pr.executeUpdate();
        }finally{
            pr.close();
            cn.close();
        }
        return e;
    }

    @Override
    public Title obtener(Title e) throws Exception {
        Title title = null;
        try{
            cn = obtenerConexion();
            String sql = "select p.*, t.title_name as title from titles t inner join playlists p on p.id = t.playlist_id WHERE t.id=? ORDER BY title_name";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getTitleId());
            rs = pr.executeQuery();
            while(rs.next()){
                title = new Title();
                title.setTitleId(rs.getInt("id"));
                title.setName(rs.getString("title_name"));
                title.setPlaylistId(rs.getInt("playlist_id"));
                title.setYear(rs.getString("year"));
                title.setPlaylist(new Playlist());
                title.getPlaylist().setId(rs.getInt("id"));
            }
        }finally{
            rs.close();
            pr.close();
            cn.close();
        }
        return title;
    }

    @Override
    public List<Title> listar() throws Exception {
       List<Title> titles = new ArrayList<Title>();
        Title title;
        try{
            cn = obtenerConexion();
            String sql = "select p.*, t.title_name as title from titles t inner join playlists p on p.id = t.playlist_id ORDER BY title_name";
            pr = cn.prepareStatement(sql);
            rs = pr.executeQuery();
            while(rs.next()){
                title = new Title();
                title.setTitleId(rs.getInt("id"));
                title.setPlaylistId(rs.getInt("playlist_id"));
                title.setName(rs.getString("title"));
                title.setYear(rs.getString("year"));
                title.setPlaylist(new Playlist());
                title.getPlaylist().setId(rs.getInt("idCategoria"));
                title.getPlaylist().setName(rs.getString("playlist").toUpperCase());
                titles.add(title);
            }
        }finally{
            rs.close();
            pr.close();
            cn.close();
        }
        return titles;
    }
    
    
    public List<Title> listar(String nombre) throws Exception {
        List<Title> titles = new ArrayList<Title>();
         Title title;
         try{
             cn = obtenerConexion();
             String sql = "select p.*, t.title_name as title from titles t inner join playlist p on p.id = t.playlist_id ";
             sql+=" WHERE UCASE(p.title) LIKE '%?%'" ;
             sql+=" ORDER BY title_name";
             pr = cn.prepareStatement(sql);
             pr.setString(1, nombre.toUpperCase());
             rs = pr.executeQuery();
             while(rs.next()){
                 title = new Title();
                 title.setPlaylistId(rs.getInt("playlist_id"));
                 title.setYear(rs.getString("year"));
                 title.setName(rs.getString("title"));
                 title.setPlaylist(new Playlist());
                 title.getPlaylist().setId(rs.getInt("id"));
                 title.getPlaylist().setName(rs.getString("playlist"));
                 titles.add(title);
             }
         }finally{
             rs.close();
             pr.close();
             cn.close();
         }
         return titles;
     }
}

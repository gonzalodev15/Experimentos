package pe.com.core.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pe.com.core.entity.Playlist;
import pe.com.core.entity.Title;

public class TitleDao extends Conexion<Title>{
	
	@Override 
	public Title insertar(Title e) {
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
			rs.close();
			pr.close();
			cn.close();
		} catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
		return e;
	}
	
	@Override
    public Title actualizar(Title e) {
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
            pr.close();
            cn.close();
        }catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
       return e;
    }

    @Override
    public Title eliminar(Title e)  {
        try{
            cn = obtenerConexion();
            String sql = "DELETE FROM titles WHERE id=?";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getTitleId());
            pr.executeUpdate();
            pr.close();
            cn.close();
        }catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
        return e;
    }

    @Override
    public Title obtener(Title e)  {
        Title title = null;
        try{
            cn = obtenerConexion();
            String sql = "select p.*, t.title_name as title from titles t inner join playlists p on p.id = t.playlist_id WHERE t.id=? ORDER BY title_name";
            pr = cn.prepareStatement(sql);
            pr.setInt(1, e.getTitleId());
            rs = pr.executeQuery();
            while(rs.next()){
                title = new Title();
                title.setTitleId(rs.getInt(MyClass.ID_TITLE));
                title.setName(rs.getString(MyClass.TITLE_NAME_TITLE));
                title.setPlaylistId(rs.getInt(MyClass.PLAYLIST_ID_TITLE));
                title.setYear(rs.getString(MyClass.YEAR_TITLE));
                title.setPlaylist(new Playlist());
                title.getPlaylist().setId(rs.getInt(MyClass.ID_TITLE));
            }
            rs.close();
            pr.close();
            cn.close();
        }catch (Exception err) {
			Logger.getLogger(err.getMessage());
		}
        return title;
    }
    
    @Override
    public List<Title> listar(String nombre) {
        List<Title> titles = new ArrayList<>();
         Title title;
         try{
             cn = obtenerConexion();
             String sql = "select p.*, t.title_name as title from titles t inner join playlist p on p.id = t.playlist_id ";
             if(nombre.isEmpty()) {
            	 sql+=" WHERE UCASE(p.title) LIKE '%?%'" ;
             }
             sql+=" ORDER BY title_name";
             pr = cn.prepareStatement(sql);
             pr.setString(1, nombre.toUpperCase());
             rs = pr.executeQuery();
             while(rs.next()){
                 title = new Title();
                 title.setPlaylistId(rs.getInt(MyClass.PLAYLIST_ID_TITLE));
                 title.setYear(rs.getString(MyClass.YEAR_TITLE));
                 title.setName(rs.getString(MyClass.TITLE_NAME_TITLE));
                 title.setPlaylist(new Playlist());
                 title.getPlaylist().setId(rs.getInt(MyClass.ID_TITLE));
                 title.getPlaylist().setName(rs.getString(MyClass.PLAYLIST_TITLE));
                 titles.add(title);
             }
             rs.close();
             pr.close();
             cn.close();
         }catch (Exception err) {
 			Logger.getLogger(err.getMessage());
 		}
         return titles;
     }
}

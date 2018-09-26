package pe.com.core.util;

import java.util.ResourceBundle;


public final class UtilCore {

    private UtilCore(){
    }
    

    public static String obtenerPropiedad(String clave){
        ResourceBundle rb = ResourceBundle.getBundle("propiedades");
        return rb.getString(clave);
    }
}

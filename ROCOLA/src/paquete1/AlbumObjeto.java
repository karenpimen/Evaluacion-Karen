
package paquete1;

import java.util.ArrayList;

public class AlbumObjeto
{
    String nombreAlmbum;
    int id;
    ArrayList<CancionObjeto> canciones;
    
    public AlbumObjeto(String nombreAlmbum,  int id,  ArrayList<CancionObjeto> cancion) {
        this.canciones = new ArrayList<CancionObjeto>();
        this.nombreAlmbum = nombreAlmbum;
        this.id = id;
        this.canciones = cancion;
    }
    
    public String getNombreAlmbum() {
        return this.nombreAlmbum;
    }
    
    public void setNombreAlmbum( String nombreAlmbum) {
        this.nombreAlmbum = nombreAlmbum;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId( int id) {
        this.id = id;
    }
    
    public ArrayList<CancionObjeto> getCanciones() {
        return this.canciones;
    }
    
    public void setCanciones( CancionObjeto cancion) {
        this.canciones.add(cancion);
    }
}

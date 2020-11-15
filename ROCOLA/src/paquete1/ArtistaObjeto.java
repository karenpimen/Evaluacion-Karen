
package paquete1;

import java.util.ArrayList;

public class ArtistaObjeto
{
    String nombre;
    int id;
    ArrayList<AlbumObjeto> albumes;
    
    public ArtistaObjeto(String nombre,  int id,  ArrayList<AlbumObjeto> albumes) {
        this.albumes = new ArrayList<AlbumObjeto>();
        this.albumes = albumes;
        this.nombre = nombre;
        this.id = id;
    }
    
    public ArtistaObjeto(String nombre,  int id) {
        this.albumes = new ArrayList<AlbumObjeto>();
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId( int id) {
        this.id = id;
    }
    
    public ArrayList<AlbumObjeto> getalbumes() {
        return this.albumes;
    }
    
    public void setalbumes( AlbumObjeto albumes) {
        this.albumes.add(albumes);
    }
}
package paquete1;

public class CancionObjeto
{
    String nombre;
    String genero;
    int id;
    int tiempo;
    
    public CancionObjeto(String nombre,  String genero,  int id,  int tiempo) {
        this.nombre = nombre;
        this.genero = genero;
        this.id = id;
        this.tiempo = tiempo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getTiempo() {
        return this.tiempo;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
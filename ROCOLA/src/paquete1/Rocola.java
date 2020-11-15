package paquete1;


import java.util.Scanner;
import java.util.ArrayList;

public class Rocola
{
    ArrayList<ArtistaObjeto> artistas;
    Scanner leer;
    
    public Rocola() {
        this.artistas = new ArrayList<ArtistaObjeto>();
        this.leer = new Scanner(System.in);
    }
    
    public void menu() {
        int opcion;
        do {
            System.out.println("1.-Agregar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Salir");
            opcion = this.leer.nextByte();
            switch (opcion) {
                case 1: {
                    int opcion2;
                    do {
                        System.out.println("1.-Agregar Artista");
                        System.out.println("2.-Agregar Album");
                        System.out.println("3.-Agregar Cancion");
                        System.out.println("4.-Salir");
                        opcion2 = this.leer.nextInt();
                        switch (opcion2) {
                            case 1: {
                                this.agregarArtista();
                                System.out.println(opcion2);
                                continue;
                            }
                            case 2: {
                                this.leer.nextLine();
                                System.out.println("Ingresa el nombre del artista para agregar un nuevo album");
                                String nombre = this.leer.nextLine();
                                this.AgregarAlbum(nombre);
                                continue;
                            }
                            case 3: {
                                this.leer.nextLine();
                                System.out.println("Ingresa el nombre del artista");
                                String nombre = this.leer.nextLine();
                                int id = this.BuscarArtista(nombre);
                                System.out.println("Ingresa el nombre del album");
                                String album = this.leer.nextLine();
                                int id2 = this.BuscarAlbum(album);
                                if (id >= 0 && id2 >= 0) {
                                this.AgregarCanciones(id, id2);
                                }
                                System.out.println("Nombre o artista invalidos");
                                continue;
                            }
                            default: {
                                continue;
                            }
                        }
                    } while (opcion2 != 4);
                }
                case 2: {
                   this.MostrarDatos();
                   continue;
                }
                
                case 3: {
                    int opcion2;
                    do {
                        System.out.println("1.-Eliminar Artista");
                        System.out.println("2.-Eliminar Album");
                        System.out.println("3.-Eliminar Cancion");
                        System.out.println("4.-Salir");
                        opcion2 = this.leer.nextInt();
                        switch (opcion2) {
                            case 1: {
                                this.leer.nextLine();
                                System.out.println("Ingresa el nombre del artista a eliminar");
                                String nombre = this.leer.nextLine();
                                this.EliminarArtista(nombre);
                                continue;
                            }
                            case 2: {
                                this.leer.nextLine();
                                System.out.println("Ingresa el nombre del artista para ver sus albumes");
                                String nombre = this.leer.nextLine();
                                this.EliminarAlbum(nombre);
                                continue;
                            }
                            case 3: {
                                this.leer.nextLine();
                                System.out.println("Ingresa el nombre del artista para ver sus albumes");
                                String nombre = this.leer.nextLine();
                                this.EliminarCancion(nombre);
                                continue;
                            }
                            default: {
                                continue;
                            }
                        }
                    } while (opcion2 != 4);
                    continue;
                }
                default: {
                    System.out.println("Opcion no valida");
                }
            }
        } while (opcion !=4);
    }
    
    
    public int BuscarArtista( String nombre) {
        for (int i = 0; i < this.artistas.size(); ++i) {
            if (this.artistas.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
    
    public void EliminarArtista( String nombre) {
        int i = this.BuscarArtista(nombre);
        if (i >= 0) {
            this.artistas.remove(i);
            System.out.println("Artista eliminado");
        }
        else {
            System.out.println("Artista no valido");
        }
    }
    
    public int BuscarAlbum( String nombre) {
        int i = this.BuscarArtista(nombre);
        if (i >= 0 && this.artistas.get(i).getalbumes() != null) {
            System.out.println("Estos son los albumes disponibles");
            for (int j = 0; j < this.artistas.get(i).getalbumes().size(); ++j) {
                System.out.println(j + 1 + ".-" + this.artistas.get(i).getalbumes().get(j).getNombreAlmbum());
            }
            System.out.println("Escribe el numero a seleccionar");
             int valor = this.leer.nextInt();
            if (valor >= 0 && valor <= this.artistas.get(i).getalbumes().size()) {
                return valor - 1;
            }
        }
        return -1;
    }
    
    public void EliminarAlbum( String nombre) {
         int i = this.BuscarAlbum(nombre);
        if (i >= 0) {
            this.artistas.remove(i);
            System.out.println("Eliminado con exito");
        }
        else {
            System.out.println("Numero no valido");
        }
    }
    
    public int BuscarCancion( String artista) {
         int a = this.BuscarArtista(artista);
         int i = this.BuscarAlbum(artista);
        if (a >= 0 && i >= 0 && this.artistas.get(a).getalbumes().get(i).getCanciones() != null) {
            System.out.println("Estos son las canciones disponibles en este album");
            for (int j = 0; j < this.artistas.get(a).getalbumes().size(); ++j) {
                System.out.println(j + 1 + ".-" + this.artistas.get(a).getalbumes().get(i).getCanciones().get(j).getNombre());
            }
            System.out.println("Escribe el numero a seleccionar");
            int valor = this.leer.nextInt();
            if (valor >= 0 && valor <= this.artistas.get(a).getalbumes().get(i).getCanciones().size()) {
                return valor - 1;
            }
        }
        else {
            System.out.println("Artista o album no encontrado");
        }
        return -1;
    }
    
    public void EliminarCancion( String artista) {
        int b = this.BuscarCancion(artista);
        if (b >= 0) {
            this.artistas.remove(b);
            System.out.println("Canción eliminada con exito");
        }
        else {
            System.out.println("Canción no encontrada");
        }
    }

    public void AgregarCanciones( int nom,  int alb) {
        if (nom >= 0 && alb >= 0) {
            do {
                System.out.println("Nombre de la canción");
                 String cancion = this.leer.next();
                System.out.println("Genero de la canción");
                 String genero = this.leer.next();
                System.out.println("ID de la canción");
                 int idCancion = this.leer.nextInt();
                System.out.println("Duración de la canción");
                 int tiempo = this.leer.nextInt();
                System.out.println("Deseas agregar otra cancion? s/n");
                this.artistas.get(nom).getalbumes().get(alb).setCanciones(new CancionObjeto(cancion, genero, idCancion, tiempo));
            } while (this.leer.next().toLowerCase().contains("s"));
        }
        else {
            System.out.println("Artista o album inválidos");
        }
    }
    
    public void AgregarAlbum( String nombre) {
         int a = this.BuscarArtista(nombre);
        if (a >= 0) {
            byte opc;
            do {
                 ArrayList<CancionObjeto> canciones = new ArrayList<CancionObjeto>();
                System.out.println("Ingresa el nuevo nombre del Album");
                 String nom = this.leer.next();
                System.out.println("Ingresa el nuevo id del Album");
                 int id = this.leer.nextInt();
                System.out.println("1.-Agregar canciones");
                System.out.println("2.-Agregar otro album");
                System.out.println("3.-Salir");
                opc = this.leer.nextByte();
                if (opc == 1) {
                    this.artistas.get(a).setalbumes(new AlbumObjeto(nom, id, (ArrayList)canciones));
                    this.AgregarCanciones(a, this.artistas.get(a).getalbumes().size() - 1);
                }
                else {
                    this.artistas.get(a).setalbumes(new AlbumObjeto(nom, id, (ArrayList)canciones));
                }
            } while (opc == 2);
        }
        else {
            System.out.println("Artista no encontrado");
        }
    }
    
    public void agregarArtista() {
        String opc2;
        do {
            ArrayList<AlbumObjeto> albumes = new ArrayList<AlbumObjeto>();
            this.leer.nextLine();
            System.out.println("Ingresa el nombre del artista");
            String artista = this.leer.nextLine();
            System.out.println("Ingresa el codigo del artista");
            int id = this.leer.nextInt();
            System.out.println("1.-Deseas agregar un Album? s/n");
            if (this.leer.next().toLowerCase().contains("s")) {
                String opc3;
                do {
                    this.leer.nextLine();
                    System.out.println("Ingresa el nombre del Album");
                    String album = this.leer.nextLine();
                    System.out.println("Ingresa el codigo del Album");
                    int id2 = this.leer.nextInt();
                    System.out.println("Deseas agregar canciones a este album? s/n");
                    if (this.leer.next().toLowerCase().contains("s")) {
                         ArrayList<CancionObjeto> canciones = new ArrayList<CancionObjeto>();
                        do {
                            this.leer.nextLine();
                            System.out.println("Nombre de la canción");
                            String cancion = this.leer.nextLine();
                            System.out.println("Genero de la canción");
                            String genero = this.leer.nextLine();
                            System.out.println("ID de la canción");
                            int idCancion = this.leer.nextInt();
                            System.out.println("Duración de la canción");
                            int tiempo = this.leer.nextInt();
                            System.out.println("Deseas agregar otra cancion? s/n");
                            canciones.add(new CancionObjeto(cancion, genero, idCancion, tiempo));
                        } while (this.leer.next().toLowerCase().contains("s"));
                        albumes.add(new AlbumObjeto(album, id2, (ArrayList)canciones));
                        System.out.println("Desea agregar otro album? s/n");
                        opc3 = this.leer.next();
                    }
                    else {
                         ArrayList<CancionObjeto> canciones = new ArrayList<CancionObjeto>();
                        albumes.add(new AlbumObjeto(album, id2, (ArrayList)canciones));
                        System.out.println("Desea agregar otro album? s/n");
                        opc3 = this.leer.next();
                    }
                } while (opc3.toLowerCase().contains("s"));
                System.out.println("Desea agregar otro artista? s/n");
                opc2 = this.leer.next();
            }
            else {
                System.out.println("Desea agregar otro artista? s/n");
                opc2 = this.leer.next();
            }
            this.artistas.add(new ArtistaObjeto(artista, id, (ArrayList)albumes));
        } while (opc2.toLowerCase().contains("s"));
    }
    
    public void MostrarDatos() {
        for (int i = 0; i < this.artistas.size(); ++i) {
        System.out.println("Artista: " + this.artistas.get(i).getNombre());
        System.out.println("ID: " + this.artistas.get(i).getId());
            if (this.artistas.get(i).getalbumes() != null) {
            System.out.println("    albumes: ");
            for (int j = 0; j < this.artistas.get(i).getalbumes().size(); ++j) {
                System.out.println("    Album: " + this.artistas.get(i).getalbumes().get(j).getNombreAlmbum());
                System.out.println("    ID: " + this.artistas.get(i).getalbumes().get(j).getId());
                if (this.artistas.get(i).getalbumes().get(j).getCanciones() != null) {
                    System.out.println("        Canciones: ");
                    for (int k = 0; k < this.artistas.get(i).getalbumes().get(j).getCanciones().size(); ++k) {
                        System.out.println("        " + (k + 1) + ".-" + this.artistas.get(i).getalbumes().get(j).getCanciones().get(k).getNombre());
                    }
                }
            }
        }
        }
    }
    
}


package peliculas.modelo;


public interface ICatalogoPeliculas {
    
    void insertarPelicula(pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
    
}

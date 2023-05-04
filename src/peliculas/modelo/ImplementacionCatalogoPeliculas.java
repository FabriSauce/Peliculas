
package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImplementacionCatalogoPeliculas implements ICatalogoPeliculas{
    
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPeliculas() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    @Override
    public void insertarPelicula(pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(
                null,
                this.listaPeliculas,
                "LISTA DE PELICULAS",
                0);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        
        for(var pelicula : this.listaPeliculas){
            if(pelicula.equals(nombrePelicula)){
                resultado = pelicula;
                break;
            
            } else{
                resultado = pelicula;
            }
            
            if(nombrePelicula.equals(resultado)){
                
                JOptionPane.showMessageDialog(
                null,
                "Resultado: " + resultado,
                "BUSCAR PELICULA",
                JOptionPane.QUESTION_MESSAGE);
            
            } else{
                JOptionPane.showMessageDialog(
                null,
                "NO SE ENCONTRO LA PELICULA: " + nombrePelicula,
                "BUSCAR PELICULA",
                JOptionPane.WARNING_MESSAGE);
            }
        
        }
    }

    
}

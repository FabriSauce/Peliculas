
package peliculas.ui;

import peliculas.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    
    public static void interfazUsuario(){
    
    ICatalogoPeliculas peliculas = new ImplementacionCatalogoPeliculas();
    pelicula pelicula;
    
    CERRAR:
    while (true) {

        String opcion = JOptionPane.showInputDialog(null, """
                                                          1 - Insertar pelicula
                                                          2 - Listar pelicula
                                                          3 - Buscar pelicula
                                                          4 - Salir""",
                "INGRESE UNA OPCIÓN",
                3
        );
        
        int opcionInt = 0;
        try {
            opcionInt = Integer.parseInt(opcion);
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(
                    null,
                    e,
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                    );
        
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(
                    null,
                    "Las opciones tienen que ser números enteros\n" + e,
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                    );
        }
        
        
        switch (opcionInt) {
        
            case 1 -> {
                String nombrePelicula = JOptionPane.showInputDialog(
                        null,
                        "INGRESE EL NOMBRE DE LA PELICULA",
                        "ENTRADA",
                        3
                );
                
                pelicula = new pelicula(nombrePelicula);
                peliculas.insertarPelicula(pelicula);
            }
            
            case 2 -> peliculas.listarPelicula();
            
            case 3 -> {
                String nombrePelicula = JOptionPane.showInputDialog(
                        null,
                        "INGRESE EL NOMBRE DE LA PELICULA",
                        "Ingrese",
                        3
                );
                peliculas.buscarPelicula(nombrePelicula);
            }
                
            case 4 -> {
                break CERRAR;
            }
                
            default -> JOptionPane.showMessageDialog(null, """
                                                           Opcion incorrecta
                                                           Vuelva a ingresar una
                                                           Opcion correcta
                                                           Las opciones son de la 1 a la 4""",
                        "error",
                        JOptionPane.ERROR_MESSAGE
                );
        
        }

    }
    
    }
    
    
}


package peliculas.modelo;

import java.io.Serializable;
import java.util.Objects;

public class pelicula implements Serializable{
    
    private String nombre;

    public pelicula() {
    }

    public pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final pelicula other = (pelicula) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    

    
    
    
}

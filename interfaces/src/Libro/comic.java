package Libro;
import java.time.LocalDate;

public class comic extends libro{
    

    
        public comic(int precio, LocalDate fechaDePublicacion, String autor, String titulo, String editorial,
            String personaje) {
        super(precio, fechaDePublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

        private String personaje;

        public void setPersonaje(String personaje) {
            this.personaje = personaje;
        }

        public String getPersonaje() {
            return personaje;
        }

        @Override
        public String toString() {
            
            return super.toString() + " De " + getPersonaje();
        }

  
}

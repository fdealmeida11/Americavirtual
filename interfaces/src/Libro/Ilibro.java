package Libro;
import java.time.LocalDate;

public interface Ilibro {
        LocalDate getFechaDePublicacion();
        String getAutor();
        String getTitulo();
        String getEditorial();
}

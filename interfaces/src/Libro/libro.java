package Libro;
import java.time.LocalDate;
import Producto.Producto;

public class libro extends Producto implements Ilibro{

    private LocalDate FechaDePublicacion;
    private String Autor;
    private String Titulo;
    private String Editorial;


    public libro(int Precio, LocalDate fechaDePublicacion, String autor, String titulo, String editorial) {
        super(Precio);
        FechaDePublicacion = fechaDePublicacion;
        Autor = autor;
        Titulo = titulo;
        Editorial = editorial;
    }


    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        FechaDePublicacion = fechaDePublicacion;
    }


    public void setAutor(String autor) {
        Autor = autor;
    }


    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


    public void setEditorial(String editorial) {
        Editorial = editorial;
    }


    public LocalDate getFechaDePublicacion() {
        return FechaDePublicacion;
    }


    public String getAutor() {
        return Autor;
    }


    public String getTitulo() {
        return Titulo;
    }


    public String getEditorial() {
        return Editorial;
    }


    {

    
}
    @Override
    public String toString() {
              return super.toString() + " Autor: " + getAutor() + " Nombre " + getTitulo() + " Editorial: " + getEditorial();
    }}

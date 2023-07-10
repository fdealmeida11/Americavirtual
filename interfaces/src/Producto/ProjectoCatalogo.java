package Producto;

import java.time.LocalDate;

import Electronico.TvLcd;
import Electronico.iphone;
import Libro.comic;
import Libro.libro;
public class ProjectoCatalogo {

    public static void main(String[] args) {

        Iproducto[] producto = new Producto[6];
        producto[0] = new TvLcd(350000, "sony", 24);
        producto[1] = new libro(3500,LocalDate.of(2010, 8, 27) , "Stephen King", "IT", "Emece");
        producto[2] = new comic(3500, LocalDate.of(1800,7,5), "Edgar Mur ", "WatchMen", "Dc", "Watchmen");
        producto[3] = new iphone(75000, "Aple", "VII", "blanco") ;
        

      imprimir(producto[0]);
      imprimir(producto[1]);
      imprimir(producto[2]);
      imprimir(producto[3]);
    }

   
    public static void imprimir(Iproducto producto)
    {   System.out.println(producto);}
}

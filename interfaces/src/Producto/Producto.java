package Producto;
public abstract class Producto implements Iproducto{

protected int Precio;


public int getPrecio() {
    return Precio;
}


public Producto() {
}


public Producto(int precio) {
    Precio = precio;
}


@Override
public String toString() {
    
    return " el precio es " + getPrecio() + "$ ";
}




}




    


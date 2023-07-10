package Producto;
public abstract class Producto implements Iproducto{

protected int Precio;
// private double PrecioVenta;

public Producto(int precio, double precioVenta) {
    Precio = precio;
}

public Producto(int precio) {
}

public int getPrecio() {
    return Precio;
}


@Override
public String toString() {
    
    return " el precio es " + getPrecio();
}

@Override
public double getPrecioVenta() {
        return getPrecio();
}




}




    


package Electronico;

public class iphone extends electronico{


    private String modelo;
    private String color;

 

    public iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    
    public String getColor() {
        return color;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public double getPrecioVenta() {
        
        return getPrecio();
    }



    @Override
    public String toString() {
        
        return super.toString() + " Modelo: " + getModelo() + " de color " + getColor();
    }
    
    
}

package Electronico;
public class TvLcd extends electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    @Override
    public double getPrecioVenta() {
        
        return getPrecio();
    }

  
    @Override
    public String toString() {
          
        return super.toString() + " Tv de " + getPulgadas() + " pulgadas";
    }

    
}

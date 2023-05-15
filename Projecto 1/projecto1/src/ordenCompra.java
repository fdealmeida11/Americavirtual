

public class ordenCompra {

   private int id;
   private String descripcion;
   private int fechaDia;
   private int fechaMes;
   private String [] productos;
    private String cliente;
    

    public ordenCompra (String desc){
        descripcion = desc;
    }



    public int getId() {
        return id;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public int getFechaDia() {
        return fechaDia;
    }



    public int getFechaMes() {
        return fechaMes;
    }



    public String[] getProductos() {
        return productos;
    }



    public String getCliente() {
        return cliente;
    }



    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }



    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }



    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void addProducto (String producto){
       

    }

    




}


  
    


package Electronico;

import Producto.Producto;

public abstract class electronico extends Producto implements Ielectronico{


        private String Fabricante;



        
        public electronico(int precio, String fabricante) {
            super(precio);
            Fabricante = fabricante;
        }




        public String getFabricante() {
            return Fabricante;
        }




        public void setFabricante(String fabricante) {
            Fabricante = fabricante;
        }




        @Override
        public String toString() {
            
            return super.toString() + " Fabricante: "  
                     + getFabricante() + " Descripcion: ";
        }

       

}

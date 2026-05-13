package controllers;

import models.Producto;

public class BusquedaBinaria {
    public int findProdcutIndexByStock(Producto[] productos, int stockBuscar){
        // ordenar
        sortProductByStock(productos);

        int bajo = 0;
        int alto = productos.length -1;
        
        while(bajo <= alto){
            int centro = (bajo + alto)/2;
            if(productos[centro].getStock() == stockBuscar){
                return centro;
            }
            // defino si voy a la derecha o izquierda
            if(productos[centro].getStock() > stockBuscar)
                alto  = centro - 1;

            else
                bajo = centro + 1;
        }
        return -1; 

    }

    private void sortProductByStock(Producto[] productos){

        for (int i = 0; i<productos.length - 1;i++){
            boolean swap = false;
            for(int j = 0; j<productos.length -i-1;j++){
                Producto aux = productos[j];
                productos[j] = productos[j+1];
                productos[j + 1] = aux;
                swap = true;
            }
        }   
        

    }
    public int findProductIndexByNombre(Producto[] productos, String nombreBuscar) {

      // ordenar
        sortProductByNombre(productos);

        int bajo = 0;
        int alto = productos.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;

            if (productos[centro].getName().equals(nombreBuscar)) {
                return centro;
            }

            // izquierda o derecha
            if (productos[centro].getName().compareTo(nombreBuscar) > 0) {

                alto = centro - 1;

            } else {

                bajo = centro + 1;
            }
        }

    

    return -1;
    }   

    private void sortProductByNombre(Producto[] productos) {

        for (int i = 0; i < productos.length - 1; i++) {

            boolean swap = false;

            for (int j = 0; j < productos.length - i - 1; j++) {

                if (productos[j].getName()
                    .compareTo(productos[j + 1].getName()) > 0) {

                    Producto aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;

                    swap = true;
                }    
            }
        }

    }
}
        
     



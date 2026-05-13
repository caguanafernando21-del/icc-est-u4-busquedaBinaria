
import controllers.BusquedaBinaria;
import models.Producto;

public class App {
    public static void main(String[] args) throws Exception {

        Producto[] products = new  Producto[6];
        products[0] = new Producto("Laptop", 10 );
        products[1] = new Producto("Smarphone", 20 );
        products[2] = new Producto("Headphones", 2 );        
        products[3] = new Producto("Monitor", 5 );
        products[4] = new Producto("KeyBoard", 15 );
        products[5] = new Producto("AlgoMas", 1 );



        BusquedaBinaria binaria = new BusquedaBinaria();
        int stockFind = 2;
        int indexResult = binaria.findProdcutIndexByStock(products, stockFind);
        
        if(indexResult >=0){
            System.out.println("Se encontro el producto");
            System.out.println("La posicion: " + indexResult);

        }else{
            System.out.println("No se encontro el producto en el stock: " + stockFind);
        }    

        System.out.println("-------Nombre-------------");
        
        BusquedaBinaria binaria2 = new BusquedaBinaria();
        String stockFindHi = "Smarphone";
        int indexResult2 = binaria2.findProdcutIndexByNombre(products, stockFindHi);


        if(indexResult >=0){
            System.out.println("Se encontro el producto");
            System.out.println("La posicion: " + indexResult2);
            System.out.println("Nombre: " + products[indexResult2].getName());

        }else{
            System.out.println("No se encontro el producto en el stock: " + stockFind);
        }


    }
}

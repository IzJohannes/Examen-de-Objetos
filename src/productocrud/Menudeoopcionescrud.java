package productocrud;

import implementacion.ImplProductos;
import java.util.Scanner;


public class Menudeoopcionescrud {
    

       
    public void menuOpciones() {      
        Scanner lTecla = new Scanner(System.in);
        ImplProductos impl = new ImplProductos();
        
        int opcionesA=0;
             
        System.out.println("__________Bienvenido al menu de CRUD___________"+
        "\n"+"Elija la accion:\n"+ 
        "\n"+"1=Agregar un Producto"+
        "\n2=Reportar un Producto"+
        "\n3=Modificar un Producto"+
        "\n4=Eliminar un Producto"+
        "\n0=Salir del CRUD"+
        "\n");
        int nCRUDf = lTecla.nextInt();
        
        opcionesA = nCRUDf;  
        while(opcionesA!=0){
            switch(opcionesA) {

              case 1:{ 
                  impl.agragarProductosPorTeclado();
                    } break;

            
              case 2: {
                  impl.reporteProductos();
              } break;  
              
              
              case 3: {
                  impl.modificarproductos();
            } break; 
            

              case 4: {
                  impl.eliminarproductos();
            } break;

              default: System.out.println("Elija una opcion existente!!");
            }
        
        System.out.println("----------------------------------------------------------------");
            
        System.out.println("__________Bienvenido al menu de CRUD___________"+
        "\n"+"Elija la accion:\n"+ 
        "\n"+"1=Agregar un Producto"+
        "\n2=Reportar un Producto"+
        "\n3=Modificar un Producto"+
        "\n4=Eliminar un Producto"+
        "\n0=Salir del CRUD"+
        "\n");
        int ncrud = lTecla.nextInt();
        opcionesA = ncrud;
         
                
        }        
    }
    
}
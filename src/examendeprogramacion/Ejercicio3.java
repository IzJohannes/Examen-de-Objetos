package examendeprogramacion;

public class Ejercicio3 {
    
    static String[] meses =new String[12];
    
    public static void mesesdelaño (){
         
    meses[0]= "Enero";
    meses[1]= "Febrero";    
    meses[2]= "Marzo";
    meses[3]= "Abril";
    meses[4]= "Mayo";
    meses[5]= "Junio";
    meses[6]= "Julio";
    meses[7]= "Agosto";
    meses[8]= "Septiembre";
    meses[9]= "Octubre";
    meses[10]= "Noviembre";
    meses[11]= "Diciembre";
    
    
  
    for(int k=0, h=1; k<meses.length; k++,h++){
        
    System.out.println("Mes numero "+h+": "+meses[k]+"\n");    
    
    
    }
    
    } 

    
    public static void main(String[] args) {
       
        mesesdelaño();
    }
    
}
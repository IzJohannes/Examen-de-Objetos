package examendeprogramacion;

public class Calificaciones4 {
    
    static int[] notaalumno=new int[10];
    
    public static void calificaciondealumnos(){
        
    notaalumno[0]= 12;
    notaalumno[1]= 14;    
    notaalumno[2]= 16;
    notaalumno[3]= 8;
    notaalumno[4]= 18;
    notaalumno[5]= 3;
    notaalumno[6]= 15;
    notaalumno[7]= 17;
    notaalumno[8]= 14;
    notaalumno[9]= 13;
        
        int k=0;
        for(int h=0; h<notaalumno.length; h++){
        
            k= k+notaalumno[h];
            
        }
        
        System.out.println("*_______Calificacion de Alumnos________*");
        System.out.println("El promedio de calificaciones es: "+k/notaalumno.length);
        System.out.println("La Calificacion Mayor es: "+notaalumno[4]);
        System.out.println("La Calificacion Menor es: "+notaalumno[5]);
        
        
    
    }
    
   
    


    public static void main(String[] args) {
        
        calificaciondealumnos();
        
    }
    
}
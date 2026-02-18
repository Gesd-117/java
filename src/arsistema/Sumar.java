package arsistema;
import utilidades.Util;

public class Sumar {
    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        
        Util.encabezado("hola mundo", 50);  
        Util.encabezado("bienvenidos a la programación en java", 70);  
        Util.encabezado("Suma de 2 numeros", 60); 
        
        resultado = suma(numero1,numero2);
        System.out.println("La suma es " + resultado);    
        Util.linea(60);

    }

    private static int suma(int numero1, int numero2){return numero1 + numero2;}

    public static void leerNumeroEntero(String msj){
        
        System.out.println(msj);

    }

}

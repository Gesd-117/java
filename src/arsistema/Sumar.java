package arsistema;

public class Sumar {

    public static void main(String[] args) {
        encabezado("hola mundo", 50);  
    }

    public static String centrar(String texto, int largo) {
        int relleno = (largo - texto.length()) / 2;
        String textoCentrado = " ".repeat(relleno) + texto;
        return textoCentrado;
    }

    public static void linea(int largo) {
        System.out.println("═".repeat(largo));
    }

    public static void encabezado(String texto, int largo) {
        linea(largo);
        System.out.println(centrar(texto.toUpperCase(), largo));
        linea(largo);
    }

}

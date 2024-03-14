package miPrincipal;

public class DemoDelimitador {
    public static void menu(){
        String expr = "(a+b/2)";
        Delimitadores objDel = new Delimitadores();
        if (objDel.evaluacionDelimitadores(expr))
           System.out.println("Expresion Correcta");
        else
           System.out.println("Expresion incorrecta");
    }
    
}

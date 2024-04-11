package miPrincipal;

public class DemoListaSimple {
    
    public static void menu() throws PosicionIlegalException {
        System.out.println("****************");
        System.out.println("  Lista Simple  ");
        System.out.println("****************");
        System.err.println();
        Lista<Integer> lista = new Lista<Integer>();
        lista.agregar(12);
        lista.agregar(15);
    }
}

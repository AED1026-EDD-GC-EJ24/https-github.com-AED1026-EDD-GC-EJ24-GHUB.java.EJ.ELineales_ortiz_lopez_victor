package miPrincipal;

import static org.junit.jupiter.api.DynamicTest.stream;

public class Lista<T> {
    //primer elemento de la lista
    private Nodo<T> cabeza;
    //Total de elementos en la lista
    private int tamanio;
    //Constructor
    public Lista(){
        cabeza = null;
        tamanio = 0;
    }
    //devuelve el tamanio de la lista
    public int getTamanio() {
        return tamanio;
    }
    //Consulta si la lista esta vacia
    public boolean esVacia(){
        if (cabeza == null) 
            return true;
        else
            return false;
        
    }
    //Agregar un nuevo nodo al final de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            cabeza = nuevo;
        }else{
            //Crea un nuevo nodo y lo coloca al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;

    }
    


    
    
}

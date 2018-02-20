import java.util.ArrayList;

/**
 * @author Claude Calewaert
 * @param <T>
 * @Proposito Clase que modela un Stack basandose en un ArrayList
 *
 */

public class StackArrayList<T> extends Stack<T>{

	// Declaracion de variables
	
	private ArrayList<T> arreglo;

	// Constructor
	
	public StackArrayList() {
		arreglo = new ArrayList<>();
	}
	
	// Metodos
	
	public void push(T dato) { // Ingresa un elemento
		arreglo.add(dato);
	}


	public T pop() { // Extrae un elemento
	
		T ultimo;
		
		ultimo = arreglo.get(arreglo.size()-1);
		arreglo.remove(ultimo);
		
		return ultimo;
	}


	public Boolean EstaVacio() { // Verifica si el Stack esta vacio
		return arreglo.isEmpty();
	
	}

	

}

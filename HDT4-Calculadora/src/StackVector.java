import java.util.Vector;

public class StackVector<T> extends Stack<T> {

	// Declaracion de variables
	
	private Vector<T> vec;
	
	// Constructor
	
	public StackVector() {
		vec = new Vector<T>();
	}
	
	// Metodos
	
	public void push(T dato) {	// Ingresa un dato al Stack
		vec.addElement(dato);
	}

	
	public T pop() { // Extrae un dato del Stack
		
		T ultimo = vec.get(vec.size()-1);
		vec.removeElementAt(vec.size()-1);;
		
		return ultimo;
	}

	
	public Boolean EstaVacio() { // Devueleve si el Stack esta vacio
		return vec.isEmpty();
	}

}

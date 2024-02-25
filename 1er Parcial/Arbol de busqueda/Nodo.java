package abb;

public class Nodo {
	
	int dato;
	Nodo Izq;
	Nodo Der;
	
	public Nodo(int d) {
		 this.dato = d;
		 
	}

	@Override
	public String toString() {
		return " " + dato;
	}
	
	

}

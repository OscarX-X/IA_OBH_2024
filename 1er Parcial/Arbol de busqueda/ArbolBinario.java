package abb;

public class ArbolBinario {
	
	Nodo raiz;
	
	public ArbolBinario() {
		raiz = null;
		
	}
	
	public Boolean EsVacio() {
		if(raiz == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void AgregarNodo(int dato) {
		Nodo Nuevo = new Nodo(dato);
		
		if(EsVacio()) {
			raiz = Nuevo;
			System.out.println("\n> NODO AGREGADO");
		} else {
			Nodo Auxiliar = raiz;
			Nodo Padre;
			
			while(true) {
				Padre = Auxiliar;
				
				// LADO IZQUIERDO
				if(dato<Auxiliar.dato) {
					Auxiliar = Auxiliar.Izq;
					if(Auxiliar == null) {
						Padre.Izq = Nuevo;
						System.out.println("\n> NODO AGREGADO");
						return;
					}
				}
				
				// LADO DERECHO
				else {
					Auxiliar = Auxiliar.Der;
					if(Auxiliar == null) {
						Padre.Der = Nuevo;
						System.out.println("\n> NODO AGREGADO");
						return;
					}
				}
			}
		}
	}
	
	
	public Nodo BuscarNodo(int d) {
		Nodo aux = raiz;
		while(aux.dato!=d) {
			if(d<aux.dato) {
				aux = aux.Izq;
			} else {
				aux = aux.Der;
			}
			
			if(aux==null) {
				return null;
			}
		}
		
		return aux;
	}
	
	
	
	public void InOrder(Nodo r) {
		if(r!=null) {
			InOrder(r.Izq);
			System.out.print(" Nodo " + r.dato);
			InOrder(r.Der);
		}
	}
	
	
	
}




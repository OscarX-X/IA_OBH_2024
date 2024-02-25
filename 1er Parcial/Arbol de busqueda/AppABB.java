package abb;

import java.util.Scanner;

public class AppABB {
	
	static Scanner Leer = new Scanner(System.in);
	public static void main(String[] args) {
		int option = 0;
		ArbolBinario Arbol = new ArbolBinario();
		
		do {
			System.out.println("\n|       MENU          "
					+ "\n|[1] INSERTAR NODO"
					+ "\n|[2] BUSCAR NODO"
					+ "\n|[3] IMPRIMIR ARBOL INORDEN"
					+ "\n|[4] SALIR");
			
			option = Leer.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("\n¿QUE NODO DESEAS AGREGAR?");
					int d = Leer.nextInt();
					if(Arbol.EsVacio()) {
						Arbol.AgregarNodo(d);
					} else {
						if(Arbol.BuscarNodo(d) == null) {
							Arbol.AgregarNodo(d);
						}
						else {
							System.out.println("\n- ESE NODO YA EXISTE");
						}
					}
					break;
				case 2:
					if(!Arbol.EsVacio()) {
						System.out.println("\n¿QUE NODO DESEA BUSCAR?");
						d = Leer.nextInt();
						Arbol.BuscarNodo(d);
						if(Arbol.BuscarNodo(d) == null) {
							System.out.println("\n- EL NODO NO SE ENCUENTRA EN EL ARBOL");
						} else {
							System.out.println("\nNODO:" + Arbol.BuscarNodo(d) + " ENCONTRADO");
						}
					} else {
						System.out.println("\n- EL ARBOL ESTA VACIO");
					}
					
					break;
				case 3:
					if(!Arbol.EsVacio()) {
						System.out.println("\nRECORRIDO INORDEN:");
						Arbol.InOrder(Arbol.raiz);
						System.out.println("\n");
					}
					else{
						System.out.println("\n-EL ARBOL ESTA VACIO");
					}
					
			}
		} while (option!=4);
	}
}

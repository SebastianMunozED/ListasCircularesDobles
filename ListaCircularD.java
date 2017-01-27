package epn.com;

public class ListaCircularD {
	Nodo primero;
	Nodo ultimo;
	
	public ListaCircularD(){
		primero = null;
		ultimo = null;
	}
	
	
	public void ingresarNodo(int x){
		Nodo nuevo = new Nodo();
		nuevo.dato = x;
		//para insertar al inicio
		if(primero == null){
			primero = nuevo;
			primero.siguiente = primero;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
		}//para insertar al final
		else{
			ultimo.siguiente = nuevo;
			nuevo.siguiente = primero;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
			primero.anterior = ultimo;
		}
	}
		public void Desplegar(){
			Nodo actual = new Nodo();
			actual = primero;
			System.out.println("\nLista de Nodos Ingresados");
			do{	
				System.out.println(actual.dato);
				actual = actual.siguiente;
				
			} while (actual!= primero); 
		}
	
	
	public void Desplegar2(){
			Nodo actual = new Nodo();
			actual = ultimo;
			System.out.println(actual.siguiente.dato);
			System.out.println(actual.anterior.dato);
			
		}
		
		public void eliminarNodo(int x){
			Nodo actual = new Nodo();
			Nodo anterior= new Nodo();
			System.out.println("\nEliminar Nodo "+x);
			actual = primero;
			anterior = ultimo;
			do{
				if(actual.dato == x){
					//eliminar al comienzo
					if(actual == primero){
						primero = primero.siguiente;
						ultimo.siguiente = primero;
						primero.anterior = ultimo;
					}
					// eliminar al final
					else if(actual == ultimo){
					ultimo = anterior;
					primero.anterior = ultimo;
					ultimo.siguiente = primero;
					}//eliminar al medio 
					else {
					anterior.siguiente = actual.siguiente;
					actual.siguiente.anterior = anterior;
				}
			}
		anterior = actual;
		actual = actual.siguiente;
	   }while (actual != primero);
}
		
		
		public void buscarNodo(int x){
			Nodo actual = new Nodo();
			actual = ultimo;
			boolean encontrado = false;
			System.out.println("\nBusqueda del Nodo "+x);
			do{
				if(actual.dato == x){
					encontrado = true;
				}
				actual = actual.anterior;
				
			}while ( actual != ultimo && encontrado != true);
			if(encontrado == true){
				System.out.println("Nodo "+x+" encontrado");
			}else {
				System.out.println("Nodo "+x+" no encontrado");
			}
		}	
			
		
		public void buscarIndice(int x){
			Nodo actual = new Nodo();
			actual = primero;
			int indice = 0;
			boolean encontrado = false;
			System.out.println("\nBusqueda Indice del Nodo "+x);
			do{
				indice ++;
				if(actual.getDato() == x){
					encontrado = true;
				}
				 actual = actual.siguiente;
				
			}while ( actual != primero && encontrado != true);
			if(encontrado == true){
				System.out.println("Nodo en el indice "+indice+" encontrado");
			}else {
				System.out.println("Nodo no existe en la lista");
			}
			
		}	
		
		public void ingresarIntermedioNodo(int x, int y){
			Nodo actual = new Nodo();
			Nodo nuevo = new Nodo();
			nuevo.dato = y;
			actual = ultimo;
			boolean encontrado = false;
			do{
				if(actual.dato == x){
					encontrado = true;
				}
				actual = actual.anterior;
				
			}while ( actual != ultimo && encontrado != true);
			if(encontrado == true){
				actual = actual.siguiente;
				actual.anterior.siguiente = nuevo;
				nuevo.siguiente = actual;
				nuevo.anterior = actual.anterior;
				actual.anterior = nuevo;
				}else {
				System.out.println("Nodo "+x+" no encontrado imposible insertar");
			}
		}
		
		
		
}


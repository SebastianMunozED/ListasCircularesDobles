package epn.com;

public class ListaCircularD {
	Nodo primero;
	Nodo ultimo;
	
	public ListaCircularD(){
		primero = null;
		ultimo = null;
	}
	//primero null
	//segundo null
	//valor x = 36
	//Se hace un circulo
	// 36<---36---->36
	public void ingresarNodo(int x){
		Nodo nuevo = new Nodo();
		nuevo.dato = x;
		if(primero == null){
			primero = nuevo;
			primero.siguiente = primero;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
		} else{
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
		
		public void eliminarNodo(int x){
			Nodo actual = new Nodo();
			Nodo anterior= new Nodo();
			System.out.println("\nEliminar Nodo "+x);
			actual = primero;
			anterior = ultimo;
			do{
				if(actual.dato == x){
					if(actual == primero){
						primero = primero.siguiente;
						ultimo.siguiente = primero;
						primero.anterior = ultimo;
					}else if(actual == ultimo){
					ultimo = anterior;
					primero.anterior = ultimo;
					ultimo.siguiente = primero;
					} else {
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
}


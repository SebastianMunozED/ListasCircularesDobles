package epn.com;

public class Aplicacion {

	public static void main(String[] args) {
		ListaCircularD l = new ListaCircularD();
		l.ingresarNodo(36);
		l.ingresarNodo(57);
		l.ingresarNodo(62);
		l.Desplegar();
		
		l.ingresarNodo(25);
		l.Desplegar();
		
		l.buscarNodo(11);
		
		l.eliminarNodo(36);
		l.Desplegar();
		
		l.eliminarNodo(62);
		l.Desplegar();
		
		l.buscarNodo(57);
	}

}

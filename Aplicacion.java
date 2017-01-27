package epn.com;

public class Aplicacion {

	public static void main(String[] args) {
		ListaCircularD l = new ListaCircularD();
		
		l.ingresarNodo(36);
		l.ingresarNodo(11);
		l.ingresarNodo(4);
		l.ingresarNodo(6);
		l.ingresarNodo(13);
		l.ingresarNodo(14);
		l.Desplegar();

		System.out.println("-____-");
		l.Desplegar2();
		
		
		l.ingresarIntermedioNodo(6,200);
		l.ingresarIntermedioNodo(11,200);
		l.ingresarIntermedioNodo(1,200);
		
		
		l.Desplegar();
		l.buscarNodo(36);
		l.buscarIndice(4);
	}

}

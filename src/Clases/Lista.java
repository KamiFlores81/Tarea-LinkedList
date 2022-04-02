package Clases;

public class Lista {
	private Nodo cabeza =null;
	private int longitud = 0;
	
	private class Nodo {
		public ClsAlumno alumno;
		public Nodo siguiente = null;
		
		public Nodo(ClsAlumno alumno) {
			this.alumno = alumno;
			
		}
		
	}
	public void insertarPrincipio(ClsAlumno alumno) {
		Nodo nodo = new Nodo(alumno);
		nodo.siguiente = cabeza;
		cabeza = nodo;
		longitud++;
		
	}
	public void insertarFinal(ClsAlumno alumno) {
		Nodo nodo = new Nodo (alumno);
		if (cabeza == null) {
			cabeza = nodo;
			
		}else {
		
		Nodo puntero = cabeza;
		while (puntero.siguiente != null) {
			puntero = puntero.siguiente;
		}
		puntero.siguiente = nodo;
		}
		longitud++;
	}
	public void insertarDespues(int n, ClsAlumno alumno) {
		Nodo nodo = new Nodo(alumno);
		if (cabeza == null) {
			cabeza = nodo;
			
		} else {
			Nodo puntero = cabeza;
			int contador = 0;
				puntero = puntero.siguiente;
				while (contador < n && puntero.siguiente != null) {
				contador++;
			}	
				nodo.siguiente = puntero.siguiente;
				puntero.siguiente = nodo;
		}
		longitud++;
	}
	public ClsAlumno obtener(int n) {
		if (cabeza == null) { 
			return null;
			
		} else {
			Nodo puntero = cabeza;
			int contador = 0; 
			while (contador < n && puntero.siguiente != null) {
				puntero = puntero.siguiente;
				contador++;
			}
			if (contador !=n) {
				return null; 
			}else {
				return puntero.alumno;
				
			}
		}
		
	}
	public int contar() {
		return longitud;
		
	}
	public boolean estaVacia() {
		return cabeza == null;
	}
	public void eliminarPrimero() {
		if (cabeza !=null) {
		Nodo primer = cabeza; 
		cabeza = cabeza.siguiente;
		primer.siguiente = null;
		longitud--;
		
		}
	}
	public void eliminarUltimo() {
		if (cabeza !=null) {
			if (cabeza.siguiente == null) {
				cabeza = null;
			}else {
			Nodo puntero = cabeza;
			while (puntero.siguiente.siguiente !=null) {
				puntero = puntero.siguiente;
				
			}
			puntero.siguiente= null;
			longitud--;
		}
	}
}
	public void eliminarClsAlumno (int n) {
		if (cabeza !=null) {
			if (n==0) {
			Nodo primer = cabeza;
			cabeza = cabeza.siguiente;
			primer.siguiente = null;
			longitud--;
			}else if (n < longitud ){
			Nodo puntero = cabeza;
			int contador = 0;
			while (contador < (n - 1 )) {
				puntero = puntero.siguiente;
				contador++;
			}
			Nodo temp= puntero.siguiente; 
			puntero.siguiente = temp.siguiente;
			temp.siguiente = null;
			longitud--;
		}
	}
}
}













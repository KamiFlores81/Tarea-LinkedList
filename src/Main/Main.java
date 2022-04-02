package Main;

import java.util.LinkedList;

import Clases.ClsAlumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<ClsAlumno> list = new LinkedList<ClsAlumno>();

		ClsAlumno alumno1 = new ClsAlumno("0905-19-9810","Kami",100);
		ClsAlumno alumno2 = new ClsAlumno("0905-19-9811","Kamila",99.99);
		list.add(alumno1);
		list.add(alumno2);
		//
		System.out.println("Contenido de la lista: " + list.toString());
	}

}

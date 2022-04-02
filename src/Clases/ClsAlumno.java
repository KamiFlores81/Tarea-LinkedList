package Clases;

public class ClsAlumno {
	
	public String carnet;
	public String nombre;
	double promedio;
	
	public ClsAlumno(String carnet, String nombre, double promedio) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.promedio = promedio;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "ClsAlumno [carnet=" + carnet + ", nombre=" + nombre + ", promedio=" + promedio + "]";
	}

	
	
}


public class Empleado {
	private int codEmp;
	private String nombre;
	private double sueldo;
	
	public Empleado(int codEmp, String nombre, double sueldo) {
		this.codEmp = codEmp;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getCodEmp() {
		return codEmp;
	}

	//No se debe dejar modificar el codEmplado porque condiciona su posición en el array
	/*public void setCodEmp(int codEmp) {
		this.codEmp = codEmp;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [codEmp=" + codEmp + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
}

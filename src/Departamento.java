import java.util.Arrays;

public class Departamento {
	private int codDpto;
	private String nombre;
	private int numEmp;
	private Empleado[] arrayEmp;
	
	public Departamento(int codDpto, String nombre, int numEmp) {
		this.codDpto = codDpto;
		this.nombre = nombre;
		this.numEmp = numEmp;
		this.arrayEmp=new Empleado[numEmp];
	}

	public int getCodDpto() {
		return codDpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}

	@Override
	public String toString() {
		return "Departamento [codDpto=" + codDpto + ", nombre=" + nombre + ", numEmp=" + numEmp + ", arrayEmp="
				+ Arrays.toString(arrayEmp) + "]";
	}
	
	

	
	
	
	
	
	
}

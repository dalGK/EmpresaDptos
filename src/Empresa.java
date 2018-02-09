import java.util.Scanner;

public class Empresa {
	private  final int  numDptos=4;
	private Departamento[] arrayDptos;
	
	public Empresa() {
		arrayDptos=new Departamento[numDptos];
	}
	
	public void altaDpto() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el código de departamento (1-4)");
		int codDptoAux=entrada.nextInt();
		/*if(buscarDpto2(codDptoAux)==true)
			System.out.println("El departamento ya existe");
		else //procedo al alta
		 */	
		Departamento dptoAux=buscarDpto(codDptoAux);
		if (dptoAux!=null) //el departamento existe
			System.out.println("El departamento ya existe "+dptoAux.toString());
		else nuevoDpto(codDptoAux);

	
	}
	
	public boolean buscarDpto2(int codDptoAux) {
		if (arrayDptos[codDptoAux-1]==null)
			return false;
		else
			return true;
	}
	
	public Departamento buscarDpto (int codDptoAux) { 
		//devuelve el departamento si lo encuentra o null 
		return arrayDptos[codDptoAux-1];
		
	}
	
	public Departamento buscarDptoNombre(String nombreDptoAux) {
		Departamento dptoAux=null; boolean encontrado=false;
		//busq. secuencial del nombre en el array
		for (int i = 0; i < arrayDptos.length && !encontrado; i++) {
			if(arrayDptos[i]!=null && arrayDptos[i].getNombre().equalsIgnoreCase(nombreDptoAux)) {
				dptoAux=arrayDptos[i]; //encontrado y paro la busq.
				encontrado=true;
				//break;				
			}		
		}
		
		return dptoAux;
	}
	
	
	
	public Departamento nuevoDpto(int codDptoAux) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el nombre de departamento");
		String nombreDptoAux=entrada.next();
		Departamento dptoAux=buscarDptoNombre(nombreDptoAux);
		if (dptoAux!=null)
			System.out.println("El nombre del departamento ya existe "+dptoAux.toString());
		else {//continúo con el alta
			System.out.println("Introduce el número de empleados ");
			int numEmp=entrada.nextInt();
			dptoAux=new Departamento(codDptoAux, nombreDptoAux, numEmp);
			/*//inserto en el array en la posición codDpto-1
			arrayDptos[codDptoAux-1]=dptoAux;*/
			insertarDpto(dptoAux); //mejor
			System.out.println("Se procede a insertar el departamento "+dptoAux.toString());
		}
		return dptoAux;
	}
	
	public void insertarDpto(Departamento dptoAux) {
		int codDptoAux=dptoAux.getCodDpto();
		arrayDptos[codDptoAux-1]=dptoAux;
	}
	
	
}

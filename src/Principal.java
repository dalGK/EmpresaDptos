import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	Empresa empresa=new Empresa();
	Scanner entrada=new Scanner(System.in);
	//presenta menu con distintas opciones
	
	/*if (opcion==1)
		empresa.altaDpto(); //si el metodo altaDpto pertenece a Empresa
		altaDpto2(); //si el metodo pertenece a Principal
	}*/
	
	
	int opcion;
	do{
		System.out.println("1. Alta de departamento");
		
		System.out.println("Introduce opción");
		opcion=entrada.nextInt();
		switch(opcion){
		//Esta opción sería si el método altaDpto lo lanza la clase empresa
		case 1: empresa.altaDpto();break;
		}
	}
	while (opcion!=9);

}
	public static void altaDpto2() {
		
	}
	
}

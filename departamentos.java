package departamentos;
import java.util.Scanner;

public class Departamentos {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
	//Declaración de variables
        char departamento;
        
	//Ingreso de datos
        System.out.print("Escriba en mayúsculas una letra de la A a la D para ver el tipo de departamento\n");
        departamento = Entrada.next().charAt(0);
        
	//Asignación de los resultados a cada caso
        switch(departamento){
            case 'A':
                System.out.print("Desarrollo\n");
                break;
            case 'B':
                System.out.print("Recursos humanos\n");
                break;
            case 'C':
                System.out.print("Finanzas\n");
                break;
            case 'D':
                System.out.print("Mercadeo\n");
                break;
            default:
                System.out.print("Error, ingrese una de las 4 letras\n");
                break;
        }
    }
}
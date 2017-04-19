package horarios;
import java.util.Scanner;

public class Horarios {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
	//Declaración de variables
        int dias;
        
	//Ingreso de datos por opciones
        System.out.print("Escoja entre las opciones el número del día que quiera revisar el horario\n");
        System.out.print(" 1) Lunes\n 2) Martes\n 3) Miercoles\n 4) Jueves\n 5) Viernes\n");
        dias = Entrada.nextInt();
        
	//Asignación de los resultados a cada opción
        switch(dias){
            case 1:
                System.out.print("Lunes: GP\n");
                break;
            case 2:
                System.out.print("Martes: Contabilidad\n");
                break;
            case 3:
                System.out.print("Miercoles: Fundamentos de programación\n");
                break;
            case 4:
                System.out.print("Jueves: Libre\n");
                break;
            case 5:
                System.out.print("Viernes: Desarrollo espiritual I\n");
                break;
            default:
                System.out.print("Error, ingrese un número válido\n");
                break;
        }
    }
}
package horarios;
import java.util.Scanner;

public class Horarios {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
	//Declaraci�n de variables
        int dias;
        
	//Ingreso de datos por opciones
        System.out.print("Escoja entre las opciones el n�mero del d�a que quiera revisar el horario\n");
        System.out.print(" 1) Lunes\n 2) Martes\n 3) Miercoles\n 4) Jueves\n 5) Viernes\n");
        dias = Entrada.nextInt();
        
	//Asignaci�n de los resultados a cada opci�n
        switch(dias){
            case 1:
                System.out.print("Lunes: GP\n");
                break;
            case 2:
                System.out.print("Martes: Contabilidad\n");
                break;
            case 3:
                System.out.print("Miercoles: Fundamentos de programaci�n\n");
                break;
            case 4:
                System.out.print("Jueves: Libre\n");
                break;
            case 5:
                System.out.print("Viernes: Desarrollo espiritual I\n");
                break;
            default:
                System.out.print("Error, ingrese un n�mero v�lido\n");
                break;
        }
    }
}
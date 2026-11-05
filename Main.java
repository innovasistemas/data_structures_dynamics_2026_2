import java.util.Scanner;
import com.paquetes.listas_ligadas.*;
import com.paquetes.recursividad.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        String opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("0. Salir");
            System.out.println("1. Listas Simplemente Ligadas (LSL)");
            System.out.println("2. Recursión");
            System.out.print("Ingrese su opción: ");
            opcion = input.next();
            switch (opcion) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuLSL();
                    break;
                case "2":
                    menuRecursion();
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (!opcion.equals("0"));
    }

    public static void menuLSL() 
    {
        String opc;
        int dato;
        ListaSimplementeLigada lsl = new ListaSimplementeLigada();
        do {
            System.out.println("Menú Listas Simplemente Ligadas (LSL)");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar nodo por el inicio");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Mostrar lista recursiva");
            System.out.print("Ingrese su opción: ");
            opc = input.next();
            switch (opc) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato: ");
                    dato = input.nextInt();
                    input.nextLine();
                    lsl.agregarNodoInicio(dato);
                    System.out.println("Nodo agregado a la lista");
                    break;
                case "2":
                    if (lsl.getCabeza() != null) {
                        lsl.imprimirLSL();
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                case "3":
                    if (lsl.getCabeza() != null) {
                        lsl.imprimirLSLRecursiva(lsl.getCabeza());
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (!opc.equals("0"));
    }

    public static void menuRecursion() 
    {
        String opc;
        int dato;
        do {
            System.out.println("Menú Recursión");
            System.out.println("0. Regresar");
            System.out.println("1. Factorial");
            System.out.println("2. Imprimir números naturales");
            System.out.print("Ingrese su opción: ");
            opc = input.next();
            switch (opc) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese n: ");
                    dato = input.nextInt();
                    input.nextLine();
                    if (dato >= 0) {
                        System.out.println(dato + "! = " + Recursion.factorialRecursivo(dato));
                    } else {
                        System.out.println("Debe ingresar un n mayor o igual a cero");
                    }
                    break;
                case "2":
                    System.out.print("Ingrese n: ");
                    dato = input.nextInt();
                    input.nextLine();
                    if (dato >= 1) {
                        Recursion.mostrarNaturalesRecursivo(dato);
                    } else {
                        System.out.println("Debe ingresar un n mayor o igual a uno");
                    }
                    break;
                
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (!opc.equals("0"));
    }
}
import java.util.Scanner;
import com.paquetes.listas_ligadas.*;

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
            System.out.print("Ingrese su opción: ");
            opcion = input.next();
            switch (opcion) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    menuLSL();
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
            System.out.print("Ingrese su opción: ");
            opc = input.next();
            switch (opc) {
                case "0":
                    System.out.println("Hasta pronto");
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
                        lsl.imprimirLSL();
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (!opc.equals("0"));
    }
}
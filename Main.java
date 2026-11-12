import java.util.Scanner;
import com.paquetes.listas_ligadas.*;
import com.paquetes.recursividad.*;
import com.paquetes.arboles.*;;

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
            System.out.println("3. Árboles binarios");
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
                case "3":
                    menuArboles();
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

    public static void menuArboles() 
    {
        String opc;
        Arbol arbol = new Arbol();
        do {
            System.out.println("Menú Árboles");
            System.out.println("0. Regresar");
            System.out.println("1. Crear árbol");
            System.out.println("2. Preorden");
            System.out.println("3. Inorden");
            System.out.println("4. Postorden");
            System.out.println("5. Contar nodos");
            System.out.println("6. Sumar nodos");
            System.out.println("7. Promedio árbol");
            System.out.println("8. Contar hojas");
            System.out.print("Ingrese su opción: ");
            opc = input.next();
            switch (opc) {
                case "0":
                    break;
                case "1":
                    arbol.raiz = new NodoArbol();
                    arbol.cargarNodo(arbol.raiz);
                    break;
                case "2":
                    if (arbol.raiz != null) {
                        arbol.preorden(arbol.raiz);
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "3":
                    if (arbol.raiz != null) {
                        arbol.inorden(arbol.raiz);
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "4":
                    if (arbol.raiz != null) {
                        arbol.postorden(arbol.raiz);
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "5":
                    if (arbol.raiz != null) {
                        System.out.println("Total nodos: " + arbol.contarNodos(arbol.raiz));
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "6":
                    if (arbol.raiz != null) {
                        System.out.println("Suma nodos: " + arbol.sumarNodos(arbol.raiz));
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "7":
                    if (arbol.raiz != null) {
                        System.out.println("Promedio árbol: " + arbol.promedioArbol());
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                case "8":
                    if (arbol.raiz != null) {
                        System.out.println("Total hojas: " + arbol.contarHojas(arbol.raiz));
                    } else {
                        System.out.println("Árbol vacío");
                    }
                    break;
                default:
                    System.out.println("Opción no válida\n");
            }
        } while (!opc.equals("0"));
    }
}
package com.paquetes.listas_ligadas;

public class ListaSimplementeLigada 
{
    private NodoLSL cabeza;
    private NodoLSL ultimo;
    int n;

    public ListaSimplementeLigada()
    {
        cabeza = null;
        ultimo = null;
        n = 0;
    }

    public NodoLSL getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(NodoLSL cabeza) 
    {
        this.cabeza = cabeza;
    }

    public NodoLSL getUltimo()
    {
        return ultimo;
    }

    public void setUltimo(NodoLSL ultimo) 
    {
        this.ultimo = ultimo;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void agregarNodoInicio(int dato)
    {
        NodoLSL nuevo = new NodoLSL();
        nuevo.info = dato;
        nuevo.liga = cabeza;
        cabeza = nuevo;
        if (ultimo == null) {
            ultimo = nuevo;
        }
        n++;
    }

    public void imprimirLSL()
    {
        NodoLSL p = cabeza;
        int i = 1;
        System.out.println("Total nodos: " + n);
        while (p != null) {
            System.out.println("============================");
            System.out.println("Nodo: " + i);
            System.out.println(" Información nodo: " + p.info);
            System.out.println(" Dirección nodo: " + p);
            System.out.println(" Dirección liga del nodo: " + p.liga);
            System.out.println("============================");
            p = p.liga;
            i++;
        }
    }

    public NodoLSL buscarNodo(int dato)
    {
        NodoLSL temp = cabeza;
        while (temp != null) {
            if (temp.info == dato) {
                return temp;
            } else {
                temp = temp.liga;
            }
        }
        return null;
    }

    public void modificarNodo(NodoLSL dir, int dato)
    {
        dir.info = dato;
    }

    public void insertarNodoDespues(NodoLSL dir, int dato)
    {
        NodoLSL nuevo = new NodoLSL();
        nuevo.info = dato;
        nuevo.liga = dir.liga;
        dir.liga = nuevo;
        n++;
    }

    public boolean eliminarNodo(int dato)
    {
        NodoLSL anterior, actual;
        boolean bandera = false;
        if (cabeza.info == dato) {
            cabeza = cabeza.liga;
            bandera = true;
            n--;
        } else {
            anterior = cabeza;
            actual = cabeza.liga;
            while (!bandera && actual != null) {
                if (actual.info == dato) {
                    anterior.liga = actual.liga;
                    bandera = true;
                    n--;
                } else {
                    anterior = anterior.liga;
                    actual = actual.liga;
                }
            }
        }
        return bandera;
    }

    public void ordenacionBurbuja()
    {
        NodoLSL actual = cabeza;
        NodoLSL siguiente;
        int aux;
        while (actual.liga != null) {
            siguiente = actual.liga;
            while (siguiente != null) {
                if (actual.info > siguiente.info) {
                    aux = actual.info;
                    actual.info = siguiente.info;
                    siguiente.info = aux;
                }
            }
        }
    }
}

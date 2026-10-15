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

    // public NodoLSL buscarNodo(int dato)
    // {

    // }
}

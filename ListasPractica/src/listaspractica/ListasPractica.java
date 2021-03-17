/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaspractica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jeffrey Felix
 */
public class ListasPractica {

    static class Nodo {

        int IdNodo;
        String NombreNodo;
        int salarioNodo;
        Nodo link;

        Nodo(int id, String nombre, int salario) {
            this.IdNodo = id;
            this.NombreNodo = nombre;
            this.link = null;
        }

        public int getIdNodo() {
            return IdNodo;
        }

        public void setIdNodo(int IdNodo) {
            this.IdNodo = IdNodo;
        }

        public String getNombreNodo() {
            return NombreNodo;
        }

        public void setNombreNodo(String NombreNodo) {
            this.NombreNodo = NombreNodo;
        }

        public int getSalarioNodo() {
            return salarioNodo;
        }

        public void setSalarioNodo(int salarioNodo) {
            this.salarioNodo = salarioNodo;
        }

        public Nodo getLink() {
            return link;
        }

        public void setLink(Nodo link) {
            this.link = link;
        }

    }

    static Nodo InsertarPila(Nodo PTR, Nodo nuevo) {//Insertar en forma de pila
        nuevo.setLink(PTR);
        PTR = nuevo;
        return PTR;
    }

    static Nodo InsertarCola(Nodo PTR, Nodo Q) {//Insertar en forma de cola
        if (PTR == null) {
            PTR = Q;
        } else {
            Nodo P = PTR;
            while (P.getLink() != null) {
                P = P.getLink();
            }
            P.setLink(Q);
        }
        return PTR;

    }

    static int generarId(Nodo PTR) {
        if (PTR == null) {
            return 1;
        } else {
            int id = 1;
            Nodo P = PTR;
            while (P.getLink() == null) {
                P = P.getLink();
                id++;
            }
            return id;
        }
    }
static Nodo PTR;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("nombre :");
            String nombre = br.readLine();
            System.out.println("Salario");
            int salario = Integer.parseInt(br.readLine());
            Nodo Q = new Nodo(generarId(PTR),nombre salario);
        }while()
    
    }

}

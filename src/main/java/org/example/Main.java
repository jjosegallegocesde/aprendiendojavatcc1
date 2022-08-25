package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase Producto
        Producto producto=new Producto();

        //crear un objeto de la clase Scanner
        Scanner entredaPorTeclado=new Scanner(System.in);

        //PREGUNTARLE AL USUARIO EL NOMBRE DEL PRODUCTO
        System.out.println("El producto es: "+producto.nombre);

        System.out.println("Digite el nombre producto");
        producto.nombre=entredaPorTeclado.next();

        System.out.println("El producto es: "+producto.nombre);


        //Crear un objeto de clase Cliente
        Cliente cliente = new Cliente();

        //PEDIR DATOS




    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.pkg4;

import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class Practica44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir=false;
        String numero = "";
        

        do {
            System.out.println("MENU:");
            System.out.println("*****");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");

            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            System.out.println("11");
            System.out.println("12");
            System.out.println("13");
            System.out.println("14");
            System.out.println("15");
            System.out.println("16");

            System.out.println("otro numero:SALIR DEL MENU");
            System.out.println("Introduce un numero:");
            Scanner sc=new Scanner(System.in);
            numero= sc.nextLine();

            switch (numero) {
                case "1":
                case "2":String nombre1="Raul";System.out.println(nombre1);break;
                case "3":String nombre3="Fran";System.out.println(nombre3);break;
                case "4":String nombre4="marta";System.out.println(nombre4);break;
                case "5":
                case "6":
                case" 7":
                case "8":
                case" 9":
                case "10": String nombre10= "Hicham"; System.out.println(nombre10);break;    
                case "11":
                case "12":
                case "13": String nombre = "Sergio";System.out.println(nombre);break;
                case "14":
                case "15": String nombre15 = "Jesus";System.out.println(nombre15);break;
                case "16":
                
                default:
                    salir=true;
                    break;
            }
        } while (salir == false);

    }
}

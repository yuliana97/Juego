package JAVA;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class juego {
     public static void main(String[] args) {
         
        Scanner nombre =new Scanner(System.in);
        Scanner respuesta =new Scanner(System.in);
        
        
        String usuario;
        int aleatorio =0;
        int resul, apuesta;
        int perdedor = 0;
        int ganador= 0;
        
        char co =1;
        
        
        System.out.println("Bienvenido al juego de cara y sello");
        System.out.println("Por favor digite su nombre:");
        usuario = nombre.next();
        
        do{
        System.out.println( usuario +  " Ingrese el valor que deseas apostar" );
        apuesta = respuesta.nextInt();
             
        System.out.println(usuario + " Escoge: \n Oprime 1.Cara \n Oprime 2.Sello");
        resul = respuesta.nextInt();
        
             System.out.println("La moneda se esta lanzando ");
             aleatorio = (int) (Math.random() *2)+1;
             if (aleatorio==1 && resul==1) {
                 System.out.println("El lanzamiento fue cara escogiste Cara tu ganas!, la cantidad apostada fue " + apuesta);
                 ganador= ganador +(apuesta*2);
             }else if (aleatorio==2 && resul==2) {
                 System.out.println("`El lanzamiento fue sello escogiste Sello tu ganas!, la cantidad apostada fue " +apuesta);
                  ganador= ganador +(apuesta*2);
             }else if (aleatorio==1 && resul==2) {
                 System.out.println("`El lanzamiento fue Cara escogiste Sello Perdiste!, la cantidad apostada fue " +apuesta);
                 perdedor= perdedor +(apuesta-apuesta);
             }else if (aleatorio==2 && resul==1) {
                 System.out.println("`El lanzamiento fue Sello escogiste cara Perdiste!, la cantidad apostada fue " +apuesta);
                 perdedor= perdedor +(apuesta-apuesta);
             }
             
             respuesta.nextLine();
             
             System.out.println("Tu saldo " + usuario +" es de " + ganador);
             System.out.println("Ingresa Y si quieres seguir jugando, si no quieres jugar mas oprime cualquier otra letra");
             co=respuesta.nextLine().charAt(0);
             
         }
        while (co=='y' || co=='Y');
    
     }
}
    


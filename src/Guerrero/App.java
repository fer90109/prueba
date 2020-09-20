package Guerrero;
import java.util.*;

public class App 
{
    public static void main(String[] args)
    {  
        TheBigOne theBigOne = new TheBigOne(); 
        Warrior contendiente;
        Warrior[] listaDeGuerreros;
        listaDeGuerreros = new Warrior[1000];
        int contadorDeGuerreros = 0;
        int cantidadTotalDeGuerreros = 1000;
         
       //Creando a los combatientes     
        for (int i = 0; i < cantidadTotalDeGuerreros; i++)
        {
            System.out.println(contadorDeGuerreros+ " contador de guerrero");
            Warrior warrior = new Warrior();
            warrior.numerodeWarrior = contadorDeGuerreros;
            listaDeGuerreros[i] = warrior;
            contadorDeGuerreros ++;   
            System.out.println(listaDeGuerreros[i].arma.nombre);
        }  
        
        for (int i = 0; i < cantidadTotalDeGuerreros; i++) 
        {
            theBigOne.combate(listaDeGuerreros[i]);
        }
        System.out.println("El guerrero Mas poderoso es Nª: " +theBigOne.theBigOne.numerodeWarrior);
    }            
}
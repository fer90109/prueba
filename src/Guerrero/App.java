package Guerrero;

public class App 
{
    public static void main(String[] args)
    {  
        Torneo torneo = new Torneo(); 
        Warrior[] listaDeGuerreros;
        int cantidadTotalDeGuerreros = 1000;
        listaDeGuerreros = new Warrior[cantidadTotalDeGuerreros];
        int contadorDeGuerreros = 0;
         
       //Creando a los combatientes     
        for (int i = 0; i < cantidadTotalDeGuerreros; i++)
        {
            Warrior warrior = new Warrior();
            System.out.println(" Creado el guerrero Nº: " +contadorDeGuerreros);
            warrior.numerodeWarrior = contadorDeGuerreros;
            contadorDeGuerreros ++;   
            listaDeGuerreros[i] = warrior; 
        }  
        
        for (int i = 0; i < cantidadTotalDeGuerreros; i++) 
        {
           torneo.combat(listaDeGuerreros[i]);
        }        
    torneo.fianlWiner();
    }            
}
package Guerrero;

public class App 
{
    public static void main(String[] args)
    {  
        TheBigOne theBigOne = new TheBigOne(); 
        Warrior contendiente;
        int contadorDeGuerreros = 0;
    
       //Creando a los combatientes     
        for (int i = 0; i < 1000; i++)
        {
            System.out.println(contadorDeGuerreros);
            Warrior warrior = new Warrior();
            warrior.numerodeWarrior = contadorDeGuerreros;
            contadorDeGuerreros ++; 
            theBigOne.combate(warrior);
        }       
        System.out.println("El guerrero Mas poderoso es Nª: " +theBigOne);
    }            
}
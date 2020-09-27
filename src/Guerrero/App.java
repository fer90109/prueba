package Guerrero;

public class App 
{
    public static void main(String[] args)
    {  
        TheBigOne theBigOne = new TheBigOne(); 
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
            theBigOne.combat(listaDeGuerreros[i]);
        }        
        System.out.println("El guerrero Mas poderoso es Nª: " +theBigOne.theBigOne.numerodeWarrior );
        System.out.println("Arma: - " +theBigOne.theBigOne.arma.nombre +" -   Defenza: - " +theBigOne.theBigOne.escudo.nombre);
        System.out.println(" -  con un daño max de: " +theBigOne.theBigOne.maxDamage);
    }            
}
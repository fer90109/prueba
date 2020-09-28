package Guerrero;

public class Torneo
{
    boolean firstWarrior = true;
    Warrior theBigOne;
    int amountDamageA;
    int amountDamageB;   
    boolean alive;
    
    public Warrior combat(Warrior contendiente)
    {    
        System.out.println(" --------  New Combat --------- GO!! ");
        System.out.println("");
        
        firstWarrior(contendiente);
        crossfire(contendiente);
       
        System.out.println(" -        Fin del Combate       -  ");
        System.out.println("");       
        return theBigOne;
    }    
   
    public void newBig ()
    {
        System.out.println("***Hay un nuevo Big y es : " + theBigOne.numerodeWarrior + " ***");
        System.out.println("***usando la: "+ theBigOne.arma.nombre);
        System.out.println("***Usando el escudo: "+ theBigOne.escudo.nombre);   
        System.out.println("***New max Damage is: " + theBigOne.maxDamage);       
    }
   
    public void crossfire(Warrior contendiente) 
    {
        while(theBigOne.vida >= 1 && contendiente.vida >= 1)
        {
            theBigOne.atacar(contendiente, theBigOne.arma);
            amountDamageA += (theBigOne.arma.power - contendiente.escudo.defensa);
            contendiente.atacar(theBigOne, contendiente.arma);
            amountDamageB += (contendiente.arma.power - theBigOne.escudo.defensa);     
        }
            bigOneSelector(contendiente);
    }
    
    public void bigOneSelector(Warrior contendiente)
    { 
        
        if(!isAlive(contendiente))
        {                   
            if(contendiente.vida < theBigOne.vida)  
            {                         
                if(amountDamageA > theBigOne.maxDamage)
                {
                    theBigOne.maxDamage = amountDamageA;
                    System.out.println("New Max Damage del Big One: " + theBigOne.maxDamage);      
                }  
            }
            else
            {  
                if(theBigOne.maxDamage < amountDamageB)
                theBigOne = contendiente;  
                theBigOne.maxDamage = amountDamageB;                    
                newBig();   
            }         
        } 
        else
        {
            theBigOne = contendiente;
            theBigOne.maxDamage = amountDamageB;              
            newBig();                
        }  
        theBigOne.vida = 100;
        amountDamageA = 0;
        amountDamageB = 0;     
    }
    
    public boolean isAlive(Warrior warrior)
    {
        if (warrior.vida > 0 )
        {
            boolean alive = true;
        } 
        return alive;           
    }
    
    public void fianlWiner()
    {
        System.out.println("El guerrero Mas poderoso es Nª: " +  +theBigOne.numerodeWarrior );
        System.out.println("Arma: - " +theBigOne.arma.nombre +" -   Defenza: - " +theBigOne.escudo.nombre);            
        System.out.println(" -  con un daño max de: " +theBigOne.maxDamage);
    }  
    
    public void firstWarrior(Warrior contendiente)
    {
        if (firstWarrior)
        {   
            theBigOne = contendiente;
            firstWarrior = false;  
            System.out.println("----------------- Hay un Primer Big y es el Nº: " + theBigOne.numerodeWarrior + "----");    
            System.out.println("usando la: "+ theBigOne.arma.nombre);
            System.out.println("Usando el escudo: "+ theBigOne.escudo.nombre);
        }
    }
}
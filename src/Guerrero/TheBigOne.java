package Guerrero;

public class TheBigOne
{
    boolean hayBigOne = false;
    Warrior theBigOne;
    int maxDamage;
    public TheBigOne()
    { 
    }
         
   public Warrior combat(Warrior contendiente)
   {    
        System.out.println(" --------  New Combat --------- GO!! ");
        int amountDamageA = 0;
        int amountDamageB = 0;
   
       if (hayBigOne == false)
        {
            theBigOne = contendiente;
            hayBigOne = true;  
            System.out.println("----------------- Hay un nuevo Big y es el Nº: " + theBigOne.numerodeWarrior + "-------------------------");    
            System.out.println("usando el: "+ theBigOne.arma.nombre);
            System.out.println("Usando el escudo: "+ theBigOne.escudo.nombre);
        }
        else       
        {   
            while(theBigOne.vida >= 1 && contendiente.vida >= 1)
            {
                theBigOne.atacar(contendiente, theBigOne.arma);
                amountDamageA += (theBigOne.arma.power - contendiente.escudo.defensa);

                contendiente.atacar(theBigOne, contendiente.arma);
                amountDamageB += (contendiente.arma.power - theBigOne.escudo.defensa);     
            }
            // murio contendiete
            if (contendiente.vida <= 0 )
            {                   
                //contendiente menos vida q big 
                if(contendiente.vida < theBigOne.vida)  
                {       
                    System.out.println("No dio con el Pine...");
                   
                    //big metio max daño    
                    if(amountDamageA > theBigOne.maxDamage)
                    {
                        maxDamage = amountDamageA;   
                        theBigOne.maxDamage = maxDamage;
                        System.out.println("New Max Damage1: " + theBigOne.maxDamage);   
                    }                  
                }
                else
                {   
                    //gano contendiente
                    if (amountDamageB > maxDamage )
                    {
                        System.out.println("New Max Damage2: " + maxDamage); 
                        theBigOne.maxDamage = maxDamage;
                    } 
                                         
                    theBigOne = contendiente;
                    System.out.println(" ------------------------  Hay un nuevo Big y es : " + theBigOne.numerodeWarrior + "-------------------------");
                    System.out.println("usando el: "+ theBigOne.arma.nombre);
                    System.out.println("Usando el escudo: "+ theBigOne.escudo.nombre); 
                }         
            } 
            else
            {
                //solo murio el big
                if(theBigOne.vida <= 0)
                {
                    
                    if (amountDamageB > theBigOne.maxDamage)
                    {
                        theBigOne.maxDamage = maxDamage;
                        System.out.println("New Max Damage: " + theBigOne.maxDamage); 
                    } 
                    //gano contendiente
                    System.out.println(" ------------------------  Hay un nuevo Big y es : " + theBigOne.numerodeWarrior + "-------------------------");
                    System.out.println("usando el: "+ theBigOne.arma.nombre);
                    System.out.println("Usando el escudo: "+ theBigOne.escudo.nombre);  
                }
            }     
        }  
        theBigOne.vida = 100;
        return theBigOne;
    }    
}


package Guerrero;

public class TheBigOne
{
    boolean hayBigOne = false;
    Warrior theBigOne;
    
    public TheBigOne()
    { 
    }
         
   public Warrior combat(Warrior contendiente)
   {    
        System.out.println(" --------  New Combat --------- GO!! ");
        System.out.println("");
        
        int amountDamageA = 0;
        int amountDamageB = 0;
   
       if (hayBigOne == false)
        {
            theBigOne = contendiente;
            hayBigOne = true;  
            System.out.println("----------------- Hay un Primer Big y es el Nº: " + theBigOne.numerodeWarrior + "----");    
            System.out.println("usando la: "+ theBigOne.arma.nombre);
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
                    //big metio max daño?                      
                    if(amountDamageA > theBigOne.maxDamage)
                    {
                        theBigOne.maxDamage = amountDamageA;
                        System.out.println("New Max Damage del Big One: " + theBigOne.maxDamage);   
                    } 
                }
                else
                {   
                    //gano contendiente
                    if (amountDamageB > theBigOne.maxDamage )
                    {
                        theBigOne = contendiente;      
                        theBigOne.maxDamage = amountDamageB;                    
                        newBig();   
                    }
                }         
            } 
            else
            {
                //solo murio el big
                theBigOne = contendiente;
                theBigOne.maxDamage = amountDamageB;              
                newBig();                
            }     
        }  
        theBigOne.vida = 100;
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
}


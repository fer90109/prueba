package Guerrero;


public class TheBigOne
{
    Warrior theBigOne;
    boolean primerGuerrero ;
    
    public TheBigOne()
    {
        
    }
    
   public Warrior combate(Warrior contendiente)
   {   
       if (primerGuerrero)
        {
            System.out.println(" probando" + theBigOne.numerodeWarrior);
            theBigOne = contendiente;
             primerGuerrero = false;  
        }
       else       
        {       
            theBigOne.atacar(contendiente, contendiente.arma);
                        
            if(contendiente.vida <= 0)
            {   
                System.out.println(" El contendiente no dio con el tupe");
            }      
            else             
            {
                contendiente.atacar(theBigOne, contendiente.arma);
                if (theBigOne.vida <= 0)
                {
                    theBigOne = contendiente;
                    System.out.println(" El nuevo THE BIG ONE ES: Guerrero" +theBigOne.numerodeWarrior );   
                }
            }
        theBigOne.vida = 100;
        }
    return theBigOne;
    }    
}

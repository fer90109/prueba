package Guerrero;


public class TheBigOne
{
    Warrior theBigOne;
    Warrior contendiente;
    boolean primerGuerrero;
    
    public TheBigOne()
    {
        
    }
    
   public Warrior Combate(Warrior contendiente)
   {   
       if (primerGuerrero)
        {
           theBigOne = contendiente;
           primerGuerrero = false;          
        }
       else       
        {            
            theBigOne.atacar(contendiente, theBigOne.arma);                                 

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

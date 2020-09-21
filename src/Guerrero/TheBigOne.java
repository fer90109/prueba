package Guerrero;

public class TheBigOne
{
    boolean hayBigOne = false;
    Warrior theBigOne;

    public TheBigOne()
    { 
    }

   public Warrior combate(Warrior contendiente)
   {    
   
       if (hayBigOne == false)
        {
            theBigOne = contendiente;
            hayBigOne = true;  
        }
        else       
        {   
            contendiente.maxHealth(theBigOne);

             while(theBigOne.vida >= 1 && contendiente.vida >= 1)
            {
                theBigOne.atacar(contendiente, theBigOne.arma);
                System.out.println("vida del contendiente: " +contendiente.vida);

                if(contendiente.vida <= 0)
                {   
                    System.out.println(" El contendiente no dio con el pine");
                }      
                else             
                {
                    System.out.println("contendiente ataca");
                    contendiente.atacar(theBigOne, contendiente.arma);

                    if (theBigOne.vida <= 0)
                    {
                        theBigOne = contendiente;
                        System.out.println(" El nuevo THE BIG ONE ES: Guerrero" +theBigOne.numerodeWarrior );   
                    }                    
                }    
            }
        }
        System.out.println("set la vida a 100 the big one");
        return theBigOne;
    }    
}

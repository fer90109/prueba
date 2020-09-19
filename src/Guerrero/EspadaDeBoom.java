package Guerrero;


public class EspadaDeBoom extends Weapon
{
    public EspadaDeBoom()
    {
        numeroDeArma = 1;
        power += 10 ;
        nombre = "Espada Boom"; 
    }
    
    @Override   
    public void accionIndividual()
    {
        System.out.println("BOOOOOOM");
   //     this.power -= 10;
    }
    
}

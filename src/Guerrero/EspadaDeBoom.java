package Guerrero;


public class EspadaDeBoom extends Weapon
{
    public EspadaDeBoom()
    {
        numeroDeArma = 1;
        power += 80 ;
        nombre = "Espada Boom"; 
    }
    
    @Override   
    public void accionIndividual()
    {
        System.out.println("BOOOOOOM");
    }
    
}

package Guerrero;

public class EspadaDeFuego extends Weapon
{  
    public EspadaDeFuego()
    {
        numeroDeArma = 1;
        power += 18 ;
        nombre = "Espada De Fuego"; 

    }    

    @Override
    public void accionIndividual()
    {
        System.out.println( "Quema!" );     
    }
}


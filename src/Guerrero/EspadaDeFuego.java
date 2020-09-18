package Guerrero;

public class EspadaDeFuego extends Weapon
{  
    public EspadaDeFuego()
    {
        numeroDeArma = 1;
        power += 25 ;
        nombre = "Espada De Fuego"; 

    }    

    @Override
    public void accionIndividual()
    {
        System.out.println( "Quema!" );     
    }
}


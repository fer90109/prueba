package Guerrero;

public class EspadaDePapel extends Weapon
{
    public EspadaDePapel()
    {
        numeroDeArma = 3;
        power += 5 ;
        nombre = "Espada De Papel"; 

    }

    @Override
    public void accionIndividual()
    {
        System.out.println("Soy lo mas inutil que hay");
    }
    
}


package Guerrero;

public class EspadaFantasma extends Weapon{
    
    public EspadaFantasma()
    {
        numeroDeArma = 2;
        power += 0 ;
        nombre = "Espada Fantasma";  
    }
    
 
    @Override
    public void accionIndividual()
    {
        System.out.println("el fantasma dentro de la espada te da un SUSTO!!!!!!");
        System.out.println("aumenta el daño de la espada fantasma en 20");
        this.power += 30;
    }
}


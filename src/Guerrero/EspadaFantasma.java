
package Guerrero;

public class EspadaFantasma extends Weapon{
    
    public EspadaFantasma()
    {
        numeroDeArma = 2;
        power += (int)(Math.random()*40);   ;
        nombre = "Espada Fantasma";  
    }
    
 
    @Override
    public void accionIndividual()
    {
        System.out.println("el fantasma dentro de la espada daña: " +power);
   //     System.out.println("aumenta el daño de la espada fantasma en 20");
   //     this.power += 20;
    }
}


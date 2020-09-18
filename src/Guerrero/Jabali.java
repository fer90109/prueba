
package Guerrero;


public class Jabali extends FormaDeVida
{
    public Jabali()
    {   
        vida += 100;
        nombre = "Jabali";
        power += 30;
    }
    
    public void atacar (Warrior guerrero)
    {        
        for (int i = 0; i < 3; i++)             
        {        
            guerrero.vida -= 3;
            System.out.println("El jabali hace :Daño 3");
        }
        System.out.println("la vida del guerrero es : " + guerrero.vida);
    } 
    
    public void morir()
    {
        System.out.println("JuIIIIIIIIIIIIIIIII");
    }
    
}

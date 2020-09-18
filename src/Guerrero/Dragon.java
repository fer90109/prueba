
package Guerrero;


public class Dragon extends FormaDeVida
{
    int contadorBolaDeFuego = 0;   
 
    public Dragon()
    {
        nombre = "Dragon";
        vida += 50;
        defensa += 0;
        power = 45;

        System.out.println("    HOOOOOO   ha aparecido un Gran Dragon!!!!!");
        System.out.println("Daño del Dragon: " +power);
        System.out.println("la vida del Dragon es: "+vida);      
    }
    
    public void atacar(Warrior objetivoGuerrero)
    {   

        objetivoGuerrero.vida -= power - objetivoGuerrero.escudo.defensa; 
        System.out.println("la vida del guerrero es : " + objetivoGuerrero.vida);
        contadorBolaDeFuego ++;  
        if (contadorBolaDeFuego == 2)
        {
            objetivoGuerrero.escudo.GritoDefensivo();
            bolaDeFuego(objetivoGuerrero); 
            contadorBolaDeFuego = 0;
        }
        objetivoGuerrero.defensa -= 60; 
    }  
    
    public void bolaDeFuego(Warrior guerrero)
    {   
        System.out.println("El Dragon Lanza Una bola de Fuego hacia el guerrero: ...");
        System.out.println("Boom");
        System.out.println("El guerrero Grita desaforadamente y se cubre con todas sus fuerzas");
        guerrero.vida -= power + 20;
        System.out.println("La Bola de Fuego hace: " + power*3 +" menos la armadura " +guerrero.escudo.defensa);
    }
    
    public void morir()
    {
        System.out.println("Ha muerto el gran dragon");
    }
    
    
}

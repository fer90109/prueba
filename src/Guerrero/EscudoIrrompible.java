package Guerrero;


public class EscudoIrrompible extends Escudo
{  
    public EscudoIrrompible()
    {
        defensa += 20; 
        nombre = "Escudo Irrompible"; 
    }

    @Override
    public void GritoDefensivo()
    {
        this.defensa += 7;
        
    }        
}

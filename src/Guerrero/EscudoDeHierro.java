
package Guerrero;

public class EscudoDeHierro extends Escudo
{  
    public EscudoDeHierro()
    {
        defensa += 10; 
        nombre = "Escudo De Hierro"; 
    }
       
    @Override
    public void GritoDefensivo()
    {
     //   this.defensa += 1;
    }   
}


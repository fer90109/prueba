package Guerrero;

public class Warrior extends FormaDeVida
{        
    int numeroDeArma;
    int numeroDeEscudo;
    int numerodeWarrior;
    int maxDamage;
    public Warrior()
    {      
        numeroDeArma = (int)(Math.random()*4);  
        numeroDeEscudo = (int)(Math.random()*2);       
        equiparEspada(numeroDeArma);      
        equiparEscudo(numeroDeEscudo);    
    }
 
    //Equipar  
    
    public void equiparEspada(int numeroDeArma)
    {   
        switch(numeroDeArma)
        {
            case 0:
                EspadaDeFuego espadaDeFuego = new EspadaDeFuego();
                arma = espadaDeFuego;
            break;
          
            case 1:
                EspadaFantasma espadaFantasma = new EspadaFantasma();
                arma = espadaFantasma;
            break;
            
            case 2:
                EspadaDePapel espadaDePapel = new EspadaDePapel();
                arma = espadaDePapel;
            break;
            
            case 3:
                EspadaDeBoom espadaDeBoom = new EspadaDeBoom();
                arma = espadaDeBoom;
            break;
        }        
     //   System.out.println(" equipada: " +arma.nombre ); 
    }    
    
    public void equiparEscudo(int numeroDeEscudo)
    {
        switch(numeroDeEscudo)
        {
            case 0:
                EscudoDeHierro escudoDeHierro = new EscudoDeHierro();
                this.escudo = escudoDeHierro;      
            break;
                
            case 1:
                EscudoIrrompible escudoIrrompible = new EscudoIrrompible();
                this.escudo = escudoIrrompible;
            break;
        }
    //    System.out.println(" equipado: " +escudo.nombre);
    }
    
    // golpes
 
    public void atacar(FormaDeVida formaDeVida,Weapon arma)
    {
        int reducirVida = (this.arma.power - formaDeVida.escudo.defensa);
        
        if(reducirVida >= 0)
        {
            formaDeVida.vida -= reducirVida;
        }
 //       arma.accionIndividual();   
    }
    
    public void morir()
    {
        System.out.println(" Hooo El guerrero Muere");
    }  
}

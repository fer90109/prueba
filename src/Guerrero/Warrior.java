package Guerrero;

public class Warrior extends FormaDeVida
{        
    int numeroDeArma;
    int numeroDeEscudo;
    
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
        System.out.println(this.nombre +" equipo: " +arma.nombre ); 
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
        System.out.println(" El " + nombre +" equipo: " +escudo.nombre);
    }
    
    
// golpes
     
   
    public void atacar(FormaDeVida formaDeVida,Weapon arma)
    {
        formaDeVida.vida -= (this.arma.power );
        System.out.println("la vida de " + formaDeVida.nombre +" es : " +formaDeVida.vida);
        System.out.println(" -- "+this.nombre + " esta atacando a "+ formaDeVida.nombre );
        arma.accionIndividual();
    }
   
// varios
    
    public void morir()
    {
        System.out.println(" Hooo El guerrero Muere");
    }
}

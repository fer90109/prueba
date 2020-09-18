package Guerrero;

public class Arena 
{  
    int contador; 
    Warrior warriorSlot;

    Warrior warriorSlot1;
    Warrior warriorSlot2;
    Warrior warriorSlot3;
    Warrior warriorSlot4;       
    
    Warrior semifinalistaA;
    Warrior semifinalistaB;
    
    Warrior finalista;
    
    public Arena()
    {
        int contador = 0;
    }

    public void cargarArena(Warrior warrior)
    {   
        if ("Juan".equals(warrior.nombre))
        {
            warriorSlot1 = warrior;
            System.out.println("cargado: "+warriorSlot1.nombre + " ingreso a la arena");
        }
        
        if ("Pepe".equals(warrior.nombre))
        {
            warriorSlot2 = warrior;
            System.out.println("cargado: "+warriorSlot2.nombre + " ingreso a la arena");
        }
        
        if ("Jose".equals(warrior.nombre))
        {
            warriorSlot3 = warrior;
            System.out.println("cargado: "+warriorSlot3.nombre + " ingreso a la arena");
        }
        if ("Fer".equals(warrior.nombre))
        {
            warriorSlot4 = warrior;          
            System.out.println("cargado: "+warriorSlot4.nombre + " ingreso a la arena");
        }
    }  
          
    public void CombatesArena(Warrior warriorSlot1 , Warrior warriorSlot2 , Warrior warriorSlot3 ,Warrior warriorSlot4 )
    {
        System.out.println("combate 1");
        while (warriorSlot1.vida >= 1 && warriorSlot2.vida >= 1)
        {   
            warriorSlot1.atacar(warriorSlot2, warriorSlot1.arma);                                 
   
            if(warriorSlot2.vida <= 0)
            {   
                semifinalistaA = warriorSlot1;
                System.out.println(" Semifinalista A: " +warriorSlot1.nombre);
            }      
            else             
            {
                warriorSlot2.atacar(warriorSlot1, warriorSlot2.arma);
                
                if (warriorSlot1.vida <= 0)
                {
                semifinalistaA = warriorSlot2;
                System.out.println(" Semifinalista A: " +warriorSlot2.nombre);   
                }
            }
        }
        
        System.out.println("");

            System.out.println("combate 2");      

        // Combate B por el lugar semifinalistaB
        while (warriorSlot3.vida >= 1 && warriorSlot4.vida >= 1)
        {          
            if(warriorSlot3.vida >= 1)
            {
                warriorSlot3.atacar(warriorSlot4, warriorSlot3.arma);
                if (warriorSlot4.vida <= 0)
                {
                    semifinalistaB = warriorSlot3;
                    System.out.println(" Semifinalista B: " +warriorSlot3.nombre);
                }
                else
                {
                    warriorSlot4.atacar(warriorSlot3, warriorSlot4.arma);
                    if(warriorSlot3.vida <= 0)
                    {
                        semifinalistaB = warriorSlot4;
                        System.out.println(" Semifinalista B: " +warriorSlot4.nombre);
                    }
                }
            } 
        }
 
        //Final

        semifinalistaA.vida += 100;
        semifinalistaB.vida += 100;
        System.out.println("CURA 100 DE VIDA");
        System.out.println("vida de " +semifinalistaA.nombre +semifinalistaA.vida);
        System.out.println("vida de " +semifinalistaB.nombre +semifinalistaB.vida);
       
        while(semifinalistaA.vida >= 1 && semifinalistaB.vida >= 1)
        {
            semifinalistaA.atacar(semifinalistaB, semifinalistaA.arma);
            if(semifinalistaB.vida <= 0)
            {
                finalista = semifinalistaA;
            }
            else
            {
                semifinalistaB.atacar(semifinalistaA, semifinalistaB.arma);
            }
            if(semifinalistaA.vida <= 0)
            {
                finalista = semifinalistaB;
            }      
        }
        System.out.println(" EL GANADOS ES :");
        System.out.println("     " +finalista.nombre);
    }   
}

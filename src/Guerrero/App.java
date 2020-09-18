package Guerrero;

public class App 
{
    public static void main(String[] args)
    {  
       //Creando a los 4 combatientes   
        Arena arena = new Arena();   
        for (int i = 1; i < 5; i++)
        {
            Warrior warrior = new Warrior(); 
            String nombres[] = {"Juan" , "Pepe" , "Jose" , "Fer" , ""};
            warrior.nombre = nombres[i-1];
           System.out.println("este  es : "+ warrior.nombre);
            arena.warriorSlot = warrior;

            arena.cargarArena(warrior);
            System.out.println("");
        }     
        arena.CombatesArena(arena.warriorSlot1, arena.warriorSlot2, arena.warriorSlot3, arena.warriorSlot4);
    }            
}

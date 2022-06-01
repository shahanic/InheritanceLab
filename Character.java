public class Character {
    public String characterName ;
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

         /*** Create two Constructors
 * 1 - Non Parameterized Constructor
 * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana*/

        Character(String name){
            this.characterName = name;

         }
        Character(String name, int newLevel, int newHP, int newMana){
            this.characterName = name;
            this.level = newLevel;
            this.healthPoints = newHP;
            this.manaPoints = newMana;

         }

        // Method that displays the Name of the Character
        public void displayCharName(){
         System.out.println("Character Initialized : " + this.characterName);
         }



      // Method that displays the stats
         public void displayStatus(){

         System.out.println("Character Name: " + this.characterName);
         System.out.println("Level: " + this.level);
         System.out.println("Health Points: " + this.healthPoints);
         System.out.println("Mana Points: " + this.manaPoints);

         System.out.println("---------------------------------------------------\n");

         }

         /**
 * Create a method to Damage Target Character
 */
        public void damageTarget(Character enemyCharacter,int damagePoints, int ManaPoints){

        enemyCharacter.healthPoints -= damagePoints; //Deduct health points from enemy character
         System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
         this.manaPoints -= ManaPoints;//deduct manapoint when spell is casted

         /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
          */

         if (enemyCharacter.healthPoints <= 0){
            System.out.println("---------------------------------------------------\n");
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            System.out.println(this.characterName + " leveled up!");
            this.level += 10; // adds 10 whoever wins the battle

            }

         }
}

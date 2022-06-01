public class Warlock extends Character {
    Warlock(String name){
         super(name);
        }

         //Attacking Skills
         public void frostBite (Character enemyCharacter){
        System.out.println(super.characterName + " attacks " +  enemyCharacter.characterName + " with frostBite (Damage - 30)");
        int damagePoints = 30;
         int manaCost = 45;
         damageTarget(enemyCharacter, damagePoints, manaCost);
         }

         public void scarletRot (Character enemyCharacter){
         System.out.println(super.characterName + " attacks " +  enemyCharacter.characterName + " with scarletRot (Damage - 50)");
         int damagePoints = 50;
         int manaCost = 60;
         damageTarget(enemyCharacter, damagePoints, manaCost);
         }



         //Health and Mana Regeneration
         public void heal (){
         System.out.println(super.characterName + " healed!  +20 Health Points and Mana");
         super.healthPoints +=20;
         super.manaPoints +=20;
        };

}


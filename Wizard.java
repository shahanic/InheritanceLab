public class Wizard extends Character {
    Wizard(String name){
         super(name);
         }

         //Attacking Skills
         public void thunderBolt(Character enemyCharacter){
         System.out.println(super.characterName + " attacks " +  enemyCharacter.characterName + " with thunderBolt (Damage - 30)");
         int damagePoints = 30;
         int manaCost = 45;
         damageTarget(enemyCharacter, damagePoints, manaCost);
         }

         public void fireStorm(Character enemyCharacter){
         System.out.println(super.characterName + " attacks" + enemyCharacter.characterName + " with fireStorm (Damage - 40)");
              int damagePoints = 40;
              int manaCost = 60;
         damageTarget(enemyCharacter, damagePoints, manaCost);

         }


         //Health and Mana Regeneration
         public void recover (){
         System.out.println(super.characterName + " recovered generated 20 Health Points and Mana");
         super.healthPoints +=20;
         super.manaPoints +=20;

         }
}

package practice_2.task8;


public class Game {
    public static void main(String[] args) {
        Character character = new CharacterBuilder()
                .setHealth(80)
                .setDamage(75)
                .setArmor(60)
                .setMagic(50)
                .build();

        character.displayCharacter();
    }
}

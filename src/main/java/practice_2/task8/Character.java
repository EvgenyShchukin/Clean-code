package practice_2.task8;

public class Character {
    private int health, damage, armor, magic;

    public Character(int health, int damage, int armor, int magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public void displayCharacter() {
        System.out.println("Характеристики игрока:"
                + " \nЗдоровье: " + health
                + " \nУрон: " + damage
                + " \nБроня: " + armor
                + " \nМагия: " + magic
        );
    }
}

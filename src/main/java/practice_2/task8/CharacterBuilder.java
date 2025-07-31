package practice_2.task8;

import practice_2.task7.Order;

public class CharacterBuilder {
    private int health = 0;
    private int damage = 0;
    private int armor = 0;
    private int magic = 0;

    public CharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public CharacterBuilder setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    public CharacterBuilder setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public Character build() {
        return new Character(health, damage, armor, magic);
    }
}

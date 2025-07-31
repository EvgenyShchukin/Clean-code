package practice_2.task4;


public class Main {
    public static void main(String[] args) {
        Weapon weapon;
        String weaponType = "Gun";

        if ("gun".equalsIgnoreCase(weaponType)) {
            weapon = new Gun();
        } else if ("bow".equalsIgnoreCase(weaponType)) {
            weapon = new Bow();
        } else {
            weapon = new Sword();
        }

        weapon.attack();
    }
}

package practice_2.task4;

public class BowFactory extends WeaponFactory{
    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}

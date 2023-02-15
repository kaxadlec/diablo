package Game;

public class Bow implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("활을 쏴라");
    }
}

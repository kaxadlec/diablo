package Game;

public class Diablo {
    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();

        Bow windForce = new Bow();
        Axe berserkerAxe = new Axe();

        s1.setWeapon(windForce);
        s1.performWeapon();

        b1.setWeapon(berserkerAxe);
        b1.performWeapon();

        s1.setWeapon(new Axe());    // 익명 객체
        s1.performWeapon();

        s1.info();

    }
}

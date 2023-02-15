package Game;

public class Diablo {
    public static void main(String[] args) {
        Sorceress s1 = new Sorceress();
        Bow windForce = new Bow();
        s1.setWeapon(windForce);
        s1.performWeapon();
    }
}

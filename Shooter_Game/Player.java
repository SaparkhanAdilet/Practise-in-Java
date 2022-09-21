package Shooter_Game;

public class Player {

    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[]{
                new Pistolet(),
                new Avtomat(),
                new RPG(),
                new Rogatka(),
                new WaterPistolet()

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        String error = "Ne korerknoe znashenie";
       if(slot < 0 || slot >= weaponSlots.length) {
           System.out.println(error);
       }else{
           Weapon weapon = weaponSlots[slot];
           weapon.shot();
       }

    }
}




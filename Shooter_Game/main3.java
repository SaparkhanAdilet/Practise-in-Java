package Shooter_Game;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("U igroka %d clotov s orujiem, " +
                        " Vvedite nomer, chtoby vystrelit, " +
                        " -1 chtoby vyity%n ", +
                        player.getSlotsCount()
                );
        int slot;

        while(true){
            slot =scanner.nextInt();
            if(slot == -1){
                break;
            }
                player.shotWithWeapon(slot);
        }
        System.out.println("Game over!");
    }
}

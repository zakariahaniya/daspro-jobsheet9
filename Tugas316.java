import java.util.Scanner;
/**
 * Tugas316
 */
public class Tugas316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String search;
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukkan nama menu yang dicari :");
            search = sc.nextLine();
            if (search.equalsIgnoreCase(menu[i])) {
                System.out.println("Menu " + menu[i] + " Tersedia di menu");
            } else {
                System.out.println("Menu " + search + " Tidak ada di menu");
            }
        }
    }
}
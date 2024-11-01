import java.util.Scanner;
/**
 * Tugas216
 */
public class Tugas216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.print("Masukkan Jumlah Pesanan : ");
        int length = sc.nextInt();
        sc.nextLine();
        String[] jumlah = new String[length];
        int[] harga = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Masukkan Nama Pesanan : ");
            jumlah[i] = sc.next();
            System.out.print("Masukkan Harga Pesanan : ");
            harga[i] = sc.nextInt();
            total += harga[i];
            sc.nextLine();
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Daftar Pesanan :");
            System.out.println("- " + jumlah[i] + " : Rp" + harga[i]);
        }
        System.out.println("Total biaya : Rp" + total);
    }
}
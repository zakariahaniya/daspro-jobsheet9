import java.util.Scanner;
/**
 * SearchNilai16
 */
public class SearchNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int length = sc.nextInt();
        int[] nilaiMhs = new int[length];
        int key, hasil = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt(); 
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();
        System.out.println();
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i+1;
            }
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        } else {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        }
    }
}
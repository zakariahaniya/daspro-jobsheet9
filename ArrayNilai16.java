import java.util.Scanner;
/**
 * ArrayNilai16
 */
public class ArrayNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus");   
            } else {
                System.out.println("Mahasiswa ke-" + i + "Tidak lulus");
            }
        }
    }
}
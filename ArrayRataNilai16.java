import java.util.Scanner;
/**
 * ArrayRataNilai16
 */
public class ArrayRataNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int length = sc.nextInt();
        int[] nilaiMhs = new int[length];
        int lulus = 0, gagal = 0;
        double totalLulus = 0, totalGagal = 0;
        double rata2Lulus, rata2Gagal;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalGagal += nilaiMhs[i];
                gagal++;
            }
        }
        rata2Lulus = totalLulus/lulus;
        rata2Gagal = totalGagal/gagal;
        System.out.println("Rata-rata nilai lulus : " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus : " + rata2Gagal);
    }
}
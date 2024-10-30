import java.util.Scanner;
/**
 * Tugas116
 */
public class Tugas116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa yang akan di input : ");
        int length = sc.nextInt();
        double rata2, total = 0;
        int tertinggi = 0, terendah = 100;
        int[] nilaiMhs = new int[length];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Nilai Rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println(nilaiMhs[i]);
        }
    }
}
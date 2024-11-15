import java.util.Scanner;

public class Tugasno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilai = new int[jmlMahasiswa];
        int total = 0;

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

    
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 1; i < jmlMahasiswa; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        double rataRata = (double) total / jmlMahasiswa;

        
        System.out.println("\nNilai yang telah dimasukkan:");
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}

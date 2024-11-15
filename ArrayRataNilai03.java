import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        double rataRataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataRataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}

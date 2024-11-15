import java.util.Scanner;

public class SearchNilaiModifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int indeksDitemukan = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                indeksDitemukan = i;
                break;
            }
        }

        if (indeksDitemukan != -1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeksDitemukan + 1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
    }
}

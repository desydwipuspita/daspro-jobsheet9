import java.util.Scanner;

public class Tugasnotiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

      
        System.out.print("Masukkan nama makanan yang ingin Anda cari: ");
        String makananDicari = sc.nextLine();

       
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) { 
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak tersedia di menu.");
        }

    }
}

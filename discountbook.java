import java.util.Scanner;

public class discountbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kategori buku (dictionary, novel, atau lainnya): ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();
        double diskon = 0;
        if (kategori.equalsIgnoreCase("dictionary")) {
            diskon = 10;
            if (jumlahBuku > 1) {
                diskon += 2;
            }
        } else if (kategori.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else if (jumlahBuku <= 3 && jumlahBuku > 0) {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }
        System.out.println("Diskon yang didapatkan: " + diskon + "%");
    }
}
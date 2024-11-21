import java.util.Scanner;

public class tugasno2 {
    static final int HARI = 7;
    static final int MENU = 5;
    static String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[MENU][HARI];
    static void inputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MENU; i++) {
            System.out.println("Masukkan data penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < HARI; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }
    static void tampilkanData() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < MENU; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int j = 0; j < HARI; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void menuTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < MENU; i++) {
            int total = 0;
            for (int j = 0; j < HARI; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTertinggi = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total " + maxPenjualan + " penjualan.");
    }
        static void rataRataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < MENU; i++) {
            int total = 0;
            for (int j = 0; j < HARI; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / HARI;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            switch (opsi) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    menuTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}

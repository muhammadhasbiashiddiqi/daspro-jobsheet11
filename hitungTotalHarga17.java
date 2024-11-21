import java.util.Scanner;

public class hitungTotalHarga17 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Kode promo valid: DISKON50 - Anda mendapat diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Kode promo valid: DISKON30 - Anda mendapat diskon 30%!");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada diskon yang diberikan.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0; 
        String lanjut;
        String kodePromo;
        System.out.print("Masukkan kode promo (jika ada, tekan ENTER jika tidak): ");
        kodePromo = sc.nextLine();
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu ini: ");
            int banyakItem = sc.nextInt();
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
            sc.nextLine();
            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            lanjut = sc.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("\nTotal keseluruhan pesanan Anda adalah: Rp " + totalKeseluruhan);
    }
}

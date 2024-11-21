public class DuaVarargs {
    public static void contohFungsi(String pesan, int... angka) {
        System.out.println("Pesan: " + pesan);
        System.out.println("Daftar angka:");

        for (int num : angka) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        contohFungsi("Angka favorit saya adalah:", 10, 20, 30, 40);
    }
}
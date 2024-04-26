public class Main {
    public static void prosesMasak(ResepMakanan resep) {
        resep.tampilkanBahan();
        resep.masak();
    }

    public static void main(String[] args) {
        // Membuat objek NasiGoreng
        NasiGoreng nasiGoreng = new NasiGoreng();
        nasiGoreng.tambahBahan("Nasi");
        nasiGoreng.tambahBahan("Telur");
        nasiGoreng.tambahBahan("Kecap");

        // Membuat objek MieGoreng
        MieGoreng mieGoreng = new MieGoreng();
        mieGoreng.tambahBahan("Mie");
        mieGoreng.tambahBahan("Telur");
        mieGoreng.tambahBahan("Bumbu Mie Goreng");

        // Proses masak
        System.out.println("Resep Nasi Goreng:");
        prosesMasak(nasiGoreng);

        System.out.println("\nResep Mie Goreng:");
        prosesMasak(mieGoreng);
    }
}

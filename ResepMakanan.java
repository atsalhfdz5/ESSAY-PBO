import java.util.ArrayList;
import java.util.List;

// Parent class ResepMakanan
public class ResepMakanan {
    protected String nama;
    protected List<String> bahan;

    public ResepMakanan(String nama) {
        this.nama = nama;
        this.bahan = new ArrayList<>();
    }

    public void tambahBahan(String bahan) {
        this.bahan.add(bahan);
    }

    public void tampilkanBahan() {
        System.out.println("Bahan untuk " + nama + ":");
        for (String b : bahan) {
            System.out.println("- " + b);
        }
    }

    public void masak() {
        System.out.println("Memasak " + nama + "...");
    }
}

// Child class NasiGoreng, inheritance dari ResepMakanan
class NasiGoreng extends ResepMakanan {
    private String bumbu;

    public NasiGoreng() {
        super("Nasi Goreng");
        this.bumbu = "Bumbu Nasi Goreng";
    }

    @Override
    public void masak() {
        System.out.println("Menggoreng nasi...");
        System.out.println("Menambahkan " + bumbu + "...");
        super.masak();
        System.out.println("Nasi Goreng siap disajikan!");
    }
}

// Child class MieGoreng, inheritance dari ResepMakanan
class MieGoreng extends ResepMakanan {
    public MieGoreng() {
        super("Mie Goreng");
    }

    @Override
    public void masak() {
        System.out.println("Merebus mie...");
        super.masak();
        System.out.println("Mie Goreng siap disajikan!");
    }
}

// Main Program
class Main {
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

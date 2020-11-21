package pboif2.pkg10119065.latihan51.gajikaryawan;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program GajiKaryawan
 */
public class PBOIF210119065Latihan51GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Manager man = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        man.setNik(sc.nextLine());
        System.out.print("Masukkan Nama : ");
        man.setNama(sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        man.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        man.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        man.setKehadiran(sc.nextInt());
        
        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("NIK : "+man.getNik());
        System.out.println("Nama : "+man.getNama());
        System.out.println("Golongan : "+man.getGolongan());
        System.out.println("Jabatan : "+man.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN : "+man.tunjanganGolongan(man.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+man.tunjanganJabatan(man.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+man.tunjanganKehadiran(man.getKehadiran()));
        System.out.println("\nGAJI TOTAL "+man.gajiTotal());
    }
    
}

package pboif2.pkg10119065.latihan51.gajikaryawan;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program GajiKaryawan
 */
public class Manager extends Karyawan{
    
    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    public float tunjanganKehadiran(int hadir)
    {
        return tunjanganKehadiran = hadir * 10000;
    }
    public float tunjanganJabatan(String jabatan)
    {
        int tunjangan;
        if(jabatan.equals("Manager") || jabatan.equals("manager"))
        {
            tunjangan = 2000000;
        }else if(jabatan.equals("Kabag") || jabatan.equals("kabag")){
            tunjangan = 1000000;
        }else{
            tunjangan = 0;
        }
        return this.tunjanganJabatan = tunjangan;
    }
    public float tunjanganGolongan(int golongan)
    {
        int tunjangan;
        switch(golongan) {
            case 1:
                tunjangan = 500000;
              break;
            case 2:
                tunjangan = 1000000;
              break;
            case 3:
                tunjangan = 1500000;
              break;
            default:
                tunjangan = 0;
          }
        return tunjanganGolongan = tunjangan;
    }
    
    public float gajiTotal()
    {
        return tunjanganKehadiran + tunjanganGolongan + tunjanganJabatan;
    }
}

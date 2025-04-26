public class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, int gajiPokok, Perusahaan perusahaan) throws Exception{
        if(nama.length() < 4){
            throw new Exception("Nama tidak boleh dibawah 4 karakter");
        }
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public String getNama(){
        return this.nama;
    }

    public void info(){
        System.err.println("\nNama Karyawan  : " + this.nama);
        System.err.println("Gaji Pokok     : Rp." + this.gajiPokok);
        System.out.println("Nama Perusahaan: " + perusahaan.namaPerusahaan);
    }
}

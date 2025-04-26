public class Main {
    public static void main(String[] args) {
        Perusahaan p1 = new Perusahaan("Google");

        Karyawan k1,k2,k3,k4;
        try {
            k1 = new Karyawan("Kharan", 35000000, p1);
            k2 = new Karyawan("Aldrin", 470000000, p1);
            k3 = new Karyawan("Rafi", 25000000, p1);
            k4 = new Karyawan("Farrel", 900000000, p1);

            k1.info();
            k2.info();
            k3.info();
            k4.info();
        } catch (Exception e) {
            System.err.println("Gagal");
        }
    }
}

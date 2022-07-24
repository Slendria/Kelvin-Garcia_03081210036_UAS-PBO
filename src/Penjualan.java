public class Penjualan {
    String IDPenjualan;
    String Tanggal;
    String IDPetugas;



    public Penjualan() {
    }

    public Penjualan(String IDPenjualan, String Tanggal, String IDPetugas) {
        this.IDPenjualan = IDPenjualan;
        this.Tanggal = Tanggal;
        this.IDPetugas = IDPetugas;
    }

    public String getIDPenjualan() {
        return this.IDPenjualan;
    }

    public void setIDPenjualan(String IDPenjualan) {
        this.IDPenjualan = IDPenjualan;
    }

    public String getTanggal() {
        return this.Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getIDPetugas() {
        return this.IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }

    @Override
    public String toString() {
        return
            
            "\t\t" + getTanggal() +
            "/" + getIDPenjualan() +
            "/" + getIDPetugas()
            ;
    }

}

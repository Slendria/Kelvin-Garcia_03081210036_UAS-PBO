import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Transaksi {
    String Namabrg;
    int Kuantitas;
    String tgl;
    int Harga;

    public Transaksi(){

    }
    public String getNamabrg() {
        return this.Namabrg;
    }

    public void setNamabrg(String Namabrg) {
        this.Namabrg = Namabrg;
    }

    public int getKuantitas() {
        return this.Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public String getTgl() {
        return this.tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public int getHarga() {
        return this.Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }


    public Transaksi(String Namabrg, int Kuantitas, String tgl, int Harga) {
        this.Namabrg = Namabrg;
        this.Kuantitas = Kuantitas;
        this.tgl = tgl;
        this.Harga = Harga;
    }


    @Override
    public String toString() {
        return
            " Nama Barang\t= " + getNamabrg() + "\n" +
            " Kuantitas\t= " + getKuantitas() + "\n" +
            " Tanggal\t= " + getTgl() + "\n" +
            " Total Harga\t= " + getHarga() + "\n";
    }
    public static ArrayList <Transaksi> initTransaksi(ArrayList <Transaksi> transaksi)
        {  
            Transaksi trn1 = new Transaksi("Air Purify", 1, "11 July 2022", 1400000);
            transaksi.add(trn1);
            Transaksi trn2 = new Transaksi("Iphone 10", 1, "11 July 2022", 10799000);
            transaksi.add(trn2);
            Transaksi trn3 = new Transaksi("Lampu", 10, "11 July 2022", 2000000);
            transaksi.add(trn3);
            Transaksi trn4 = new Transaksi("Vacum Cleaner", 1, "11 July 2022", 3400000);
            transaksi.add(trn4);
            Transaksi trn5 = new Transaksi("AC", 3, "11 July 2022", 8100000);
            transaksi.add(trn5);
            return transaksi;
        }

    public class Util{
        static final String fileInput = "D:\\Kelvin Garcia\\UPH\\Aksel 1\\PBO\\Final-Project-main\\Write.txt";
        static final String fileOutput = "D:\\Kelvin Garcia\\UPH\\Aksel 1\\PBO\\Final-Project-main\\Read.txt";
        ArrayList <Transaksi> transaksi = new ArrayList<>();
    public ArrayList<Transaksi> bacaFile(){
        String data;

        try 
        {
            File myFile = new File(fileInput);
            Scanner FileReader = new Scanner(myFile);
            do
            {
                data = FileReader.nextLine();
                System.out.println(data);
            }
            while(FileReader.hasNextLine());
        } 
        catch (Exception e) 
        {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }
        return transaksi;
    }
    public ArrayList<Transaksi> tulisFile()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data : ");
        String Tulis = input.next();
        try 
        {
            FileWriter fileWriter = new FileWriter(fileInput);
            fileWriter.write(Tulis);
            fileWriter.close();
            System.out.println("File Telah Berhasil ditambahkan");
        }
        catch (IOException e)
        {
            System.out.println("Terjadi kesalah karena :" + e.getMessage());
        }
        return transaksi;
    }
    }
}

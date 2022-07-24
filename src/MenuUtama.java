import java.util.ArrayList;
import java.util.Scanner;


public class MenuUtama {
    public static ArrayList<Penjualan> initPenjualan(ArrayList <Penjualan> penjualan)
    {
        Penjualan pnjl = new Penjualan ( "10101", " 11 July 2022 ", "0101");
        penjualan.add(pnjl);
        Penjualan pnjl2 = new Penjualan ( "20202", " 11 July 2022 ", "0202");
        penjualan.add(pnjl2);
        Penjualan pnjl3 = new Penjualan ( "30303", " 11 July 2022 ", "0303");
        penjualan.add(pnjl3);
        Penjualan pnjl4 = new Penjualan ( "40404", " 11 July 2022 ", "0404");
        penjualan.add(pnjl4);
        Penjualan pnjl5 = new Penjualan ( "50505", " 11 July 2022 ", "0505");
        penjualan.add(pnjl5);
        Penjualan pnjl6 = new Penjualan ( "60606", " 11 July 2022 ", "0606");
        penjualan.add(pnjl6);
        Penjualan pnjl7 = new Penjualan ( "70707", " 11 July 2022 ", "0707");
        penjualan.add(pnjl7);
        Penjualan pnjl8 = new Penjualan ( "80808", " 11 July 2022 ", "0808");
        penjualan.add(pnjl8);
        Penjualan pnjl9 = new Penjualan ( "90909", " 11 July 2022 ", "0909");
        penjualan.add(pnjl9);
        return penjualan;
    }
    public static ArrayList <Petugas> initPetugas(ArrayList <Petugas> petugas)
    {
        Petugas ptg1 =  new Petugas("0101", "Malih", "malih@gmail.com", "Sukaramai", "MalihGanteng", "MalihTheChipmonk");
        petugas.add(ptg1);
        Petugas ptg2 =  new Petugas("0201", "Budi", "budi@gmail.com", "Sukasepi", "BudiKece", "BudiBudi");
        petugas.add(ptg2);
        Petugas ptg3 =  new Petugas("0301", "Manite", "Manite@gmail.com", "Sukasendiri", "Maniterasi", "Mantap");
        petugas.add(ptg3);
        Petugas ptg4 =  new Petugas("0401", "Semi", "Semi@gmail.com", "Sukasukaaku", "Seminar", "MusimSemi");
        petugas.add(ptg4);
        Petugas ptg5 =  new Petugas("0501", "Poli", "Politron@gmail.com", "SukaLari", "Poligon", "Polisi");
        petugas.add(ptg5);
        return petugas;
    }        
    public static ArrayList <Member> initMember(ArrayList <Member> members)
    {
            Member mbr1 =  new Member (010001, "Karen", "Imam Bonjol", "0813777766554");
            members.add(mbr1);
            Member mbr2 =  new Member (010002, "Sem", "Lippo Plaza", "081276548765");
            members.add(mbr2);
            Member mbr3 =  new Member (010003, "Kevin", "Paladium", "08110983023");
            members.add(mbr3);
            Member mbr4 =  new Member (010004, "Gracia", "Pekalongan", "081226520938");
            members.add(mbr4);
            Member mbr5 =  new Member (010005, "Caiya", "Pesugihan", "081646973930");
            members.add(mbr5);
            return members;
    }
    
    public static ArrayList <Barang> initBarang(ArrayList <Barang> barangs)
        {
            Barang brg1 =  new Barang("010101","IoT", "Air Purify", 100, 1400000);
            barangs.add(brg1);
            Barang brg2 =  new Barang("020202","Smart Phone", "Samsung S22 Ultra", 50, 22000000);
            barangs.add(brg2);
            Barang brg3 =  new Barang("030303","Smart Phone", "Iphone 13", 34, 14499000);
            barangs.add(brg3);
            Barang brg4 =  new Barang("040404", "Smart Phone", "Iphone 10", 25, 10799000);
            barangs.add(brg4);
            Barang brg5 =  new Barang("050505", "IoT", "AC", 20, 2700000);
            barangs.add(brg5);
            Barang brg6 =  new Barang("060606", "IoT", "Tesla", 5, 1000000000);
            barangs.add(brg6);
            Barang brg7 =  new Barang("070707", "Smart Phone", "Samsung Galaxy Note Ultra 20", 20, 20000000);
            barangs.add(brg7);
            Barang brg8 =  new Barang("080808", "Smart Phone", "Oppo F1s", 5, 3000000);
            barangs.add(brg8);
            Barang brg9 =  new Barang("090909","IoT", "Lampu", 100, 200000);
            barangs.add(brg9);
            Barang brg10 =  new Barang("101010","IoT", "Vacum Cleaner", 100, 3400000);
            barangs.add(brg10);
            return barangs;
        }
    
    public static ArrayList <Stok> initStok(ArrayList<Stok>stok)
    {
        Stok stk1 = new Stok("Iphone 13 Pro Max", 10, "12 July 2022");
        stok.add(stk1);
        Stok stk2 = new Stok("Vacum Cleaner", 3, "12 July 2022");
        stok.add(stk2);
        Stok stk3 = new Stok("Air Purify",5,"12 July 2022");
        stok.add(stk3);
        Stok stk4 = new Stok("AC", 3, "12 July 2022");
        stok.add(stk4);
        Stok stk5 = new Stok("Samsung Galaxy S22 Pro", 10, "12 July 2022");
        stok.add(stk5);
        return stok;
    }
    
    
    public static void main(String[] args) throws Exception 
    {
        ArrayList <Petugas> petugas = new ArrayList <Petugas>();
        ArrayList <Member> members = new ArrayList <Member>();
        ArrayList <Barang> barangs = new ArrayList <Barang>();
        ArrayList <Penjualan> penjualans = new ArrayList<>();
        ArrayList <Keranjang> keranjangs = new ArrayList<>();
        ArrayList <Transaksi> transaksi = new ArrayList<>();
        ArrayList <Stok> stok = new ArrayList<>();
        
        initBarang(barangs);
        initMember(members);
        initPetugas(petugas);
        initStok(stok);
    
        Boolean Login = false;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Silahkan Login Terlebih Dahulu");
        System.out.println("==============================");
        do {
            menuBLMogin(petugas);
            Login = true;
            } while (Login == false);

        Scanner input = new Scanner(System.in);
        String yn="y";
        do 
        {
            
            MenuUtama();
            int pilihan = 0;
            pilihan = input.nextInt();
            if(pilihan==1)
            {
                String plhn = "y";
                do
                {
                    String IDPenjualan;
                    String IDPetugas;
                    String Tanggal;

                    Scanner dtl = new Scanner(System.in);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Masukkan Tanggal Pembelian \t:");
                    Tanggal=dtl.nextLine();
                    System.out.print("ID Pembelian \t\t\t:");
                    IDPenjualan=dtl.nextLine();
                    System.out.print("ID Petugas  \t\t\t:");
                    IDPetugas=dtl.nextLine();
                    penjualans.add(new Penjualan(IDPenjualan, Tanggal, IDPetugas)); 

                    String Barcode;
                    String Jenis;
                    String NamaItem;
                    int Harga=0;
                    int Total=0;
                    int Total1=0;
                    double Total2=0;
                    int Kuantitas=0;
                    System.out.print ("\nSilahkan Masukkan Barang Belanjaan Anda\n");
                    System.out.print ("=======================================\n");
                    String yns = "t";
                    //Insert Barang
                    do 
                    {
                        Scanner inp2 = new Scanner(System.in);
                        System.out.print("Masukkan Kode Barcode \t\t:");
                        Barcode = inp2.nextLine();
                        System.out.print("Masukkan Nama Item \t\t:");
                        NamaItem= inp2.nextLine();
                        System.out.print("Masukkan Jenis Item \t\t:");
                        Jenis = inp2.nextLine();
                        System.out.print("Masukkan Harga Barang \t\t:");
                        Harga = inp2.nextInt();
                        System.out.print("Masukkan Kuantitas Barang \t:");
                        Kuantitas = inp2.nextInt();
                        Total = Harga * Kuantitas;
                        keranjangs.add(new Keranjang(Barcode, Jenis, NamaItem, Kuantitas, Harga, Total));
                        Total1 += Total;
                        System.out.print ("\nIngin Memasukkan Barang Pembelanjaan Lagi? (y/n)\t:");
                        yns = input.next();
                    }while (yns.equalsIgnoreCase("y"));
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    //List Barang 

                    System.out.print ("\n\t\tKERANJANG \n =======================================\n");
                    for (Penjualan penjualan : penjualans) 
                    {
                        System.out.println("The Erafine" + penjualan);
                    }
                    System.out.println("QTY\t\tNama Item\t\tHarga");
                    for (Keranjang krjg : keranjangs) 
                    {
                        System.out.println(krjg);
                    }
                        System.out.println("\nTotal Pembelanjaan Anda : " + Total1 + "\n");
                    //menubarang melanjutkan pembayaran

                    System.out.println("MENU");
                    int plhn1=0;
                            
                    do
                    {
                        System.out.println("1. LANJUTKAN KE MENU PEMBAYARAN");
                        System.out.println("2. KELUAR");
                        System.out.print("Masukkan Pilihan Anda: ");
                        plhn1 = input.nextInt();
                        String z="";
                        String a;
                    
                        if (plhn1==1) 
                        {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\nTotal Pembelanjaan Anda : " + Total1);
                            System.out.println("\nMetode Pembayatan");
                            System.out.println("1. CASH");
                            System.out.println("2. KREDIT");
                            System.out.println("3. DEBIT");
                            int plhn4;
                            plhn4 = input.nextInt();
                            String k="";
                            
                            if (plhn4==1)
                                {
                                    int c;
                                    z = "CASH";
                                    System.out.println("Pembayaran Menggunakan Cash");
                                    System.out.println("==============================");
                                    Pembayaran cash = new Cash(Total1, 20000);
                                    System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                    System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + cash.MetodeByr());
                                    Total2 = cash.MetodeByr();
                                    System.out.print("UANG YANG DI TERIMA\t:");
                                    c = input.nextInt();
                                    System.out.println("PEMBAYARAN BERHASIL DILAKUKAN\t\n");
                                    System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                    k = input.next();
                                    if (k.equals("y"))
                                    {
                                        System.out.print ("\n\t\tBILLING \n =======================================\n");
                                        for (Penjualan penjualan : penjualans) 
                                        {
                                            System.out.println("The Erafine" + penjualan);
                                        }
                                        System.out.println("QTY\t\tNama Item\t\tHarga");
                                        for (Keranjang krjg : keranjangs) 
                                        {
                                            System.out.println(krjg);
                                        }
                                        System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                        System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                        System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                        System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                        return;
                                    }
                                }
                                if (plhn4==2)
                                {
                                        z = "Kredit";
                                        Kredit kredit = new Kredit(Total1, 0.1);
                                        System.out.println("Pembayaran Menggunakan KREDIT");
                                        System.out.println("==============================");
                                        System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                        System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + kredit.MetodeByr());
                                        Total2 = kredit.MetodeByr();
                                        System.out.print("MASUKKAN NOMOR KARTU\t:");
                                        a = input.next();
                                        System.out.println("PEMBAYARAN BERHASIL DENGAN NOMOR KARTU\t:" + a + "\n");
                                        System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                        k = input.next();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        if (k.equals("y"))
                                        {
                                            System.out.print ("\n\t\tBILLING \n =======================================\n");
                                            for (Penjualan penjualan : penjualans) 
                                            {
                                                System.out.println("The Erafine" + penjualan);
                                            }
                                            System.out.println("QTY\t\tNama Item\t\tHarga");
                                            for (Keranjang krjg : keranjangs) 
                                            {
                                                System.out.println(krjg);
                                            }
                                            System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                            System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                            System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                            System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                            return;
                                        }
                                        else 
                                        return;
                                    
                                }
                                if (plhn4==3)
                                {
                                    z = "Debit";
                                    Debit debit = new Debit(Total, 0.05);
                                    System.out.println("Pembayaran Menggunakan DEBIT");
                                    System.out.println("==============================");
                                    System.out.println("TOTAL PEMBAYARAN SEBELUM DISKON : " + Total1);
                                    System.out.println("TOTAL PEMBAYARAN SETELAH DISKON : " + debit.MetodeByr());
                                    Total2 = debit.MetodeByr();
                                    System.out.print("MASUKKAN NOMOR REKENING\t:");
                                    a = input.next();
                                    System.out.println("PEMBAYARAN BERHASIL DENGAN No.Rek \t:" + a + "\n");
                                    System.out.print("INGIN MENCETAK BILL? (y/n)\t:");
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    k = input.next();
                                    if (k.equals("y"))
                                    {
                                        System.out.print ("\n\t\tKERANJANG \n =======================================\n");
                                        for (Penjualan penjualan : penjualans) 
                                        {
                                            System.out.println("The Erafine" + penjualan);
                                        }
                                        System.out.println("QTY\t\tNama Item\t\tHarga");
                                        for (Keranjang krjg : keranjangs) 
                                        {
                                            System.out.println(krjg);
                                        }
                                        System.out.println("\nTotal Pembelanjaan Anda\t\t\t\t : " + Total1 + "\n");
                                        System.out.println("Total Pembelanjaan Anda Setelah Diskon \t: " + Total2 + "\n");
                                        System.out.println("Menggunakan Metode \t\t\t\t : " + z + "\n");
                                        System.out.println("TERIMA KASIH TELAH BERBELANJA DI ERAFIN");
                                        return;
                                    }
                                    else 
                                    return;
                                }      
                        }                      
                        else if (plhn1==2)
                        {
                            System.out.println("KAMU INGIN KEMBALI KE MENU UTAMA? (y/t)\t : ");
                            plhn = input.next();
                        } 
                        else 
                            System.out.println("\nPILIHAN TIDAK TEPAT. COBA LAGI\n");
                            
                    }while (plhn1==0||plhn1>=3);
                } while (plhn.equalsIgnoreCase( "t"));
            }
            else if(pilihan==2)
            {
                String yn2="y";
                do
                {
                    MenuBarangDiErafine(); 
                        int pilihanbrng = 0;
                        pilihanbrng = input.nextInt();
        
                        if(pilihanbrng==1)//tambah data barang masuk
                        {
                            Scanner inbarang = new Scanner(System.in);
                            String Barcode;
                            String Jenis;
                            String NamaItem;
                            int Stok;
                            int Harga; 

                            System.out.print("Barcode Barang \t: ");
                            Barcode=inbarang.nextLine();
                            System.out.print("Jenis Barang \t: ");
                            Jenis=inbarang.nextLine();
                            System.out.print("Nama Barang \t: ");
                            NamaItem=inbarang.nextLine();
                            System.out.print("Stok Barang \t: ");
                            Stok=input.nextInt();
                            System.out.print("Harga Barang \t: ");
                            Harga=input.nextInt();

                            barangs.add(new Barang(Barcode, Jenis, NamaItem, Stok, Harga));
                            System.out.println("Data Berhasil Ditambahkan");
                        }

                        else if(pilihanbrng==2)//tampilkan data barang yg ada
                        {
                            cetakDatayangada(barangs);
                        }    

                        else if (pilihanbrng==3)//cari data barang
                        {
                            Scanner inbarang = new Scanner(System.in);
                            String databarang;
                            System.out.print("Masukkan nama Barang : ");
                            databarang = inbarang.nextLine();
                            pencariandatabarang(barangs, databarang);
                        }
                        else if(pilihanbrng==4)//keluar
                        {
                            break;
                        }
                        else{
                            continue;
                        }
                        System.out.print("Apakah anda ingin kembali ke menu Utama? (y/n): ");
                        System.out.flush();
                    }
                    while(yn2.equalsIgnoreCase("y"));
                }
                else if(pilihan==3)
                {
                    CetakHistoriTransaksi(transaksi);
                }
                else if(pilihan==4)
                {
                    System.out.println("Terima Kasih!");
                    System.out.println("");
                    break;
                }
            } while (yn.equalsIgnoreCase("y"));
        
    }

    

   //MenuUtama Blm Login
   public static void menuBLMogin(ArrayList <Petugas> petugas)
   {
        Scanner input = new Scanner(System.in);
        String UName1;
        String Pass1;     
        Boolean Login1=false;
        do 
        {
            System.out.print("Masukkan User Name \t: ");
            UName1 = input.next();
            for (Petugas ptg : petugas) 
            {
                if (ptg.getUName().equals(UName1))
                {
                System.out.print("Masukkan Password \t: ");
                Pass1 = input.next();
                for (Petugas ptg2 : petugas) 
                {
                    if(ptg2.getPass().equals(Pass1))
                    {
                        Login1 = true;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                    else 
                    {
                        System.out.println("PASSWORD YANG DIMASUKKAN SALAH");
                    }
                }
                }
            } 
        } 
        while (Login1 == false);
    }
    public static void MenuUtama(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nSelamat Datang Kembali Petugas Erafine");
        System.out.println("=======================================");
        System.out.println("1. Transaksi");
        System.out.println("2. Barang");
        System.out.println("3. Cetak Detail Histori Transaksi");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void MenuBarangDiErafine()
    {
        System.out.println("Data Barang di Erafine");
        System.out.println("1. Tambah data barang yang masuk di Erafine");
        System.out.println("2. Tampilkan data barang yang ada");
        System.out.println("3. Pencarian data barang");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void cetakDatayangada(ArrayList <Barang> barangs)
    {
        System.out.println ("-------------------------------------------------------------");
        System.out.println("Daftar Barang");
        System.out.println ("-------------------------------------------------------------");
        for (Barang barang : barangs) 
        {
            System.out.println(barang);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void CetakHistoriTransaksi(ArrayList <Transaksi> transaksi)
    {
        System.out.println ("-------------------------------------------------------------");
        System.out.println("HIstori Transaksi");
        System.out.println ("-------------------------------------------------------------");
        for (Transaksi transaksis : transaksi) 
        {
            System.out.println(transaksis);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void pencariandatabarang (ArrayList <Barang> barangs, String databarang)
    {
        for (Barang barang : barangs) {
            if (barang.getNamaItem().equalsIgnoreCase(databarang))
            {
                System.out.println("Barang yang anda cari : \n" + "Jenis barang\t\t: \t" + barang.getJenis() + "\nNama Barang \t\t:\t" + barang.getNamaItem() + "\nStok Barang \t\t:\t" + barang.getStok() + "\nHarga Barang\t\t:\t" + barang.getHarga());
            }
        }
    }
    //public static void 
    /*public static void PenjualanDTL()
    {
        String IDPenjualan;
        String IDPetugas;
        String Tanggal;

        ArrayList <Penjualan> penjualans = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Pembelian \t:");
        Tanggal=input.nextLine();
        System.out.println("ID Pembelian \t:");
        IDPenjualan=input.nextLine();
        System.out.println("ID Petugas  \t:");
        IDPetugas=input.nextLine();
        penjualans.add(new Penjualan(IDPenjualan, Tanggal, IDPetugas));      
    }*/

    public static void menuBarang(ArrayList <Barang> barangs)
    {
        System.out.println ("------------------------------------------------");
        for (Barang barang : barangs) 
        {
            System.out.println(barang);
        }
    }

    
}
        


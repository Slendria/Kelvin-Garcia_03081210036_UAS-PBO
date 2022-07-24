public class Stok extends Transaksi{ //Sub Class
    String namaBrg;
    int kuantitas;
    String TGL;

    public Stok(){
    }

    public Stok(String namaBrg, int kuantitas, String TGL) {
        this.namaBrg = namaBrg;
        this.kuantitas = kuantitas;
        this.TGL = TGL;
    }

    public String getNamaBrg() {
        return this.namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getTGL() {
        return this.TGL;
    }

    public void setTGL(String TGL) {
        this.TGL = TGL;
    }

    @Override
    public String toString() {
        return "{" +
            " namaBrg='" + getNamaBrg() + "'" +
            ", kuantitas='" + getKuantitas() + "'" +
            ", TGL='" + getTGL() + "'" +
            "}";
    }

    //Overloading
    static void Tampilkan(String namaBrg, int Kuantitas, String TGL){
        System.out.println(namaBrg+" diterima pada tanggal "+TGL+" sebanyak "+Kuantitas+" buah");
    }
    public static void Overload(){
        Tampilkan("Iphone 13 Pro Max", 10,"12 Juli 2022");
    }
    
    //Selection Sort
    public static class SelectionSort {  
        public static void selectionSort(int[] arr){  
            for (int i = 0; i < arr.length - 1; i++)  
            {  
                int index = i;  
                for (int j = i + 1; j < arr.length; j++){  
                    if (arr[j] < arr[index]){  
                        index = j;//searching for lowest index  
                    }  
                }  
                int smallerNumber = arr[index];   
                arr[index] = arr[i];  
                arr[i] = smallerNumber;  
            }  
        }  
           
        public static void main(String a[]){  
            int[] arr1 = {10,3,5,3,10};
            System.out.println("Sebelum Selection Sort");  
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            selectionSort(arr1);//sorting array using selection sort  
             
            System.out.println("Setelah Selection Sort");  
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
        }  
    }  
    }
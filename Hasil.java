//inheritance tunggal
class Kalkulator {
   float z;
	
    public void Tambah(int x, int y) {
      z = x + y;
      System.out.println("Hasil Penambahan : "+z);
    }
	
    public void Kurang(int x, int y) {
      z = x - y;
      System.out.println("Hasil Pengurangan : "+z);
    }
   
    public void Kali(int x, int y) {
      z = x * y;
      System.out.println("Hasil Pengalian : "+z);
    }
   
    public void Bagi(int x, int y) {
      z =  y / x;
      System.out.println("Hasil Pembagian : "+z);
    }
}

class Hasil extends Kalkulator {
	
   public static void main(String args[]) {
      int a = 3, b = 63;
      Hasil hasil = new Hasil();
      hasil.Tambah(a, b);
      hasil.Kurang(a, b);
      hasil.Kali(a, b);
	  hasil.Bagi(a, b);
   }
}

/*
output:
Hasil Penambahan : 66.0
Hasil Pengurangan : -60.0
Hasil Pengalian : 189.0
Hasil Pembagian : 21.0

penjelasan:
pada program ini terdapat pewarisan tunggal yang mana satu induk atau satu super clas hanya menghasilkan
satu sub class saja. disini Kalkulator merupakan class induk dan hasil merupakan sub clasnya
*/
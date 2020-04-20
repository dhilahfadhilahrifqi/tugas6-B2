//Polymorpism

import java.*;
import java.io.*;

public class MainKalkulator
{
    /**Main method*/
    public static void main(String []args)
    {
        System.out.println("\tKALKULATOR");
		System.out.println("------------------------\n");
		
        //membuat objek-objek raut(ekspresi) dari wajah
        JenisKalkulator kal=new JenisKalkulator();
        Tambah tambah=new Tambah();
        Kurang kurang=new Kurang();
        Kali kali=new Kali();
        Bagi bagi=new Bagi();
	
        System.out.println(kal.Jenis());
		System.out.println(tambah.Jenis());
        System.out.println(kurang.Jenis());
        System.out.println(kali.Jenis());
        System.out.println(bagi.Jenis());
    }
}

class JenisKalkulator
{
    /*Membuat sebuah method respons pada class induk dimana mengembalikan 
     *sebuah nilai String*/
    public String Jenis()
    {
        return("Operator dalam Kalkulator\n");    
    }
}

/*Membuat class-class lain dengan turunan dari class Bentukwajah*/
class Tambah extends JenisKalkulator
{
    public String Jenis()
    {
        return("Tambah (+)\n");
    }
}
class Kurang extends JenisKalkulator
{
    public String Jenis()
    {
        return("Kurang (-)\n");
    }
}
class Kali extends JenisKalkulator
{
    public String Jenis()
    {
        return("Kali (*)\n");
    }
}    
class Bagi extends JenisKalkulator
{
    public String Jenis()
    {
        return("Bagi (/)\n");
    }
}   

/*
output:
        KALKULATOR
------------------------

Operator dalam Kalkulator

Tambah (+)

Kurang (-)

Kali (*)

Bagi (/)

penjelasan:
pada program di atas memiliki nama method yang sama dengan nama induknya yaitu jenis()
namun isinya berbeda dengan class induknya. output yang di tampilkasn akan sesuai dengan methode
yang di panggil dahulu di fungsi  main.sehingga method yang di class induk dahulu mancul kemudian method yang 
ada  di kelas anak. Dan disini terlihat pendefinisian polimorfisme yang mana bentuk method nya beda-beda (isinya
beda) tetapi namanya sama.
*/
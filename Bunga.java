//inheritance 

class Bunga {
	
	public static void main(String args[]){
		
		System.out.println("Bunga Mawar");
		Mawar mwr = new Mawar();
		mwr.tampil();
		System.out.println("Bunga Melati");
		Melati mlt = new Melati();
		mlt.tampil();
		
	}
}

class Mawar extends Bunga{	
	void tampil(){
		String nama="Mawar";
		String warna="Merah";
		System.out.println("Nama Bunga : "+nama);
		System.out.println("Warna Bunga : "+warna);
	}
}

class Melati extends Bunga{	
	void tampil(){
		String nama="Melati";
		String warna="Putih";
		System.out.println("Nama Bunga : "+nama);
		System.out.println("Warna Bunga : "+warna);
	}
}

/*
output:
Bunga Mawar
Nama Bunga : Mawar
Warna Bunga : Merah
Bunga Melati
Nama Bunga : Melati
Warna Bunga : Putih

penjelasan:
pada program di atas terdapat contoh sederhana dari inheritance yang mana class induk bunga mewarisi 
sifat ke sub classnya yaitu mawar dan melati. dan akan menampilkan nama dan juga warna dari kedua 
jenis bungan tersebut
*/


public class ModifierMain{
	
	public static void main(String[] args){
	
		ModifierDefault d = new ModifierDefault();
		System.out.println(d.nama);
                
                ModifierPublic pu = new ModifierPublic();
                System.out.println(pu.nama);
                
                ModifierProtected pr = new ModifierProtected();
                System.out.println(pr.nama);
                
                ModifierPrivate pri = new ModifierPrivate();
                pri.setName();
                System.out.println(pri.getName());
	}		
}
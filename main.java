public class main{
  public static void main(String args[]){
	balok b;
	b = new balok();
	b.setPanjang (10);
	b.setLebar (5);
	b.setTinggi (6);
	System.out.println("==========");
	System.out.println("data balok");
	System.out.println("==========");
	System.out.println("panjang : " + b.getPanjang());
	System.out.println("lebar : " + b.getLebar());
	System.out.println("tinggi : " + b.getTinggi());
	System.out.println("Volume : " + b.hitungVolume());
	
	balok b1 = new balok(20,10,5);
	System.out.println("==========");
	System.out.println("data balok");
	System.out.println("==========");
	System.out.println("panjang : " + b1.getPanjang());
	System.out.println("lebar : " + b1.getLebar());
	System.out.println("tinggi : " + b1.getTinggi());
	System.out.println("Volume : " + b1.hitungVolume());
	
	
  }
}
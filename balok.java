public class balok{
	private int panjang;
	private int lebar, tinggi;
	
	public balok(int p, int l, int t){
		this.panjang = p;
		this.lebar = l;
		this.tinggi = t;
	}
	public balok(){
		
	}

	public void setPanjang(int p){
		this.panjang = p;
	}

	public void setLebar(int l){
		this.lebar = l;
	}

	public void setTinggi(int t){
		this.tinggi = t;
	}

	public int getPanjang(){
		return this.panjang;
	}

	public int getLebar(){
		return this.lebar;
	}

	public int getTinggi(){
		return this.tinggi;
	}
	
	public int hitungVolume(){
		return panjang * lebar * tinggi;
	}
}
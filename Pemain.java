public class Pemain extends Sepakbola{
	
	public int noPung;

	public Pemain(String nama, int noPung){
		super(nama);		
		this.noPung = noPung;
	}

	public Pemain(String nama){
		super(nama);
	}

	public void showNopung(){
		System.out.println("Nomor Punggung :" + noPung);
	}

}
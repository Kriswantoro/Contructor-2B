public class Pemain extends Sepakbola{
	
	public int noPung;

	public Pemain(String nama, String club, int noPung){
		super(nama,club);		
		this.noPung = noPung;
	}

	public Pemain(String nama, String club){
		super(nama,club);
	}

	public void showNopung(){
		System.out.println("Nomor Punggung :" + noPung);
	}

}
package api.share.training.model;

public class Animale {
	
	private int nZampe;
	private String nome;
	
	public Animale(int nZampe, String nome) {
		super();
		this.nZampe = nZampe;
		this.nome = nome;
	}
	
	public int getnZampe() {
		return nZampe;
	}
	public void setnZampe(int nZampe) {
		this.nZampe = nZampe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

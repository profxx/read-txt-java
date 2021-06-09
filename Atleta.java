
public class Atleta {
	
	private String atleta = "";
	private int tempo = 0;
	
	public Atleta() {
		
	}

	public Atleta(String atleta, int tempo) {
		super();
		this.atleta = atleta;
		this.tempo = tempo;
	}

	public String getAtleta() {
		return atleta;
	}

	public void setAtleta(String atleta) {
		this.atleta = atleta;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "nome = " + atleta + ", tempo = " + tempo + " milisegundos]";
	}
	
	
}


public class Atleta {
	
	private String atleta = "";
	private int tempo = 0;
	private int medOuro = 0;
	private int medPrata = 0;
	private int medBronze = 0;
	private int totMedals = 0;
	
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
	
	public int getMedOuro() {
		return medOuro;
	}

	public void setMedOuro(int medOuro) {
		this.medOuro = medOuro+1;
	}

	public int getMedPrata() {
		return medPrata;
	}

	public void setMedPrata(int medPrata) {
		this.medPrata = medPrata+1;
	}

	public int getMedBronze() {
		return medBronze;
	}

	public void setMedBronze(int medBronze) {
		this.medBronze = medBronze+1;
	}

	public int getTotMedals() {
		return totMedals;
	}

	public void setTotMedals(int totMedals) {
		this.totMedals = totMedals;
	}

	@Override
	public String toString() {
		return "nome = " + atleta + ", tempo = " + tempo/1000 + " segundos.";
	}
	
	
}


public class Estatisticas{

	private String esporte;
	private String modalidade;
	private String ganhouOuro;
	private String paisOuro;
	private String tempoOuro;
	private String ganhouPrata;
	private String paisPrata;
	private String tempoPrata;
	private String ganhouBronze;
	private String paisBronze;
	private String tempoBronze;
	private String maisCampeao;
	
	public Estatisticas() {
		
	}

	public Estatisticas(String modalidade, String ganhouOuro, String paisOuro, String tempoOuro, String ganhouPrata,
			String paisPrata, String tempoPrata, String ganhouBronze, String paisBronze, String tempoBronze) {
		super();
		this.modalidade = modalidade;
		this.ganhouOuro = ganhouOuro;
		this.paisOuro = paisOuro;
		this.tempoOuro = tempoOuro;
		this.ganhouPrata = ganhouPrata;
		this.paisPrata = paisPrata;
		this.tempoPrata = tempoPrata;
		this.ganhouBronze = ganhouBronze;
		this.paisBronze = paisBronze;
		this.tempoBronze = tempoBronze;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getGanhouOuro() {
		return ganhouOuro;
	}

	public void setGanhouOuro(String ganhouOuro) {
		this.ganhouOuro = ganhouOuro;
	}

	public String getPaisOuro() {
		return paisOuro;
	}

	public void setPaisOuro(String paisOuro) {
		this.paisOuro = paisOuro;
	}

	public String getTempoOuro() {
		return tempoOuro;
	}

	public void setTempoOuro(String tempoOuro) {
		this.tempoOuro = tempoOuro;
	}

	public String getGanhouPrata() {
		return ganhouPrata;
	}

	public void setGanhouPrata(String ganhouPrata) {
		this.ganhouPrata = ganhouPrata;
	}

	public String getPaisPrata() {
		return paisPrata;
	}

	public void setPaisPrata(String paisPrata) {
		this.paisPrata = paisPrata;
	}

	public String getTempoPrata() {
		return tempoPrata;
	}

	public void setTempoPrata(String tempoPrata) {
		this.tempoPrata = tempoPrata;
	}

	public String getGanhouBronze() {
		return ganhouBronze;
	}

	public void setGanhouBronze(String ganhouBronze) {
		this.ganhouBronze = ganhouBronze;
	}

	public String getPaisBronze() {
		return paisBronze;
	}

	public void setPaisBronze(String paisBronze) {
		this.paisBronze = paisBronze;
	}

	public String getTempoBronze() {
		return tempoBronze;
	}

	public void setTempoBronze(String tempoBronze) {
		this.tempoBronze = tempoBronze;
	}

	public String getMaisCampeao() {
		return maisCampeao;
	}

	public void setMaisCampeao(String maisCampeao) {
		this.maisCampeao = maisCampeao;
	}

	@Override
	public String toString() {
		return "Modalidade = " + modalidade + "\nOuro = " + ganhouOuro + ", país = " + paisOuro
				+ ", tempo = " + tempoOuro + "\nPrata = " + ganhouPrata + ", país = " + paisPrata
				+ ", tempo = " + tempoPrata + "\nBronze = " + ganhouBronze + ", país = " + paisBronze
				+ ", tempo = " + tempoBronze + "]";
	}
	
	
	

	
}

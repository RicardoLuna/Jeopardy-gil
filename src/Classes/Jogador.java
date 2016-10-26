package Classes;

public class Jogador {
	
	private String nome;
	private int pontos;
	private int id_jogador;
	
	public Jogador(String nome,int id_jogador){
		this.nome = nome;
		this.pontos = 0;
		this.id_jogador = id_jogador;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getId_jogador() {
		return id_jogador;
	}

	public void setId_jogador(int id_jogador) {
		this.id_jogador = id_jogador;
	}
	
	public void aumentar_pontuacao(int pontos){
		this.pontos +=pontos;
	}

}

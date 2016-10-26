package Classes;

public class Pergunta {

	private String pre_resposta;
	private String dicas;
	private String resposta_correta;
	private int pontos;
	
	public Pergunta(String pre_resposta,String dicas,String resposta_correta,int pontos){
		this.pre_resposta = pre_resposta;
		this.dicas = dicas;
		this.resposta_correta = resposta_correta.toUpperCase();
		this.pontos = pontos;
		
	}
	
	public Pergunta(){
		
	}

	public String getPre_resposta() {
		return pre_resposta;
	}

	public void setPre_resposta(String pre_resposta) {
		this.pre_resposta = pre_resposta;
	}

	public String getDicas() {
		return dicas;
	}

	public void setDicas(String dicas) {
		this.dicas = dicas;
	}

	public String getResposta_correta() {
		return resposta_correta;
	}

	public void setResposta_correta(String resposta_correta) {
		this.resposta_correta = resposta_correta;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public boolean verificar_resposta(String resposta){
		boolean respostaCorreta = false;
		if(this.resposta_correta.equals(resposta.toUpperCase())){
			respostaCorreta = true;
		}
		
		return respostaCorreta;
		
	}
}

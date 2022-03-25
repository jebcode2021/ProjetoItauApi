package br.com.jonathanitau.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fluxo_caixa")

public class Conta {

	@Id
	
	@Column(name="ag") 
	private int ag; 
	
	@Column(name="conta") 
	private int conta; 
	
	@Column(name="fluxo") 
	private int fluxo; 
	
	@Column(name="entrada") 
	private String entrada; 
	
	@Column(name="saida")
	private String saida;

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	
	
	
}

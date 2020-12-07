package br.com.victorreis.funcional.model;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private BigDecimal preco;
	private Integer quantidade;
	
	public Produto(String nome, BigDecimal preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		return "Nome: "+ this.getNome()+"\n"+
				"Preço: "+ this.getPreco()+"\n"+
				"Quantidade: "+this.getQuantidade()+"\n";
	}
	

}

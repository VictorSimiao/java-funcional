package br.com.victorreis.funcional.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque {

	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	public List<Produto> listar(){
		return produtos;
	}
	
	public List<Produto> ordemAscNome(){
		return produtos.stream().sorted((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome())).collect(Collectors.toList());
	}
	
	
	public List<Produto> ordemDescNome(){
		return produtos.stream().sorted((p1, p2) -> - (p1.getNome().compareToIgnoreCase(p2.getNome()))).collect(Collectors.toList());
	}
}


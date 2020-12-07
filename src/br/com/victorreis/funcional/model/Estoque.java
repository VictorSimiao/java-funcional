package br.com.victorreis.funcional.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
}

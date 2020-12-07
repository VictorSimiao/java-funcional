package br.com.victorreis.funcional.aplicacao;

import java.math.BigDecimal;
import java.util.Scanner;

import br.com.victorreis.funcional.model.Estoque;
import br.com.victorreis.funcional.model.Produto;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean menu = true;
		int opcao;
		String nome;
		BigDecimal preco;
		int quantidade;

		Estoque estoque = new Estoque();

		do {
			System.out.println("----------Menu----------");
			System.out.println("1 - Cadastrar Produto:");
			System.out.println("2 - Listar todos Produtos");
			System.out.println("3 - Ordem crescente por nome");
			System.out.println("0 - Sair");
			System.out.println("------------------------\n");
			opcao = input.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe o preço: ");
				preco = input.nextBigDecimal();
				System.out.println("Informe a quantidade: ");
				quantidade = input.nextInt();

				Produto produto = new Produto(nome, preco, quantidade);
				estoque.adicionar(produto);
				break;
			}
			case 2: {
				estoque.listar().forEach(e -> System.out.println(e));
				break;
			}
			case 3: {
				estoque.ordemCrescenteNome().forEach(e -> System.out.println(e));
				break;
			}
			case 0: {
				menu = false;
			}
			default:
				throw new IllegalArgumentException("Opção inválida");
			}

		} while (menu);
		input.close();
	}
}

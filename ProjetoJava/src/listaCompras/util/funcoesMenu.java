package listaCompras.util;


import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import listaCompras.produto;

public class funcoesMenu {

	public static void mostrarMenu() {
		System.out.println("Programa de lista de compras\n");
		System.out.println("Selecione uma opção:\n");
		System.out.println("1 | Adicionar item à lista de compras");
		System.out.println("2 | Remover itens da lista de compras");
		System.out.println("3 | Atualizar itens da lista de compras");
		System.out.println("4 | Carregar lista de compras");
		System.out.println("\n" + "-".repeat(50));
	}

	public static produto cadastraProduto() {
		Scanner read = new Scanner(System.in);
			produto ProdutoTest = new produto(null, 0, null, null, 0, null);
			System.out.println("\nDigite o nome: ");
			String nome = read.nextLine();
			ProdutoTest.setNome(nome);

			System.out.println("\nDigite a categoria: ");
			String categoria = read.nextLine();
			ProdutoTest.setCategoria(categoria);

			System.out.println("\nDigite a quantidade: ");
			int quantidade = read.nextInt();
			read.nextLine();
			ProdutoTest.setQuantidade(quantidade);

			System.out.println("\nDigite a marca: ");
			String marca = read.nextLine();
			ProdutoTest.setMarca(marca);
			
			System.out.println("\nDigite o preço: ");
			double preco = read.nextDouble();
			read.nextLine();
			ProdutoTest.setPreco(preco);
			
			System.out.println("\nDigite o código: ");
			String codigo = read.nextLine();
			ProdutoTest.setCodBarras(codigo);
			return ProdutoTest;
	}
	
	public static void carregaLista(List<produto> listaItens) {
		for (int i = 0; i < listaItens.size(); i++) {
			System.out.println("\nItem: "+(i+1));
			 System.out.println(listaItens.get(i).toString()); 
			 System.out.println("\n" + "-".repeat(50));
		}
	}
	
	
	public static void excluiItem(List<produto> listaItens, Object nomeTest) {
		for (int i = 0; i < listaItens.size(); i++) {
			if(listaItens.get(i).getNome().equals(nomeTest)) {
				listaItens.remove(i);
				System.out.println("\nProduto removido com sucesso: ");
				return;
			}
		}
	}
	
	
}
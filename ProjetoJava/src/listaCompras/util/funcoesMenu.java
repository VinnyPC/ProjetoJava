package listaCompras.util;

import java.util.List;
import java.util.Scanner;

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

		System.out.println("\nDigite o código: \n\n");
		String codigo = read.nextLine();
		ProdutoTest.setCodBarras(codigo);
		return ProdutoTest;
	}

	public static void carregaLista(List<produto> listaItens) {
		for (int i = 0; i < listaItens.size(); i++) {
			System.out.println("\nItem: " + (i + 1));
			System.out.println(listaItens.get(i).toString());
			System.out.println("\n" + "-".repeat(50));
		}
	}

	

	public static void excluiItem(List<produto> listaItens , String nomeExcluir) {	
		for (int i = 0; i < listaItens.size(); i++) {
			if (listaItens.get(i).getNome().equals(nomeExcluir)) {
				listaItens.remove(i);
				System.out.println(listaItens);
				System.out.println("\nProduto removido com sucesso: ");
				
				return;
			}
		}
	}

	
	public static void atualizarItem(List<produto> listaItens ,String nome1) {
		Scanner read = new Scanner(System.in);
		
		for (int i = 0; i < listaItens.size();i++) {
			if (listaItens.get(i).getNome().equals(nome1) ) {
				listaItens.remove(i);
				System.out.println("\nInsira os dados do novo Produto : \n");
				System.out.println(cadastraProduto());
				return;
			}else {
				System.out.println("\nEste produto não existe!!!");
			}
			System.out.println("\nProdutos do estoque : \n");
			System.out.println(listaItens);
			break;
			}

		}
	public static int quantidadeDeItems(List<produto> listaItens) {
		int somaQuat = 0;
	for (int x = 0;x < listaItens.size();x++) {
		 int Quant = listaItens.get(x).getQuantidade(); 
			 somaQuat++;
	}
	return somaQuat;
	}
	
	public static double calculaItem(List<produto> listaItens){
		double somaPreco = 0;
		for (int i = 0; i < listaItens.size(); i++) {
			double precoItem = listaItens.get(i).getPreco();
			int Qtd = listaItens.get(i).getQuantidade();
			somaPreco += precoItem * Qtd ;
			}
		return somaPreco;
		}
}
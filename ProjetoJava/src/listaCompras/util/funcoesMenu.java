package listaCompras.util;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import listaCompras.util.Cores;
import listaCompras.produto;

public class funcoesMenu {

	public static void mostrarMenu() {

		System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND);
		System.out.println("╓══════════════════════════════════════════════════════════════════╖");
		System.out.println("║                                                                  ║");
		System.out.println("║                                                                  ║");
		System.out.println("║                   Programa de lista de compras                   ║");
		System.out.println("║                                                                  ║");
		System.out.println("║                                                                  ║");
		System.out.println("║                                                                  ║");
		System.out.println("║                                                                  ║");
		System.out.println("║Selecione uma opção:                                              ║");
		System.out.println("╟══════════════════╤═══════════════════════════════════════════════╢");
		System.out.println("║                  ║                                               ║");
		System.out.println("║                1 ║ Adicionar item à lista de compras             ║");
		System.out.println("║                  ║                                               ║");
		System.out.println("╟══════════════════╬═══════════════════════════════════════════════╢");
		System.out.println("║                  ║                                               ║");
		System.out.println("║                2 ║ Remover itens da lista de compras             ║");
		System.out.println("║                  ║                                               ║");
		System.out.println("╟══════════════════╬═══════════════════════════════════════════════╢");
		System.out.println("║                  ║                                               ║");
		System.out.println("║                3 ║ Atualizar itens da lista de compras           ║");
		System.out.println("║                  ║                                               ║");
		System.out.println("╟══════════════════╬═══════════════════════════════════════════════╢");
		System.out.println("║                  ║                                               ║");
		System.out.println("║                4 ║ Carregar lista de compras                     ║");
		System.out.println("║                  ║                                               ║");
		System.out.println("╙══════════════════╨═══════════════════════════════════════════════╜");
	}

	public static produto cadastraProduto() {
		Scanner read = new Scanner(System.in);
		System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND);

		produto ProdutoTest = new produto(null, 0, null, null, 0, null);
		System.out.println("╓═════════════════════════════════════════════════════════════════╖");
		System.out.println("║Digite o nome:                                                   ║");
		System.out.println("╙═════════════════════════════════════════════════════════════════╜");
		String nome = read.nextLine();
		ProdutoTest.setNome(nome);
		System.out.println("╓═════════════════════════════════════════════════════════════════╖");
		System.out.println("║Digite a categoria:                                              ║");
		System.out.println("╙═════════════════════════════════════════════════════════════════╜");
		String categoria = read.nextLine();
		ProdutoTest.setCategoria(categoria);
		System.out.println("╓═════════════════════════════════════════════════════════════════╖");
		System.out.println("║Digite a quantidade:                                             ║");
		System.out.println("╙═════════════════════════════════════════════════════════════════╜");
		int quantidade = read.nextInt();
		read.nextLine();
		ProdutoTest.setQuantidade(quantidade);
		System.out.println("╓═════════════════════════════════════════════════════════════════╖");
		System.out.println("║Digite a marca:                                                  ║");
		System.out.println("╙═════════════════════════════════════════════════════════════════╜");
		String marca = read.nextLine();
		ProdutoTest.setMarca(marca);

		System.out.println("╓═════════════════════════════════════════════════════════════════╖");
		System.out.println("║Digite o preço unitário:                                         ║");
		System.out.println("╙═════════════════════════════════════════════════════════════════╜");
		double preco = read.nextDouble();
		read.nextLine();
		ProdutoTest.setPreco(preco);
		System.out.println("╓══════════════════════════════════════════════╖");
		System.out.println("║Digite o código:                              ║");
		System.out.println("╙══════════════════════════════════════════════╜");
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

	public static boolean verificaLista(List<produto> listaItens) {
		if (listaItens.isEmpty() == true) {
			System.out.println(Cores.TEXT_RED_BOLD);
			System.out.println("╓══════════════════════════════════════════════╖");
			System.out.println("║A lista está vazia!                           ║");
			System.out.println("╙══════════════════════════════════════════════╜");
			System.out.println(Cores.TEXT_RESET);
			return true;
		} else {
			return false;
		}
	}

	public static void excluiItem(List<produto> listaItens, String nomeExcluir) {

		for (int i = 0; i < listaItens.size(); i++) {

			if (listaItens.get(i).getNome().equals(nomeExcluir)) {
				listaItens.remove(i);
				// System.out.println(listaItens);
				System.out.println("\nProduto removido com sucesso: ");
				return;
			}
		}
	}

	public static void atualizarItem(List<produto> listaItens, String nome1) {
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < listaItens.size(); i++) {
			if (listaItens.get(i).getNome().equals(nome1)) {
				listaItens.remove(i);
				System.out.println("Insira os dados do novo Produto:   ");
				produto atualizaProduto = cadastraProduto();
				listaItens.add(atualizaProduto);
				System.out.println("                                   ");
				System.out.println("Produto atualizado com sucesso!    ");
				System.out.println("                                   ");
				System.out.println("Produtos do estoque :              ");
				carregaLista(listaItens);
				return;
			} else {
				System.out.println(Cores.TEXT_RED_BOLD);
				System.out.println("╓══════════════════════════════════════════════╖");
				System.out.println("║Esse produto não existe!                      ║");
				System.out.println("╙══════════════════════════════════════════════╜");
				System.out.println(Cores.TEXT_RESET);
			}
			break;
		}

	}

	public static int quantidadeDeItems(List<produto> listaItens) {
		int somaQuat = 0;
		for (int x = 0; x < listaItens.size(); x++) {
			int Quant = listaItens.get(x).getQuantidade();
			somaQuat++;
		}
		return somaQuat;
	}

	public static double calculaItem(List<produto> listaItens) {
		double somaPreco = 0;
		for (int i = 0; i < listaItens.size(); i++) {
			double precoItem = listaItens.get(i).getPreco();
			int Qtd = listaItens.get(i).getQuantidade();
			somaPreco += precoItem * Qtd;
			
		}

		return (somaPreco);
	}
	public static String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);	
	}
}

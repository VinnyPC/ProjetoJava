package listaCompras;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import listaCompras.util.*;
import listaCompras.util.Cores;

public class menuPrincipal {

	public static void main(String[] args) {

		int opcao = 0;

		funcoesMenu menu = new funcoesMenu();
		Scanner read = new Scanner(System.in);

		List<produto> listaItens = new ArrayList<produto>();

		while (true) {

			while (true) {

				try {
					menu.mostrarMenu();
					opcao = read.nextInt();
					break;

				} catch (InputMismatchException inputMismatchException) {

					System.err.println(inputMismatchException);
					System.out.println("                                              ");
					System.out.println("Digite um numero valido:                    ");
					System.out.println("                                              ");
					read.nextLine();
				}
			}
			switch (opcao) {
			case 1:
				produto novoProduto = menu.cadastraProduto();
				listaItens.add(novoProduto);
				break;

			case 2:
				if (funcoesMenu.verificaLista(listaItens) == true) {
					break;

				} else {
					read.nextLine();
					System.out.println("                                              ");
					System.out.println("Digite o nome do item que deseja excluir:   ");
					System.out.println("                                              ");
					String nomeExcluir = read.nextLine();
					funcoesMenu.excluiItem(listaItens, nomeExcluir);
					break;
				}
			case 3:
				if (funcoesMenu.verificaLista(listaItens) == true) {
					break;

				} else {
				read.nextLine();
				System.out.println("                                                 ");
				System.out.println("Digite o nome do produto que deseja atualizar: ");
				System.out.println("                                                 ");
				String atualiza = read.nextLine();
				funcoesMenu.atualizarItem(listaItens, atualiza);
				break;
				}
			case 4:
				if (funcoesMenu.verificaLista(listaItens)) {
					return;

				} else {
					read.nextLine();
					funcoesMenu.carregaLista(listaItens);
					System.out.printf(
							"O Numero de itens do mesmo tipo na lista: " + funcoesMenu.quantidadeDeItems(listaItens));
					System.out.println("                                           ");
					System.out.println("Valor total da Lista: " + funcoesMenu.calculaItem(listaItens));
					break;
				}
			default:

				System.out.println(Cores.TEXT_RED_BOLD + "Digite um numero valido:" + Cores.TEXT_RESET);

			}

		}
	}
}

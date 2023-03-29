package listaCompras;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import listaCompras.util.*;

public class menuPrincipal {

	public static void main(String[] args) {

		int opcao = 0;

		funcoesMenu menu = new funcoesMenu();
		Scanner read = new Scanner(System.in);

		List<produto> listaItens = new ArrayList<produto>();
		while (true) {
					
			boolean continueLoop = true;
			do {

				try {
					menu.mostrarMenu();
					opcao = read.nextInt();
					break;
				} catch (InputMismatchException inputMismatchException) {

					System.err.println(inputMismatchException);
					System.out.println("\nDigite um numero valido:\n\n");
					read.nextLine();
				}
			} while (continueLoop == true);
			switch (opcao) {
			case 1:

				produto novoProduto = menu.cadastraProduto();
				listaItens.add(novoProduto);
				break;
			case 2:
				read.nextLine();
				System.out.println("\nDigite o nome do item que deseja excluir: ");
				String nomeExcluir = read.nextLine();
				funcoesMenu.excluiItem(listaItens, nomeExcluir);
				break;
			case 3:
				read.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar: ");
				String atualiza = read.nextLine();
				funcoesMenu.atualizarItem(listaItens, atualiza);
				break;
			case 4:
				read.nextLine();
				funcoesMenu.carregaLista(listaItens);
				System.out.printf("\nO Numero de items na lista : " + funcoesMenu.quantidadeDeItems(listaItens));
				System.out.println("\nValor total da Lista : " + funcoesMenu.calculaItem(listaItens));
				read.nextLine();
				break;

			default:
				System.out.println("\nDigite um numero valido:");
			}

		}

	}

}

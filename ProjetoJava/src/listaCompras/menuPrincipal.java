package listaCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listaCompras.util.*;

public class menuPrincipal {

	public static void main(String[] args) {

		int opcao;
		funcoesMenu menu = new funcoesMenu();
		Scanner read = new Scanner(System.in);
		
		List<produto> listaItens = new ArrayList<produto>();
		while (true) {
			menu.mostrarMenu();
			opcao = read.nextInt();

			switch (opcao) {
			case 1:
				produto novoProduto = menu.cadastraProduto();
				listaItens.add(novoProduto);
				break;
			case 2:
				System.out.println("\nDigite o nome do item que deseja excluir: ");
				String nomeExcluir = read.nextLine();
				funcoesMenu.excluiItem(listaItens, nomeExcluir);
				break;
			case 3:
				
				
			case 4:
				funcoesMenu.carregaLista(listaItens);
				break;
			}

		}

	}

}

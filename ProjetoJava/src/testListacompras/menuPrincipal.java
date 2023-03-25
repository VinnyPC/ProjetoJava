package testListacompras;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import testListacompras.util.*;

public class menuPrincipal {

	public static void main(String[] args) {

		int opcao;
		funcoesMenu menu = new funcoesMenu();
		produto produtoTest = new produto(null, 0, null, null, 0, null);
		Scanner read = new Scanner(System.in);
		int x;
		/* List<String> produtos = new ArrayList<>(); */
		List<produto> listaItens = new ArrayList<produto>();
		while (true) {
			menu.mostrarMenu();
			opcao = read.nextInt();

			switch (opcao) {
			case 1:
				produto novoProduto = menu.cadastraProduto();
				listaItens.add(novoProduto);
				/*
				 * for (int i = 0; i < listaItens.size(); i++) {
				 * System.out.println(listaItens.get(i).toString()); }
				 */
				break;
			case 5:
				for (int i = 0; i < listaItens.size(); i++) {
					 System.out.println(listaItens.get(i).toString()); }
				break;
			case 3:
				

			}

		}

	}

}

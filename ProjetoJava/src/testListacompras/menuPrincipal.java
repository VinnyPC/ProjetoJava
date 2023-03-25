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
		/*List<String> produtos = new ArrayList<>();*/
		List<produto> listaItens = new ArrayList<>();
		
		menu.mostrarMenu();
		opcao = read.nextInt();
		
		switch(opcao) {
		case 1:
			menu.cadastraProduto();	
			listaItens.add(produtoTest);
			produtoTest.visualizarProduto();
			break;
		case 2:
			
			break;
			
		
		}
		
		
		
		
	}
	


}

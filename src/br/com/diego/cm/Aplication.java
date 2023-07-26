package br.com.diego.cm;

import br.com.diego.cm.modelo.Tabuleiro;
import br.com.diego.cm.visao.TabuleiroConsole;

public class Aplication {
	
public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}	
}
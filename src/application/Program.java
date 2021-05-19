package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Position posicao = new Position(1, 2);
		Board tabuleiro = new Board(2, 3);
		
		System.out.println(posicao.toString());
		System.out.println(tabuleiro.getColumns() + tabuleiro.getRows());
		
		

	}

}

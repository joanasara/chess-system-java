package chess;

import boardgame.Board;
import chess.Pieces.King;
import chess.Pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSatup();

	}

	public ChessPiece[][] gePieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);

			}
		}
		return mat;
	}
   
	private void placeNewPice(char calumn, int row, ChessPiece piece) {
		board.placePiece(piece,new ChessPsition(calumn, row).toPosition());
	}
	
	
	
	
	private void initialSatup() {
		placeNewPice('c', 1, new Rook(board, Color.WHITE));
        placeNewPice('c', 2, new Rook(board, Color.WHITE));
        placeNewPice('d', 2, new Rook(board, Color.WHITE));
        placeNewPice('e', 2, new Rook(board, Color.WHITE));
        placeNewPice('e', 1, new Rook(board, Color.WHITE));
        placeNewPice('d', 1, new King(board, Color.WHITE));

        placeNewPice('c', 7, new Rook(board, Color.BLACK));
        placeNewPice('c', 8, new Rook(board, Color.BLACK));
        placeNewPice('d', 7, new Rook(board, Color.BLACK));
        placeNewPice('e', 7, new Rook(board, Color.BLACK));
        placeNewPice('e', 8, new Rook(board, Color.BLACK));
        placeNewPice('d', 8, new King(board, Color.BLACK));
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> board;
    private int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            this.board.add(new ArrayList<>());

            for (int j = 0; j < dimension; j++) {
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    void print() {
        for (List<Cell> cells : board) {
            for (Cell cell : cells) {
                if (cell.getCellState() == CellState.EMPTY) {
                    System.out.print("|  |");
                } else {
                    System.out.print("| " + cell.getPlayer().getSymbol().getaChar() + " |");
                }
            }
        }
    }


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }


}

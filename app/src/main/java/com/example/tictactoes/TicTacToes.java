package com.example.tictactoes;

public class TicTacToes {

    private static final int ROWS =3 ;
    private static final int COLS =3 ;
    private static int MOVE = 0 ;
    private int [][] gameBoard = new int[ROWS][COLS];

    private void setBoardValue(int x)
    {
        int value = -1;
        if(this.MOVE%2==0)
            value=1;
        this.gameBoard[x/3][x%3] = value;
    }
    public boolean playerMove(int x)
    {
        this.MOVE=this.MOVE++;
        if(x<9&&x>-1)
            setBoardValue(x);


        return false;
    }

}

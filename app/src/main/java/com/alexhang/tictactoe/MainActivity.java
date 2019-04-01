package com.alexhang.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView cell_11;
    private TextView cell_12;
    private TextView cell_13;


    private TextView cell_21;
    private TextView cell_22;
    private TextView cell_23;


    private TextView cell_31;
    private TextView cell_32;
    private TextView cell_33;


    private boolean isPlaying;

    private int[][] matrix= new int[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isPlaying=true;
        cell_11 = (TextView) findViewById(R.id.c11);
        cell_12 = (TextView) findViewById(R.id.c12);
        cell_13 = (TextView) findViewById(R.id.c13);

        cell_21 = (TextView) findViewById(R.id.c21);
        cell_22 = (TextView) findViewById(R.id.c22);
        cell_23 = (TextView) findViewById(R.id.c23);

        cell_31 = (TextView) findViewById(R.id.c31);
        cell_32 = (TextView) findViewById(R.id.c32);
        cell_33 = (TextView) findViewById(R.id.c33);


    }

    public void checkWin(){
        int counter=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(matrix[i][j]!=0)
                    counter++;
        if(counter>=8){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[0][0]==matrix[0][1] && matrix[0][1]==matrix[0][2]  && matrix[0][0]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[1][0]==matrix[1][1] && matrix[1][1]==matrix[1][2]  && matrix[1][0]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[2][0]==matrix[2][1] && matrix[2][1]==matrix[2][2]  && matrix[2][0]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[0][0]==matrix[1][0] && matrix[1][0]==matrix[2][0]  && matrix[0][0]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }


        if(matrix[0][1]==matrix[1][1] && matrix[1][1]==matrix[2][1]  && matrix[0][1]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[0][2]==matrix[1][2] && matrix[1][2]==matrix[2][2]  && matrix[0][2]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]  && matrix[0][0]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }

        if(matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0]  && matrix[0][2]!=0){
            isPlaying=false;
            Toast.makeText(getApplicationContext(), "Game Over",
                    Toast.LENGTH_LONG).show();
        }




    }

    public void computerMove(){
        if(isPlaying){
            int row = (int)(Math.random()*3);
            int col = (int)(Math.random()*3);
            Toast.makeText(getApplicationContext(), row+" "+col,
                    Toast.LENGTH_LONG).show();
            if(matrix[row][col]==0){
                matrix[row][col]=2;
                if(row==0) {
                    if (col == 0) cell_11.setText("0");
                    if (col == 1) cell_12.setText("0");
                    if (col == 2) cell_13.setText("0");
                }
                if(row==1) {
                    if (col == 0) cell_21.setText("0");
                    if (col == 1) cell_22.setText("0");
                    if (col == 2) cell_23.setText("0");
                }
                if(row==2) {
                    if (col == 0) cell_31.setText("0");
                    if (col == 1) cell_32.setText("0");
                    if (col == 2) cell_33.setText("0");
                }
            }
            else computerMove();
            checkWin();
        }

    }

    public void click11(View view) {
        if(matrix[0][0]==0) {
            cell_11.setText("X");
            matrix[0][0]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();
    }

    public void click12(View view) {
        if(matrix[0][1]==0) {
            cell_12.setText("X");
            matrix[0][1]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();
    }

    public void click13(View view) {
        if(matrix[0][2]==0) {
            cell_13.setText("X");
            matrix[0][2]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();
    }

    public void click21(View view) {
        if(matrix[1][0]==0) {
            cell_21.setText("X");
            matrix[1][0]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();

    }

    public void click22(View view) {
        if(matrix[1][1]==0) {
            cell_22.setText("X");
            matrix[1][1]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();

    }

    public void click23(View view) {
        if(matrix[1][2]==0) {
            cell_23.setText("X");
            matrix[1][2]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();

    }

    public void click31(View view) {
        if(matrix[2][0]==0) {
            cell_31.setText("X");
            matrix[2][0]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();

    }


    public void click32(View view) {
        if(matrix[2][1]==0) {
            cell_32.setText("X");
            matrix[2][1]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();

    }

    public void click33(View view) {
        if(matrix[2][2]==0) {
            cell_33.setText("X");
            matrix[2][2]=1;
        }else{
            Toast.makeText(getApplicationContext(), "AlreadyClicked",
                    Toast.LENGTH_LONG).show();
        }
        computerMove();
    }
}

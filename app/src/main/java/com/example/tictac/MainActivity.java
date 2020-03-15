package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9;

    int c=0;
    int zero=R.drawable.o;
    int one=R.drawable.x;
    int [] arr= {2,2,2,2,2,2,2,2,2};
    int win[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};


   /* void win() {
        int win[][]=new int[3][3];
        int k;
        for(int i=0;i<3;i++)
        {
        int j=0;
        int k=j;
        win[i][j]=0;
            if (win[i][j]==win[i][j+1] && win[i][j]==win[i][j+1] && win[i][j]==win[i][k]) {
                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show();
            }
            else if (win[j][i]==win[j+1][i] && win[j][i]==win[j+1][i] && win[j][i]==win[k][i]) {
                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        image1 =findViewById(R.id.image1);
        image2 =findViewById(R.id.image2);
        image3 =findViewById(R.id.image3);
        image4 =findViewById(R.id.image4);
        image5 =findViewById(R.id.image5);
        image6 =findViewById(R.id.image6);
        image7 =findViewById(R.id.image7);
        image8 =findViewById(R.id.image8);
        image9 =findViewById(R.id.image9);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[0]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image1.setImageResource(zero);
                        c = 1;
                    } else {
                        image1.setImageResource(one);
                        c = 0;
                    }

                    arr[0]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }


            }
        }
        );
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[1]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image2.setImageResource(zero);
                        c = 1;
                    } else {
                        image2.setImageResource(one);
                        c = 0;
                    }
                    arr[1]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[2]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image3.setImageResource(zero);
                        c = 1;
                    } else {
                        image3.setImageResource(one);
                        c = 0;
                    } arr[2]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(arr[3]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image4.setImageResource(zero);
                        c = 1;
                    } else {
                        image4.setImageResource(one);
                        c = 0;
                    } arr[3]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(arr[4]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image5.setImageResource(zero);
                        c = 1;
                    } else {
                        image5.setImageResource(one);
                        c = 0;
                    } arr[4]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[5]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image6.setImageResource(zero);
                        c = 1;
                    } else {
                        image6.setImageResource(one);
                        c = 0;
                    } arr[5]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[6]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image7.setImageResource(zero);
                        c = 1;
                    } else {
                        image7.setImageResource(one);
                        c = 0;
                    } arr[6]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[7]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image8.setImageResource(zero);
                        c = 1;
                    } else {
                        image8.setImageResource(one);
                        c = 0;
                    } arr[7]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr[8]==1)
                {
                    Toast.makeText(MainActivity.this, "Don't cheat", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (c == 0) {
                        image9.setImageResource(zero);
                        c = 1;
                    } else {
                        image9.setImageResource(one);
                        c = 0;
                    } arr[8]=1;
                }
                for(int []winpos:win){
                    if((arr[winpos[0]]==arr[winpos[1]] || arr[winpos[1]]==arr[winpos[2]]) && arr[winpos[0]]!=2)
                    { String abc;
                        if(arr[winpos[0]] == 0)
                        {abc="O has won";
                        }
                        else
                        {
                            abc="X has won";
                        }
                        TextView status=findViewById(R.id.status);
                        status.setText(abc);
                    }
                }
            }
        });




          }

}

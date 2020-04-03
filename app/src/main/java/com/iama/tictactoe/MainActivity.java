package com.iama.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    player p1;
    player p2;

    TextView winner;

    int count=0;
    boolean flags[] = {false,false,false,false,false,false,false,false,false};

    boolean flag=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView box0, box1, box2, box3, box4, box5, box6, box7, box8;
        Intent i1 = getIntent();
         String p1si = i1.getStringExtra("player1");
         String p2si = i1.getStringExtra("player2");

        final String p1s = p1si;
        final String p2s =p2si;





        
        winner = findViewById(R.id.winner);
        box0 = findViewById(R.id.box0);
        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        Button restart = findViewById(R.id.restart);

        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        box5 = findViewById(R.id.box5);
        box6 = findViewById(R.id.box6);
        box7 = findViewById(R.id.box7);
        box8 = findViewById(R.id.box8);
        ImageView box[] = {box0, box1, box2, box3, box4, box5, box6, box7, box8};
        winner.setText(p1s+" vs "+p2s);

        p1 = new player();
        p2 = new player();
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                winner.setText("");

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("player1",p1s);
                i.putExtra("player2",p2s);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });
    


        {flag=true; p1.turn = true;}
        box[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (p1.turn&&!flags[0]) {
                    box0.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[0] = true;
                    p1.turn = false;
                    count++;
                    flags[0]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }

                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                        Object o = new Object();
                    try {
                        o.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (p2.turn&&!flags[0]) {
                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[0] = true;
                    p2.turn = false;
                    count++;
                    flags[0]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        ////restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }

            }
        });
        box[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[1]) {
                    box1.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[1] = true;
                    p1.turn = false;
                    count++;
                    flags[1]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");

                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[1]) {
                    box1.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[1] = true;
                    p2.turn = false;
                    count++;
                    flags[1]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[2]) {
                    box2.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[2] = true;
                    p1.turn = false;
                    count++;
                    flags[2]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");

                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[2]) {
                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[2] = true;
                    p2.turn = false;
                    count++;
                    flags[2]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }

            }
        });
        box[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[3]) {
                    box3.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[3] = true;
                    p1.turn = false;
                    count++;
                    flags[3]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[3]) {
                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[3] = true;
                    p2.turn = false;
                    count++;
                    flags[3]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[4]) {
                    box4.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[4] = true;
                    p1.turn = false;
                    count++;
                        flags[4]=true;
                         if(count==9){
                        winner.setText("Draw");
                        }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[4]) {
                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[4] = true;
                    p2.turn = false;
                    count++;
                    flags[4]=true;
                     if(count==9){
                        winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[5]) {
                    box5.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[5] = true;
                    p1.turn = false;
                    count++;
                    flags[5]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[5]) {
                    box5.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[5] = true;
                    p2.turn = false;
                        count++;
                    flags[5]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                        if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[6]) {
                    box6.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[6] = true;
                    p1.turn = false;
                    count++;
                    flags[6]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                                        if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[6]) {
                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[6] = true;
                    p2.turn = false;
                    count++;
                    flags[6]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[7]) {
                    box7.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[7] = true;
                    p1.turn = false;
                    count++;
                    flags[7]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[7]) {
                    box7.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[7] = true;
                    p2.turn = false;
                    count++;
                    flags[7]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });
        box[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p1.turn&&!flags[8]) {
                    box8.setImageDrawable(getDrawable(R.drawable.player1));
                    p1.clicks[8] = true;
                    p1.turn = false;
                    count++;
                    flags[8]=true;
                     if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp1()) { flag=false;
                        winner.setText(p1s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p2.turn = true;}

                } else if (p2.turn&&!flags[8]) {
                    box8.setImageDrawable(getDrawable(R.drawable.player2));
                    p2.clicks[8] = true;
                    p2.turn = false;
                    count++;
                    flags[8]=true;
                    if(count==9){
                    winner.setText("Draw");
                    }
                    if (checkp2()) { flag=false;
                        winner.setText(p2s+" Won");
                        //restartgame();
                    } else
                        {flag=true; p1.turn = true;}

                }
            }
        });




    }

    public boolean checkp1() {
        if ((p1.clicks[0] && p1.clicks[4] && p1.clicks[8]) || (p1.clicks[0] && p1.clicks[1] && p1.clicks[2]) || (p1.clicks[3] && p1.clicks[4] && p1.clicks[5]) ||
                (p1.clicks[6] && p1.clicks[7] && p1.clicks[8]) || (p1.clicks[0] && p1.clicks[3] && p1.clicks[6]) || (p1.clicks[1] && p1.clicks[4] && p1.clicks[7])
                || (p1.clicks[2] && p1.clicks[5] && p1.clicks[8]) || (p1.clicks[2] && p1.clicks[4] && p1.clicks[6]))
            return true;
        else
            return false;
    }

    public boolean checkp2() {
        if ((p2.clicks[0] && p2.clicks[4] && p2.clicks[8]) || (p2.clicks[0] && p2.clicks[1] && p2.clicks[2]) || (p2.clicks[3] && p2.clicks[4] && p2.clicks[5]) ||
                (p2.clicks[6] && p2.clicks[7] && p2.clicks[8]) || (p2.clicks[0] && p2.clicks[3] && p2.clicks[6]) || (p2.clicks[1] && p2.clicks[4] && p2.clicks[7])
                || (p2.clicks[2] && p2.clicks[5] && p2.clicks[8]) || (p2.clicks[2] && p2.clicks[4] && p2.clicks[6]))
            return true;
        else return false;
    }

    public void restartgame() {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
    }

    public void onBackPressed()
    {
        startActivity(new Intent(getApplicationContext(),FirstActivity.class));
    }

}

package com.iama.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class single extends AppCompatActivity {

    boolean flags[][] = new boolean[3][3];


    player p;
    player c;
    pair p1,p2,p3,p4,p5,p6,p7,p8,p9;
    boolean flag = false;
    TextView winner;
    int count = 0, count1 = 0, count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        final ImageView box0, box1, box2, box3, box4, box5, box6, box7, box8;

        box0 = findViewById(R.id.box0);
        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        box5 = findViewById(R.id.box5);
        box6 = findViewById(R.id.box6);
        box7 = findViewById(R.id.box7);
        box8 = findViewById(R.id.box8);
        p = new player();
        c = new player();
        winner = findViewById(R.id.winner);

        final ImageView box[][] = new ImageView[3][3];

        box[0][0] = box0;
        box[0][1] = box1;
        box[0][2] = box2;
        box[1][0] = box3;
        box[1][1] = box4;
        box[1][2] = box5;
        box[2][0] = box6;
        box[2][1] = box7;
        box[2][2] = box8;

        flags[0][0] = false;
        flags[0][1] = false;
        flags[0][2] = false;
        flags[1][0] = false;
        flags[1][1] = false;
        flags[1][2] = false;
        flags[2][0] = false;
        flags[2][1] = false;
        flags[2][2] = false;


         p1 = new pair();
         p2 = new pair();
         p3 = new pair();
         p4 = new pair();
         p5 = new pair();
         p6 = new pair();
         p7 = new pair();
         p8 = new pair();
         p9 = new pair();



        box[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p.turn&&!flag)
                {
                    box[0][0].setImageDrawable(getDrawable(R.drawable.player1));
                    flags[0][0]=true;
                    p.clicks[0]=true;
                    p.twoclicks[0][0]=true;

                    p.px1.b1=true;

                    if(p.px1.checkPair()||p.px2.checkPair()||p.px3.checkPair()||
                            p.px4.checkPair()||p.px5.checkPair()||p.px6.checkPair()||p.px7.checkPair()||
                            p.px8.checkPair()||p.px9.checkPair())
                    {
                        winner.setText("YOU WON");
                        flag=true;
                    }
                    if(c.px1.checkPair()||c.px2.checkPair()||c.px3.checkPair()||
                            c.px4.checkPair()||c.px5.checkPair()||c.px6.checkPair()||c.px7.checkPair()||
                            c.px8.checkPair()||c.px9.checkPair())
                    {
                        winner.setText("YOU LOST");
                        flag=true;
                    }


                    if(c.px1.canMakePair()||c.px2.canMakePair()||c.px3.canMakePair()||
                            c.px4.canMakePair()||c.px5.canMakePair()||c.px6.canMakePair()||
                            c.px6.canMakePair()||c.px7.canMakePair()||c.px8.canMakePair())
                    {
                        int j;
                       for(int i=0;i<3;i++)
                       {
                           for(j=0;j<3;j++)
                           {
                               if(!p.twoclicks[i][j])
                               {
                                   box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                   c.twoclicks[i][j]=true;
                                   flags[i][j]=true;
                                   break;
                               }
                           }


                       }
                    }
                    else
                    {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;
                    }



                }
            }
        });











































       /* box[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;

                if (!flag && !flags[0][0]) {
                    box0.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[0][0] = true;
                    p.twoclicks[0][0] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            }  if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            }  if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {

                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            }  if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            }  if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });

        p.turn=true;
        box[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;

                if (!flag && !flags[0][1]&&p.turn) {
                    box1.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[0][1] = true;
                    p.twoclicks[0][1] = true;
                    p.turn=false;
                    c.turn=true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;

                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            }  if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            }  if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }

                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]&&c.turn) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                    p.turn=true;
                                    c.turn=false;
                                } else if (!flags[j][i]&&c.turn) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                    p.turn=true;
                                    c.turn=false;
                                } else if (!flags[j][j]&&c.turn) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                    p.turn=true;
                                    c.turn=false;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {

                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            }  if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            }  if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]&&c.turn) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                    p.turn=true;
                                    c.turn=false;
                                } else if (!flags[j][i]&&c.turn) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                    p.turn=true;
                                    c.turn=false;
                                    break;
                                } else if (!flags[j][j]&&c.turn) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                    p.turn=true;
                                    c.turn=false;
                                    break;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[0][2]) {
                    box2.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[0][2] = true;
                    p.twoclicks[0][2] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[1][0]) {
                    box3.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[1][0] = true;
                    p.twoclicks[1][0] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[1][1]) {
                    box4.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[1][1] = true;
                    p.twoclicks[1][1] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[1][2]) {
                    box5.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[1][2] = true;
                    p.twoclicks[1][2] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[2][0]) {
                    box6.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[2][0] = true;
                    p.twoclicks[2][0] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[2][1]) {
                    box7.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[2][1] = true;
                    p.twoclicks[2][1] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });
        box[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count1 = 0;
                count2 = 0;
                if (!flag && !flags[2][1]) {
                    box8.setImageDrawable(getDrawable(R.drawable.player1));
                    flags[2][2] = true;
                    p.twoclicks[2][2] = true;

                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (c.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (c.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (c.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    }
                    count = 0;
                    count1 = 0;
                    count2 = 0;
                    for (int i = 0; i < 3; i++) {
                        count = 0;
                        count1 = 0;
                        count2 = 0;
                        for (int j = 0; j < 3; j++) {
                            if (p.twoclicks[i][j]) {
                                count++;
                                if (count == 2)
                                    break;
                            } else if (p.twoclicks[j][i]) {
                                count1++;
                                if (count1 == 2)
                                    break;
                            } else if (p.twoclicks[j][j]) {
                                count2++;
                                if (count2 == 2)
                                    break;
                            }
                        }
                    }
                    winner.setText(count + "." + count1 + "." + count2);
                    if (count == 2 || count1 == 2 || count2 == 2) {
                        for (int i = 0; i < 3; i++) {
                            count = 0;
                            count1 = 0;
                            count2 = 0;
                            for (int j = 0; j < 3; j++) {
                                if (!flags[i][j]) {
                                    box[i][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[i][j] = true;
                                    c.twoclicks[i][j] = true;
                                } else if (!flags[j][i]) {
                                    box[j][i].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][i] = true;
                                    c.twoclicks[j][i] = true;
                                } else if (!flags[j][j]) {
                                    box[j][j].setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[j][j] = true;
                                    c.twoclicks[j][j] = true;
                                }
                            }
                        }
                    } else {
                        double y, z;

                        y = (Math.random() * 3);
                        z = (Math.random() * 3);

                        while (flags[(int) y][(int) z]) {
                            y = (Math.random() * 3);
                            z = (Math.random() * 3);
                        }
                        box[(int) y][(int) z].setImageDrawable(getDrawable(R.drawable.player2));
                        c.twoclicks[(int) y][(int) z] = true;
                        flags[(int) y][(int) z] = true;


                    }
                }
            }
        });*/




    }
}

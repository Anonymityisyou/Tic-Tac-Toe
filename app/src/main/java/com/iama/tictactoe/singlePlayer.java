package com.iama.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class singlePlayer extends AppCompatActivity {

    boolean flags[] = {false, false, false, false, false, false, false, false, false};

    player p;
    player c;
    boolean flag = false;
    TextView winner;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);


        p = new player();
        c = new player();


        winner = findViewById(R.id.winner);

        Button restart = findViewById(R.id.restart);

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
        ImageView box[] = {box0, box1, box2, box3, box4, box5, box6, box7, box8};


        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                winner.setText(" ");
                Intent i = new Intent(getApplicationContext(), singlePlayer.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });


        box[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[0] && !flag) {
                    box0.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[0] = true;

                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }
                    flags[0] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }


                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);

                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }

        });


        box[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[1] && !flag) {
                    box1.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[1] = true;

                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[1] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;
                                                                                    

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });

        box[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[2]) {
                    box2.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[2] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[2] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });

        box[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[3] && !flag) {
                    box3.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[3] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[3] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });

        box[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[4] && !flag) {
                    box4.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[4] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[4] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }

            }
        });

        box[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[5] && !flag) {
                    box5.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[5] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[5] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });

        box[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[6] && !flag) {
                    box6.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[6] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[6] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });

        box[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[7] && !flag) {
                    box7.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[7] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[7] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });
        box[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flags[8] && !flag) {
                    box8.setImageDrawable(getDrawable(R.drawable.player1));
                    p.clicks[8] = true;
                    if (checkp1()) {
                        flag = true;
                        winner.setText(R.string.win);
                    }
                    count++;
                    Toast.makeText(getApplicationContext(), String.valueOf(count), Toast.LENGTH_SHORT).show();
                    if (count == 9) {
                        winner.setText(R.string.draw);
                        flag = true;
                    }


                    flags[8] = true;


                    //computer pair checking

                    if ((c.clicks[0] && c.clicks[1]) && !flags[2]) {
                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[2] = true;
                        c.clicks[2] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[2] && c.clicks[1]) && !flags[0]) {
                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[0] = true;
                        c.clicks[0] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else if ((c.clicks[0] && c.clicks[2]) && !flags[1]) {
                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                        flags[1] = true;
                        c.clicks[1] = true;
                        if (checkp2()) {
                            winner.setText(R.string.lose);
                            flag = true;
                        }
                        count++;
                        if (count == 9) {
                            winner.setText(R.string.draw);
                            flag = true;
                        }

                    } else

                        //second row

                        if ((c.clicks[3] && c.clicks[4]) && !flags[5]) {
                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[5] = true;
                            c.clicks[5] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[3] && c.clicks[5]) && !flags[4]) {
                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[4] = true;
                            c.clicks[4] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else if ((c.clicks[4] && c.clicks[5]) && !flags[3]) {
                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                            flags[3] = true;
                            c.clicks[3] = true;
                            if (checkp2()) {
                                winner.setText(R.string.lose);
                                flag = true;
                            }
                            count++;
                            if (count == 9) {
                                winner.setText(R.string.draw);
                                flag = true;
                            }

                        } else

                            //third row

                            if ((c.clicks[6] && c.clicks[7]) && !flags[8]) {
                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[8] = true;
                                c.clicks[8] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[6] && c.clicks[8]) && !flags[7]) {
                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[7] = true;
                                c.clicks[7] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else if ((c.clicks[8] && c.clicks[7]) && !flags[6]) {
                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                flags[6] = true;
                                c.clicks[6] = true;
                                if (checkp2()) {
                                    winner.setText(R.string.lose);
                                    flag = true;
                                }
                                count++;
                                if (count == 9) {
                                    winner.setText(R.string.draw);
                                    flag = true;
                                }

                            } else


                                //first column

                                if ((c.clicks[0] && c.clicks[3]) && !flags[6]) {
                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[6] = true;
                                    c.clicks[6] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[0] && c.clicks[6]) && !flags[3]) {
                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[3] = true;
                                    c.clicks[3] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else if ((c.clicks[3] && c.clicks[6]) && !flags[0]) {
                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                    flags[0] = true;
                                    c.clicks[0] = true;
                                    if (checkp2()) {
                                        winner.setText(R.string.lose);
                                        flag = true;
                                    }
                                    count++;
                                    if (count == 9) {
                                        winner.setText(R.string.draw);
                                        flag = true;
                                    }

                                } else

                                    //second column

                                    if ((c.clicks[1] && c.clicks[4]) && !flags[7]) {
                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[7] = true;
                                        c.clicks[7] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[1] && c.clicks[7]) && !flags[4]) {
                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[4] = true;
                                        c.clicks[4] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else if ((c.clicks[4] && c.clicks[7]) && !flags[1]) {
                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                        flags[1] = true;
                                        c.clicks[1] = true;
                                        if (checkp2()) {
                                            winner.setText(R.string.lose);
                                            flag = true;
                                        }
                                        count++;
                                        if (count == 9) {
                                            winner.setText(R.string.draw);
                                            flag = true;
                                        }

                                    } else

                                        //third column

                                        if ((c.clicks[2] && c.clicks[5]) && !flags[8]) {
                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[8] = true;
                                            c.clicks[8] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[2] && c.clicks[8]) && !flags[5]) {
                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[5] = true;
                                            c.clicks[5] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else if ((c.clicks[5] && c.clicks[8]) && !flags[2]) {
                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                            flags[2] = true;
                                            c.clicks[2] = true;
                                            if (checkp2()) {
                                                winner.setText(R.string.lose);
                                                flag = true;
                                            }
                                            count++;
                                            if (count == 9) {
                                                winner.setText(R.string.draw);
                                                flag = true;
                                            }

                                        } else

                                            //ltr diagonal

                                            if ((c.clicks[0] && c.clicks[4]) && !flags[8]) {
                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[8] = true;
                                                c.clicks[8] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[4] && c.clicks[8]) && !flags[0]) {
                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[0] = true;
                                                c.clicks[0] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else if ((c.clicks[8] && c.clicks[0]) && !flags[4]) {
                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                flags[4] = true;
                                                c.clicks[4] = true;
                                                if (checkp2()) {
                                                    winner.setText(R.string.lose);
                                                    flag = true;
                                                }
                                                count++;
                                                if (count == 9) {
                                                    winner.setText(R.string.draw);
                                                    flag = true;
                                                }

                                            } else

                                                //rtl diagonal

                                                if ((c.clicks[4] && c.clicks[6]) && !flags[2]) {
                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[2] = true;
                                                    c.clicks[2] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[4]) && !flags[6]) {
                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[6] = true;
                                                    c.clicks[6] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else if ((c.clicks[2] && c.clicks[6]) && !flags[4]) {
                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                    flags[4] = true;
                                                    c.clicks[4] = true;
                                                    if (checkp2()) {
                                                        winner.setText(R.string.lose);
                                                        flag = true;
                                                    }
                                                    count++;
                                                    if (count == 9) {
                                                        winner.setText(R.string.draw);
                                                        flag = true;
                                                    }

                                                } else


                                                    //player pair checking
                                                    if ((p.clicks[0] && p.clicks[1]) && !flags[2]) {
                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[2] = true;
                                                        c.clicks[2] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[2] && p.clicks[1]) && !flags[0]) {
                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[0] = true;
                                                        c.clicks[0] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else if ((p.clicks[0] && p.clicks[2]) && !flags[1]) {
                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                        flags[1] = true;
                                                        c.clicks[1] = true;
                                                        if (checkp2()) {
                                                            winner.setText(R.string.lose);
                                                            flag = true;
                                                        }
                                                        count++;
                                                        if (count == 9) {
                                                            winner.setText(R.string.draw);
                                                            flag = true;
                                                        }

                                                    } else

                                                        //second row

                                                        if ((p.clicks[3] && p.clicks[4]) && !flags[5]) {
                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[5] = true;
                                                            c.clicks[5] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[3] && p.clicks[5]) && !flags[4]) {
                                                            box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[4] = true;
                                                            c.clicks[4] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else if ((p.clicks[4] && p.clicks[5]) && !flags[3]) {
                                                            box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                            flags[3] = true;
                                                            c.clicks[3] = true;
                                                            if (checkp2()) {
                                                                winner.setText(R.string.lose);
                                                                flag = true;
                                                            }
                                                            count++;
                                                            if (count == 9) {
                                                                winner.setText(R.string.draw);
                                                                flag = true;
                                                            }

                                                        } else

                                                            //third row

                                                            if ((p.clicks[6] && p.clicks[7]) && !flags[8]) {
                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[8] = true;
                                                                c.clicks[8] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[6] && p.clicks[8]) && !flags[7]) {
                                                                box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[7] = true;
                                                                c.clicks[7] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else if ((p.clicks[8] && p.clicks[7]) && !flags[6]) {
                                                                box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                flags[6] = true;
                                                                c.clicks[6] = true;
                                                                if (checkp2()) {
                                                                    winner.setText(R.string.lose);
                                                                    flag = true;
                                                                }
                                                                count++;
                                                                if (count == 9) {
                                                                    winner.setText(R.string.draw);
                                                                    flag = true;
                                                                }

                                                            } else


                                                                //first column

                                                                if ((p.clicks[0] && p.clicks[3]) && !flags[6]) {
                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[6] = true;
                                                                    c.clicks[6] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[0] && p.clicks[6]) && !flags[3]) {
                                                                    box3.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[3] = true;
                                                                    c.clicks[3] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else if ((p.clicks[3] && p.clicks[6]) && !flags[0]) {
                                                                    box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                    flags[0] = true;
                                                                    c.clicks[0] = true;
                                                                    if (checkp2()) {
                                                                        winner.setText(R.string.lose);
                                                                        flag = true;
                                                                    }
                                                                    count++;
                                                                    if (count == 9) {
                                                                        winner.setText(R.string.draw);
                                                                        flag = true;
                                                                    }

                                                                } else

                                                                    //second column

                                                                    if ((p.clicks[1] && p.clicks[4]) && !flags[7]) {
                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[7] = true;
                                                                        c.clicks[7] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[1] && p.clicks[7]) && !flags[4]) {
                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[4] = true;
                                                                        c.clicks[4] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else if ((p.clicks[4] && p.clicks[7]) && !flags[1]) {
                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));
                                                                        flags[1] = true;
                                                                        c.clicks[1] = true;
                                                                        if (checkp2()) {
                                                                            winner.setText(R.string.lose);
                                                                            flag = true;
                                                                        }
                                                                        count++;
                                                                        if (count == 9) {
                                                                            winner.setText(R.string.draw);
                                                                            flag = true;
                                                                        }

                                                                    } else

                                                                        //third column

                                                                        if ((p.clicks[2] && p.clicks[5]) && !flags[8]) {
                                                                            box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[8] = true;
                                                                            c.clicks[8] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[2] && p.clicks[8]) && !flags[5]) {
                                                                            box5.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[5] = true;
                                                                            c.clicks[5] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else if ((p.clicks[5] && p.clicks[8]) && !flags[2]) {
                                                                            box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                            flags[2] = true;
                                                                            c.clicks[2] = true;
                                                                            if (checkp2()) {
                                                                                winner.setText(R.string.lose);
                                                                                flag = true;
                                                                            }
                                                                            count++;
                                                                            if (count == 9) {
                                                                                winner.setText(R.string.draw);
                                                                                flag = true;
                                                                            }

                                                                        } else

                                                                            //ltr diagonal

                                                                            if ((p.clicks[0] && p.clicks[4]) && !flags[8]) {
                                                                                box8.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[8] = true;
                                                                                c.clicks[8] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[4] && p.clicks[8]) && !flags[0]) {
                                                                                box0.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[0] = true;
                                                                                c.clicks[0] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else if ((p.clicks[8] && p.clicks[0]) && !flags[4]) {
                                                                                box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                flags[4] = true;
                                                                                c.clicks[4] = true;
                                                                                if (checkp2()) {
                                                                                    winner.setText(R.string.lose);
                                                                                    flag = true;
                                                                                }
                                                                                count++;
                                                                                if (count == 9) {
                                                                                    winner.setText(R.string.draw);
                                                                                    flag = true;
                                                                                }

                                                                            } else

                                                                                //rtl diagonal

                                                                                if ((p.clicks[4] && p.clicks[6]) && !flags[2]) {
                                                                                    box2.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[2] = true;
                                                                                    c.clicks[2] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[4]) && !flags[6]) {
                                                                                    box6.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[6] = true;
                                                                                    c.clicks[6] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else if ((p.clicks[2] && p.clicks[6]) && !flags[4]) {
                                                                                    box4.setImageDrawable(getDrawable(R.drawable.player2));
                                                                                    flags[4] = true;
                                                                                    c.clicks[4] = true;
                                                                                    if (checkp2()) {
                                                                                        winner.setText(R.string.lose);
                                                                                        flag = true;
                                                                                    }
                                                                                    count++;
                                                                                    if (count == 9) {
                                                                                        winner.setText(R.string.draw);
                                                                                        flag = true;
                                                                                    }

                                                                                } else {
                                                                                    double x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    while (p.clicks[(int) x] || c.clicks[(int) x]) {
                                                                                        x = (Math.random() * ((9 - 0) + 1) + 0);
                                                                                    }
                                                                                    c.clicks[(int) x] = true;
                                                                                    count++;

                                                                                    if ((int) x == 0) {
                                                                                        box0.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 1) {
                                                                                        box1.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 2) {
                                                                                        box2.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 3) {
                                                                                        box3.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 4) {
                                                                                        box4.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 5) {
                                                                                        box5.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 6) {
                                                                                        box6.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 7) {
                                                                                        box7.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    } else if ((int) x == 8) {
                                                                                        box8.setImageDrawable(getDrawable(R.drawable.player2));

                                                                                    }

                                                                                }


                }


            }
        });
    }

    public boolean checkp1() {
        if ((p.clicks[0] && p.clicks[4] && p.clicks[8]) || (p.clicks[0] && p.clicks[1] && p.clicks[2]) || (p.clicks[3] && p.clicks[4] && p.clicks[5]) ||
                (p.clicks[6] && p.clicks[7] && p.clicks[8]) || (p.clicks[0] && p.clicks[3] && p.clicks[6]) || (p.clicks[1] && p.clicks[4] && p.clicks[7])
                || (p.clicks[2] && p.clicks[5] && p.clicks[8]) || (p.clicks[2] && p.clicks[4] && p.clicks[6]))
            return true;
        else
            return false;
    }

    public boolean checkp2() {
        if ((c.clicks[0] && c.clicks[4] && c.clicks[8]) || (c.clicks[0] && c.clicks[1] && c.clicks[2]) || (c.clicks[3] && c.clicks[4] && c.clicks[5]) ||
                (c.clicks[6] && c.clicks[7] && c.clicks[8]) || (c.clicks[0] && c.clicks[3] && c.clicks[6]) || (c.clicks[1] && c.clicks[4] && c.clicks[7])
                || (c.clicks[2] && c.clicks[5] && c.clicks[8]) || (c.clicks[2] && c.clicks[4] && c.clicks[6]))
            return true;
        else return false;
    }

    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), FirstActivity.class));
    }
}

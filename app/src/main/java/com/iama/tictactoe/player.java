package com.iama.tictactoe;

public class player {

    boolean turn = false;
    boolean clicks[] = {false, false, false, false, false, false, false, false, false};
    boolean twoclicks[][] = new boolean[3][3];

    pair px1,px2,px3,px4,px5,px6,px7,px8,px9;


    player() {
        twoclicks[0][0] = false;
        twoclicks[0][1] = false;
        twoclicks[0][2] = false;
        twoclicks[1][0] = false;
        twoclicks[1][1] = false;
        twoclicks[1][2] = false;
        twoclicks[2][0] = false;
        twoclicks[2][1] = false;
        twoclicks[2][2] = false;
    }

}

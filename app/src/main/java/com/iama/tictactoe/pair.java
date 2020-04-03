package com.iama.tictactoe;

public class pair
{

    boolean b1 =false;
    boolean b2 = false;
    boolean b3 = false;


    boolean checkPair()
    {
        if(b1&&b2&&b3)
        {
            return true;
        }
        else
            return false;
    }

    boolean canMakePair()
    {
        if((b1&&b2)||(b1&&b3)||(b2&&b3))
        {
            return true;
        }
        else return false;
    }



}

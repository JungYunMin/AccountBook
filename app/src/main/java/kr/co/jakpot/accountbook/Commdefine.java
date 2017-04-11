package kr.co.jakpot.accountbook;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jungyunmin on 2017-04-07.
 */

public class Commdefine {

    public static int GROUP_KEY = 0;


    public static void setShortToastMessage(String message, Context context){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}

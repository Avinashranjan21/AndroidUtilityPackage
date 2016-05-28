package com.avinash.androidutilitypackage;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by avinash on 29/5/16.
 */
public class AppUtilTool {
    public Context mContext;


    public AppUtilTool(Context mContext) {
        this.mContext=mContext;
    }

    public void showToastMessage(String message,Integer toastLength){
        Toast.makeText(mContext,message,toastLength).show();
    }


}

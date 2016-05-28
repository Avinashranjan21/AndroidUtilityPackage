package com.avinash.androidutilitypackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rb_toastShort,rb_toastLong;
    AppUtilTool mAppUtilTool;
    NetworkUtility mNetworkUtility;
    private Button btn_OnlineCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewOfXML();
        setButtonClickListener();
        mAppUtilTool = new AppUtilTool(this);
        mNetworkUtility= new NetworkUtility(this);
    }

    private void initViewOfXML(){
        rb_toastShort= (RadioButton) findViewById(R.id.rb_toastShort);
        rb_toastLong= (RadioButton) findViewById(R.id.rb_toastLong);
        btn_OnlineCheck= (Button) findViewById(R.id.btn_OnlineCheck);
    }

    private void setButtonClickListener(){
        btn_OnlineCheck.setOnClickListener(this);
    }

    private void showResultOnButtonClick(String Message){

        if (rb_toastShort.isSelected()){
            mAppUtilTool.showToastMessage(Message,Toast.LENGTH_SHORT);
        }else if (rb_toastLong.isSelected()){
            mAppUtilTool.showToastMessage(Message,Toast.LENGTH_LONG);
        }else {
            mAppUtilTool.showToastMessage(Message,Toast.LENGTH_SHORT);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_OnlineCheck:
                showResultOnButtonClick("Internet Availability :"+ String.valueOf(mNetworkUtility.isConnected(this)));
                break;
        }
    }
}

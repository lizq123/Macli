package com.example.lizq.farmninginformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="farmming infomation";
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn= (Button) findViewById(R.id.btn_farm);
        mBtn.setOnClickListener(new MyLinster());
//        try {
//            Thread.sleep(5000);
//            finish();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    private class MyLinster implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivityForResult(intent,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1){
            Log.e();
            finish();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}

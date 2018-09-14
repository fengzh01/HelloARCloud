package cn.gov.lottery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import cn.gov.lottery.R;

import cn.easyar.lottery.UnityPlayerActivity;

//import com.test.compn.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_hello_ar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello AR!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}

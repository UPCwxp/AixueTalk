package cn.edu.upc.wxp.mysecondandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    private TextView txt_channel;
    private TextView txt_message;
    private TextView txt_better;
    private TextView txt_setting;
    private MyFragment fg1,fg2,fg3,fg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

    txt_message = (TextView) findViewById(R.id.txt_message);
    txt_better = (TextView) findViewById(R.id.txt_better);
    txt_setting = (TextView) findViewById(R.id.txt_setting);
    txt_channel = (TextView) findViewById(R.id.txt_channel);
    FragmentManager fm = getSupportFragmentManager();
    final FragmentTransaction beginTransaction = fm.beginTransaction();

    txt_channel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fg1 = new MyFragment("第一个Fragment");
            beginTransaction.replace(R.id.ly_content, fg1);
            beginTransaction.commit();
        }
    });
    txt_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fg2 = new MyFragment("第一个Fragment");
                beginTransaction.replace(R.id.ly_content, fg2);
                beginTransaction.commit();
            }
    });
    txt_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fg3 = new MyFragment("第一个Fragment");
                beginTransaction.replace(R.id.ly_content, fg3);
                beginTransaction.commit();
            }
    });
    txt_better.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fg4 = new MyFragment("第一个Fragment");
                beginTransaction.replace(R.id.ly_content, fg4);
                beginTransaction.commit();
            }
    });
    }
}

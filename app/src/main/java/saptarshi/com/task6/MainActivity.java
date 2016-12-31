package saptarshi.com.task6;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction frag = getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.container, new FirstFragment());
        frag.commit();
     }


    public void replaceFragment (View v){
        FragmentTransaction frag = getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.container, new SecondFragment());
        frag.commit();
        Button but = (Button) findViewById(R.id.button_1);
        but.setVisibility(View.GONE);


    }
}
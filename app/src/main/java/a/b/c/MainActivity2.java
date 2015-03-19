package a.b.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends ActionBarActivity {
    Button myButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myButton2 = (Button) findViewById(R.id.button2);
        myMethod();
    }

    private void myMethod() {
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
    }

    private void myMethod1() {

    }

    private void myMethod2() {

    }

    private void myMethod3() {

    }
}

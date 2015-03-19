package a.b.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button);
        String support;
        myMethod();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    private void myMethod() {
        String s;
        myMethod2();
        String s2;
    }

    private void myMethod2() {
        myMethod3();
        String s;
    }

    private void myMethod3() {
        myMethod4();
        String s;
    }

    private void myMethod4() {
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getIntent2());
            }
        });
    }


    private Intent getIntent2() {
        return new Intent(MainActivity.this, MainActivity2.class);
    }
}

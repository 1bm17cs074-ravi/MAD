package com.example.myfirstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font=30;
    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            t.setTextSize(font);
         font = font + 5;
         if(font == 50)
             font = 30; } });

        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                } ch++;
                if(ch == 7)
                    ch = 1;
            }   });
//        TextView t= (TextView) findViewById(R.id.textView);
        Button b3= (Button) findViewById(R.id.button3); b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toggle Text
                if(t.getText()=="CSE")
                    t.setText("ISE");
                else t.setText("CSE");
                 }
                 });
            
    }
}

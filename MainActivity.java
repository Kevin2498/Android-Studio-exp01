package com.example.experimentone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    float font=20;
    int count=1;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView T1=(TextView) findViewById(R.id.text);
        T1.setTextSize(15);
        b1=(Button) findViewById(R.id.cf);
        b1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View view)
            {
                T1.setTextSize(font);
                font=font+5;
                if(font==50)
                {
                    font=20;
                }
            }
        });
        b2=(Button) findViewById(R.id.cc);
        b2.setOnClickListener(new OnClickListener()
                              {
                                  public void onClick(View view)
                                  {
                                      switch(count)
                                      {
                                          case 1:
                                              T1.setTextColor(Color.RED);
                                              break;
                                          case 2:
                                              T1.setTextColor(Color.BLUE);
                                              break;
                                          case 3:
                                              T1.setTextColor(Color.YELLOW);
                                              break;
                                          case 4:
                                              T1.setTextColor(Color.CYAN);
                                              break;
                                      }
                                      count++;
                                      if(count==5)
                                      {
                                          count=1;
                                      }
                                  }
                              }
        );
    }
}

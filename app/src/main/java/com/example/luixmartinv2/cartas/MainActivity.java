package com.example.luixmartinv2.cartas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int [][] posi = new int [3][3];

    public ImageButton ima1x1 = (ImageButton) findViewById(R.id.ima1x1);
    public ImageButton ima1x2 = (ImageButton) findViewById(R.id.ima1x2);
    public ImageButton ima1x3 = (ImageButton) findViewById(R.id.ima1x3);
    public ImageButton ima1x4 = (ImageButton) findViewById(R.id.ima1x4);

    public ImageButton ima2x1 = (ImageButton) findViewById(R.id.ima2x1);
    public ImageButton ima2x2 = (ImageButton) findViewById(R.id.ima2x2);
    public ImageButton ima2x3 = (ImageButton) findViewById(R.id.ima2x3);
    public ImageButton ima2x4 = (ImageButton) findViewById(R.id.ima2x4);

    public ImageButton ima3x1 = (ImageButton) findViewById(R.id.ima3x1);
    public ImageButton ima3x2 = (ImageButton) findViewById(R.id.ima3x2);
    public ImageButton ima3x3 = (ImageButton) findViewById(R.id.ima3x3);
    public ImageButton ima3x4 = (ImageButton) findViewById(R.id.ima3x4);

    public ImageButton ima4x1 = (ImageButton) findViewById(R.id.ima4x1);
    public ImageButton ima4x2 = (ImageButton) findViewById(R.id.ima4x2);
    public ImageButton ima4x3 = (ImageButton) findViewById(R.id.ima4x3);
    public ImageButton ima4x4 = (ImageButton) findViewById(R.id.ima4x4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        if(ima1x1.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima1x1.setImageResource(posi[0][0]);
        }
        if(ima1x2.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima1x2.setImageResource(posi[0][1]);
        }
        if(ima1x3.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima1x3.setImageResource(posi[0][2]);
        }
        if(ima1x4.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima1x4.setImageResource(posi[0][3]);
        }





        if(ima2x1.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima2x1.setImageResource(posi[1][0]);
        }
        if(ima2x2.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima2x2.setImageResource(posi[1][1]);
        }
        if(ima2x3.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima2x3.setImageResource(posi[1][2]);
        }
        if(ima2x4.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima2x4.setImageResource(posi[1][3]);
        }





        if(ima3x1.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima3x1.setImageResource(posi[2][0]);
        }
        if(ima3x2.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima3x2.setImageResource(posi[2][1]);
        }
        if(ima3x3.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima3x3.setImageResource(posi[2][2]);
        }
        if(ima3x4.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima3x4.setImageResource(posi[2][3]);
        }




        if(ima4x1.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima4x1.setImageResource(posi[3][0]);
        }
        if(ima4x2.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima4x2.setImageResource(posi[3][1]);
        }
        if(ima4x3.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima4x3.setImageResource(posi[3][2]);
        }
        if(ima4x4.callOnClick()){
            //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
            ima4x4.setImageResource(posi[3][3]);
        }

    }
}

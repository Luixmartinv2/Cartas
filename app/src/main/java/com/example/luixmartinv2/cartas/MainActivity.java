package com.example.luixmartinv2.cartas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int [][] posi = new int [3][3];
    public int [] px = new int [3];
    public int [] py = new int [3];

    public int a, b;

    public boolean pasx, pasy, pas;

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

    public void AsigP (){
        for (int i=0; i<=1; i++){
            int cont1 = 0, cont2 = 0;
            for (int j=0; j<=7; j++){
                while(pas){
                    while(pasx){
                        //a = Math.floor(Math.random()*4+1); (ambas opciones me dan error
                        //b = (Math.random() * 4) + 1;
                        for(int v=0;v<=px.length;v++){
                            if(a == px[v]){
                                pasx= false;
                            } else{
                                px[cont1]=a;
                                pasx =true;
                                cont1++;
                            }

                        }

                    }

                    while(pasy){
                        //a = Math.floor(Math.random()*4+1); (ambas opciones me dan error
                        //b = (Math.random() * 4) + 1;
                        for(int v=0;v<=py.length;v++){
                            if(b == py[v]){
                                pasy= false;
                            }else{
                                py[cont2]=b;
                                pasy =true;
                                cont2++;
                            }

                        }

                    }
                    if(posi[a][b]!=1){
                        posi[a][b]=1;
                        pas=true;
                    } else{
                        pas=false;
                    }
                }


            }
        }
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

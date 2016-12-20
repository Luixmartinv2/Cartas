package com.example.luixmartinv2.cartas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int [][] posi = new int [3][3];
    public int [][] posiID = new int [3][3];
    public int [] px = new int [3];
    public int [] py = new int [3];

    public int a, b, a2, b2,a3,b3;
    public int id=0;
    public int vol=0;

    public boolean pasx, pasy, pas;

    public ImageButton ima1x1 ;
    public ImageButton ima1x2 ;
    public ImageButton ima1x3 ;
    public ImageButton ima1x4 ;

    public ImageButton ima2x1 ;
    public ImageButton ima2x2 ;
    public ImageButton ima2x3 ;
    public ImageButton ima2x4 ;

    public ImageButton ima3x1 ;
    public ImageButton ima3x2 ;
    public ImageButton ima3x3 ;
    public ImageButton ima3x4 ;

    public ImageButton ima4x1 ;
    public ImageButton ima4x2 ;
    public ImageButton ima4x3 ;
    public ImageButton ima4x4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ima1x1 = (ImageButton) findViewById(R.id.ima1x1);
        ima1x2 = (ImageButton) findViewById(R.id.ima1x2);
        ima1x3 = (ImageButton) findViewById(R.id.ima1x3);
        ima1x4 = (ImageButton) findViewById(R.id.ima1x4);


        ima2x1 = (ImageButton) findViewById(R.id.ima2x1);
        ima2x2 = (ImageButton) findViewById(R.id.ima2x2);
        ima2x3 = (ImageButton) findViewById(R.id.ima2x3);
        ima2x4 = (ImageButton) findViewById(R.id.ima2x4);

        ima3x1 = (ImageButton) findViewById(R.id.ima3x1);
        ima3x2 = (ImageButton) findViewById(R.id.ima3x2);
        ima3x3 = (ImageButton) findViewById(R.id.ima3x3);
        ima3x4 = (ImageButton) findViewById(R.id.ima3x4);

        ima4x1 = (ImageButton) findViewById(R.id.ima4x1);
        ima4x2 = (ImageButton) findViewById(R.id.ima4x2);
        ima4x3 = (ImageButton) findViewById(R.id.ima4x3);
        ima4x4 = (ImageButton) findViewById(R.id.ima4x4);


        AsigPos();

        //onClick(R.layout.activity_main); (no funciona)

    }

    //asigna ids a las posiciones
    protected void AsigPos (){
        //son dos vuletas porque son dos veces 8 ids
        for (int i=0; i<=1; i++){
            int cont1 = 0, cont2 = 0;
            //asigna los 8 ids
            for (int j=0; j<=7; j++){
                while(pas){
                    //pilla una posición x al azar
                    while(pasx){
                        b = (int) (Math.floor(Math.random() * (4 - 1)) + 1);
                        b--;
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
                    //pilla una posición y al azar
                    while(pasy){
                        a = (int) (Math.floor(Math.random() * (4 - 1)) + 1);
                        a --;
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
                    //comprueba si la posición ya se le ha asignado un valor
                    if(posi[a][b]!=1){
                        posi[a][b]=1;
                        posiID[a][b]=id;
                        pas=true;
                    } else{
                        pas=false;
                    }
                }


            }
        }


        //

    }

    //Cambia la imagen por la del id asignado a su posicion
    public void IdMagen( int x, int y){


        if(x==0 && y==0){
            ima1x1.setImageResource(posiID[x][y]);
        } else if(x==0 && y==1){
            ima1x2.setImageResource(posiID[x][y]);
        }else if(x==0 && y==2){
            ima1x3.setImageResource(posiID[x][y]);
        }else if(x==0 && y==3){

            ima1x4.setImageResource(posiID[x][y]);
        }else if(x==1 && y==0){
            ima2x1.setImageResource(posiID[x][y]);
        }else if(x==1 && y==1){
            ima2x2.setImageResource(posiID[x][y]);
        }else if(x==1 && y==2){
            ima2x3.setImageResource(posiID[x][y]);
        }else if(x==1 && y==3){

            ima2x4.setImageResource(posiID[x][y]);
        }else if(x==2 && y==0){
            ima3x1.setImageResource(posiID[x][y]);
        }else if(x==2 && y==1){
            ima3x2.setImageResource(posiID[x][y]);
        }else if(x==2 && y==2){
            ima3x3.setImageResource(posiID[x][y]);
        }else if(x==2 && y==3){

            ima3x4.setImageResource(posiID[x][y]);
        }else if(x==3 && y==0){
            ima4x2.setImageResource(posiID[x][y]);
        }else if(x==3 && y==1){
            ima4x2.setImageResource(posiID[x][y]);
        }else if(x==3 && y==2){
            ima4x2.setImageResource(posiID[x][y]);
        }else if(x==3 && y==3){
            ima4x2.setImageResource(posiID[x][y]);
        }

        if(vol==0){
            a2=x;
            b2=y;
            vol++;
        }else if(vol==1){
            a3=x;
            b2=y;
            vol++;
        }else {
            a2=x;
            b2=y;
            vol=1;

        }

    }

    //voltea las cartas
    public void IdMagenVol( int x, int y){


        if(x==0 && y==0){
            ima1x1.setImageResource(R.mipmap.ic_launcher);
        } else if(x==0 && y==1){
            ima1x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==0 && y==2){
            ima1x3.setImageResource(R.mipmap.ic_launcher);
        }else if(x==0 && y==3){

            ima1x4.setImageResource(R.mipmap.ic_launcher);
        }else if(x==1 && y==0){
            ima2x1.setImageResource(R.mipmap.ic_launcher);
        }else if(x==1 && y==1){
            ima2x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==1 && y==2){
            ima2x3.setImageResource(R.mipmap.ic_launcher);
        }else if(x==1 && y==3){

            ima2x4.setImageResource(R.mipmap.ic_launcher);
        }else if(x==2 && y==0){
            ima3x1.setImageResource(R.mipmap.ic_launcher);
        }else if(x==2 && y==1){
            ima3x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==2 && y==2){
            ima3x3.setImageResource(R.mipmap.ic_launcher);
        }else if(x==2 && y==3){

            ima3x4.setImageResource(R.mipmap.ic_launcher);
        }else if(x==3 && y==0){
            ima4x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==3 && y==1){
            ima4x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==3 && y==2){
            ima4x2.setImageResource(R.mipmap.ic_launcher);
        }else if(x==3 && y==3){
            ima4x2.setImageResource(R.mipmap.ic_launcher);
        }


    }


}

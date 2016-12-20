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
                    //comprueva si la posición ya se le ha asignado un valor
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

    // llama al metodo IdMagen cada vez que clicas una imagen, y cuando clicas dos imagenes estas vuelven a su estado original
    protected void onClick(View view) {

        int cont=0;
        int x1=0, x2=0,y1=0,y2=0;
        if(cont<=2){
            if(ima1x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 0 );
                if(cont==0){
                    x1=0;
                    y1=0;
                    cont++;
                } else if(cont==1){
                    x2=0;
                    y2=0;
                    cont++;
                }

            }
            if(ima1x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 1);
                if(cont==0){
                    x1=0;
                    y1=1;
                    cont++;
                } else if(cont==1){
                    x2=0;
                    y2=1;
                    cont++;
                }
            }
            if(ima1x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 2 );
                if(cont==0){
                    x1=0;
                    y1=2;
                    cont++;
                } else if(cont==1){
                    x2=0;
                    y2=2;
                    cont++;
                }
            }
            if(ima1x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 3 );
                if(cont==0){
                    x1=0;
                    y1=3;
                    cont++;
                } else if(cont==1){
                    x2=0;
                    y2=3;
                    cont++;
                }
            }





            if(ima2x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 0 );
                if(cont==0){
                    x1=1;
                    y1=0;
                    cont++;
                } else if(cont==1){
                    x2=1;
                    y2=0;
                    cont++;
                }
            }
            if(ima2x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 1 );
                if(cont==0){
                    x1=1;
                    y1=1;
                    cont++;
                } else if(cont==1){
                    x2=1;
                    y2=1;
                    cont++;
                }
            }
            if(ima2x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 2 );
                if(cont==0){
                    x1=1;
                    y1=2;
                    cont++;
                } else if(cont==1){
                    x2=1;
                    y2=2;
                    cont++;
                }
            }
            if(ima2x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 3 );
                if(cont==0){
                    x1=1;
                    y1=3;
                    cont++;
                } else if(cont==1){
                    x2=1;
                    y2=3;
                    cont++;
                }
            }





            if(ima3x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,0 );
                if(cont==0){
                    x1=2;
                    y1=0;
                    cont++;
                } else if(cont==1){
                    x2=2;
                    y2=0;
                    cont++;
                }
            }
            if(ima3x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,1 );
                if(cont==0){
                    x1=2;
                    y1=1;
                    cont++;
                } else if(cont==1){
                    x2=2;
                    y2=1;
                    cont++;
                }
            }
            if(ima3x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,2 );
                if(cont==0){
                    x1=2;
                    y1=2;
                    cont++;
                } else if(cont==1){
                    x2=2;
                    y2=2;
                    cont++;
                }
            }
            if(ima3x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,3 );
                if(cont==0){
                    x1=2;
                    y1=3;
                    cont++;
                } else if(cont==1){
                    x2=2;
                    y2=3;
                    cont++;
                }
            }




            if(ima4x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,0 );
                if(cont==0){
                    x1=3;
                    y1=0;
                    cont++;
                } else if(cont==1){
                    x2=3;
                    y2=0;
                    cont++;
                }
            }
            if(ima4x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,1 );
                if(cont==0){
                    x1=3;
                    y1=1;
                    cont++;
                } else if(cont==1){
                    x2=3;
                    y2=1;
                    cont++;
                }
            }
            if(ima4x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,2 );
                if(cont==0){
                    x1=3;
                    y1=2;
                    cont++;
                } else if(cont==1){
                    x2=3;
                    y2=2;
                    cont++;
                }
            }
            if(ima4x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,3);
                if(cont==0){
                    x1=3;
                    y1=3;
                    cont++;
                } else if(cont==1){
                    x2=3;
                    y2=3;
                    cont++;
                }
            }

        }else {
            //si coinciden no se voltean de nuevo
            if(posiID[x1][y1]==posiID[x2][y2]){
                cont=0;
                x1=0;
                y1=0;
                x2=0;
                y2=0;
            } else{// si no coinciden se voltean

                IdMagenVol(a2,b2);
                IdMagenVol(a3,b3);
                cont=0;
                x1=0;
                y1=0;
                x2=0;
                y2=0;

            }

        }


    }
}

package com.example.luixmartinv2.cartas;

import android.view.View;

/**
 * Created by luixmartinv2 on 20/12/16.
 */


public class Controlador extends MainActivity implements View.OnClickListener  {
    // llama al metodo IdMagen cada vez que clicas una imagen, y cuando clicas dos imagenes estas vuelven a su estado original
    public void onClick(View view) {

        int cont=0;
        int [] x1= new int[1];
        int [] y1=new int[1];
        if(cont<=2){
            if(ima1x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 0 );
                if(cont==0){
                    x1[0]=0;
                    y1[0]=0;
                    cont++;
                } else if(cont==1){
                    x1[1]=0;
                    y1[1]=0;
                    cont++;
                }

            }
            if(ima1x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 1);
                if(cont==0){
                    x1[0]=0;
                    y1[0]=1;
                    cont++;
                } else if(cont==1){
                    x1[1]=0;
                    y1[1]=1;
                    cont++;
                }
            }
            if(ima1x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 2 );
                if(cont==0){
                    x1[0]=0;
                    y1[0]=2;
                    cont++;
                } else if(cont==1){
                    x1[1]=0;
                    y1[1]=2;
                    cont++;
                }
            }
            if(ima1x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 0, 3 );
                if(cont==0){
                    x1[0]=0;
                    y1[0]=3;
                    cont++;
                } else if(cont==1){
                    x1[1]=0;
                    y1[1]=3;
                    cont++;
                }
            }





            if(ima2x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 0 );
                if(cont==0){
                    x1[0]=1;
                    y1[0]=0;
                    cont++;
                } else if(cont==1){
                    x1[1]=1;
                    y1[1]=0;
                    cont++;
                }
            }
            if(ima2x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 1 );
                if(cont==0){
                    x1[0]=1;
                    y1[0]=1;
                    cont++;
                } else if(cont==1){
                    x1[1]=1;
                    y1[1]=1;
                    cont++;
                }
            }
            if(ima2x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 2 );
                if(cont==0){
                    x1[0]=1;
                    y1[0]=2;
                    cont++;
                } else if(cont==1){
                    x1[1]=1;
                    y1[1]=2;
                    cont++;
                }
            }
            if(ima2x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 1, 3 );
                if(cont==0){
                    x1[0]=1;
                    y1[0]=3;
                    cont++;
                } else if(cont==1){
                    x1[1]=1;
                    y1[1]=3;
                    cont++;
                }
            }





            if(ima3x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,0 );
                if(cont==0){
                    x1[0]=2;
                    y1[0]=0;
                    cont++;
                } else if(cont==1){
                    x1[1]=2;
                    y1[1]=0;
                    cont++;
                }
            }
            if(ima3x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,1 );
                if(cont==0){
                    x1[0]=2;
                    y1[0]=1;
                    cont++;
                } else if(cont==1){
                    x1[1]=2;
                    y1[1]=1;
                    cont++;
                }
            }
            if(ima3x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,2 );
                if(cont==0){
                    x1[0]=2;
                    y1[0]=2;
                    cont++;
                } else if(cont==1){
                    x1[1]=2;
                    y1[1]=2;
                    cont++;
                }
            }
            if(ima3x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 2,3 );
                if(cont==0){
                    x1[0]=2;
                    y1[0]=3;
                    cont++;
                } else if(cont==1){
                    x1[1]=2;
                    y1[1]=3;
                    cont++;
                }
            }




            if(ima4x1.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,0 );
                if(cont==0){
                    x1[0]=3;
                    y1[0]=0;
                    cont++;
                } else if(cont==1){
                    x1[1]=3;
                    y1[1]=0;
                    cont++;
                }
            }
            if(ima4x2.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,1 );
                if(cont==0){
                    x1[0]=3;
                    y1[0]=1;
                    cont++;
                } else if(cont==1){
                    x1[1]=3;
                    y1[1]=1;
                    cont++;
                }
            }
            if(ima4x3.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,2 );
                if(cont==0){
                    x1[0]=3;
                    y1[0]=2;
                    cont++;
                } else if(cont==1){
                    x1[1]=3;
                    y1[1]=2;
                    cont++;
                }
            }
            if(ima4x4.callOnClick()){
                //ima1x1.setImageResource(R.drawable.ima1); asi cambiamos la imagen
                IdMagen( 3,3);
                if(cont==0){
                    x1[0]=3;
                    y1[0]=3;
                    cont++;
                } else if(cont==1){
                    x1[1]=3;
                    y1[1]=3;
                    cont++;
                }
            }

        }else {
            //si coinciden no se voltean de nuevo
            if(posiID[x1[0]][y1[0]]==posiID[x1[1]][y1[1]]){
                cont=0;
                x1[0]=0;
                y1[0]=0;
                x1[1]=0;
                y1[1]=0;
            } else{// si no coinciden se voltean

                IdMagenVol(a2,b2);
                IdMagenVol(a3,b3);
                cont=0;
                x1[0]=0;
                y1[0]=0;
                x1[1]=0;
                y1[1]=0;

            }

        }


    }
}
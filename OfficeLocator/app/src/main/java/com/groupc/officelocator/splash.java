package com.groupc.officelocator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class splash extends AppCompatActivity {


    public Button pizzamenubut;
    public Button drinkmenubut;
    public Button ordermenubut;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        pizzamenubut = (Button)findViewById(R.id.backbutton);

        pizzamenubut.setOnClickListener(new View.OnClickListener(){

                                            public void onClick(View v){
                                                Intent theintent = new Intent(splash.this, campus.class);

                                                startActivity(theintent);
                                            }

                                        }

        );




        drinkmenubut = (Button)findViewById(R.id.addadrink);

        drinkmenubut.setOnClickListener(new View.OnClickListener(){

                                            public void onClick(View v){
                                                Intent theintent = new Intent(splash.this, floorplan.class);

                                                startActivity(theintent);
                                            }

                                        }

        );


        ordermenubut = (Button)findViewById(R.id.revieworder);

        ordermenubut.setOnClickListener(new View.OnClickListener(){

                                            public void onClick(View v){
                                                Intent theintent = new Intent(splash.this, directions.class);

                                                startActivity(theintent);
                                            }

                                        }

        );



    }



}

package com.groupc.officelocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.CheckBox;

public class campus extends AppCompatActivity {

    //public Button campusb2;

    //6/29/2017 Nhi - Adding Mia Hamm buttons
    public Button miaHamm;
    public Button mikeSchmidt;
    public Button danFouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        //6/29/2017 Nhi - Adding Mia Hamm buttons
        miaHamm = (Button)findViewById(R.id.mh1);
        miaHamm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                goToFloorPlan.putExtra("fpname", "Mia Hamm Floor Plan");
                goToFloorPlan.putExtra("imageName", "miahammfloorplan");
                startActivity(goToFloorPlan);
            }
        });

        mikeSchmidt = (Button)findViewById(R.id.ms1);
        mikeSchmidt.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View v){
                                           Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                                           goToFloorPlan.putExtra("fpname", "Mike Schmidt Floor Plan");
                                           goToFloorPlan.putExtra("imageName", "mikeschmidtfloorplan");
                                           startActivity(goToFloorPlan);
                                       }
                                   }
        );

        danFouts = (Button)findViewById(R.id.df1);
        danFouts.setOnClickListener(new View.OnClickListener(){
                                           public void onClick(View v){
                                               Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                                               goToFloorPlan.putExtra("fpname", "Dan Fouts Floor Plan");
                                               goToFloorPlan.putExtra("imageName", "danfoutsfloorplan");
                                               startActivity(goToFloorPlan);
                                           }
                                       }
        );
    }


        /*
        campusb2 = (Button)findViewById(R.id.campusbutton2);
        campusb2.setOnClickListener(new View.OnClickListener(){
                                            public void onClick(View v){
                                                Intent theintent = new Intent(campus.this, floorplan.class);
                                                startActivity(theintent);
                                            }
                                        }
        );
        */
}
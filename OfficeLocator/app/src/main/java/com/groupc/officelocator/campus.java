package com.groupc.officelocator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.CheckBox;

public class campus extends AppCompatActivity {

    //6/29/2017 Nhi - Adding buttons for the individual buildings
    public int numberBuildings = 3; //16;
    public Button miaHamm;
    public Button mikeSchmidt;
    public Button danFouts;
    public Button tigerWoods;
    public Button nolanRyan1;

    /*Button[] arrayButtons = {miaHamm, mikeSchmidt, danFouts};
    int[] buttonNames = {R.id.mh1, R.id.ms1, R.id.df1};
    String[] arrayFloorNames = {"Mia Hamm Floor Plan", "Mike Schmidt Floor Plan", "Dan Fouts Floor Plan"};
    String[] arrayFloorPlanImages = {"miahammfloorplan", "mikeschmidtfloorplan", "danfoutsfloorplan"};
    public int i;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        /*for (i = 0; i < numberBuildings; ++i) {
            arrayButtons[i] = (Button)findViewById(buttonNames[i]);
            arrayButtons[i].setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                    goToFloorPlan.putExtra("fpname", arrayFloorNames[i]);
                    //goToFloorPlan.putExtra("imageName", arrayFloorPlanImages[i]);
                    startActivity(goToFloorPlan);
                }
            });
        }
        */

        //Mia Hamm Building
        miaHamm = (Button)findViewById(R.id.mh1);
        miaHamm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                goToFloorPlan.putExtra("fpname", "Mia Hamm Floor Plan");
                goToFloorPlan.putExtra("imageName", "miahammfloorplan");
                startActivity(goToFloorPlan);
            }
        });

        //Mike Schmidt Building
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

        //Dan Fouts Building
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

        //Tiger Woods Building
        tigerWoods = (Button)findViewById(R.id.tw1);
        tigerWoods.setOnClickListener(new View.OnClickListener(){
                                        public void onClick(View v){
                                            Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                                            goToFloorPlan.putExtra("fpname", "Tiger Woods Floor Plan");
                                            goToFloorPlan.putExtra("imageName", "miahammfloorplan");
                                            startActivity(goToFloorPlan);
                                        }
                                    }
        );

        //Nolan Ryan Building
        nolanRyan1 = (Button)findViewById(R.id.nr1);
        nolanRyan1.setOnClickListener(new View.OnClickListener(){
                                          public void onClick(View v){
                                              Intent goToFloorPlan = new Intent(campus.this, floorplan.class);
                                              goToFloorPlan.putExtra("fpname", "Nolan Ryan Floor Plan");
                                              goToFloorPlan.putExtra("imageName", "danfoutsfloorplan");
                                              startActivity(goToFloorPlan);
                                          }
                                      }
        );
    }





}

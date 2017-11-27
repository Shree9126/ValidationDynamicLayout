package com.mindnotix.dynamiclayoutvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SurchargeAddModel> surchargeAddModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surchargeAddModels=new ArrayList<>();

    }

    private void createLayout() {


        boolean isValidationFailed = false;

        for (int i = 0; i < surchargeAddModels.size(); i++) {

            if (surchargeAddModels.get(i).getSelectedposition() != 0) {
                if (!surchargeAddModels.get(i).getEditTextValue().trim().isEmpty() &&
                        !surchargeAddModels.get(i).getEditTextValue().equals("0")) {
                    if (surchargeAddModels.get(i).getPaidbyselectedposition() != 3) {


                    } else {
                        Toast.makeText(MainActivity.this,"Select the PaidBy",Toast.LENGTH_SHORT);
                        isValidationFailed = true;
                        break;
                    }

                } else {
                    Toast.makeText(MainActivity.this,"Enter the amount",Toast.LENGTH_SHORT);

                    isValidationFailed = true;
                    break;
                }


            } else {
                Toast.makeText(MainActivity.this,"Select the surcharge",Toast.LENGTH_SHORT);

                isValidationFailed = true;
                break;
            }

        }

        if (!isValidationFailed) {

            SurchargeAddModel surchargeAddModel = new SurchargeAddModel();
            surchargeAddModels.add(surchargeAddModel);
          //  surchargeAdapter.notifyDataSetChanged();


        }


    }


}

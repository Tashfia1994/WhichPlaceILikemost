package com.tashfia.whichplaceilikemost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgplace;
    TextView txtplacename,txtdescription;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgplace=(ImageView)findViewById(R.id.img_place);
        txtplacename=(TextView) findViewById(R.id.txt_place_name);
        txtdescription=(TextView)findViewById(R.id.txt_description);

        String getPlaceNo=getIntent().getExtras().getString("place_no");

        if (getPlaceNo.equals("one"))
        {
            imgplace.setImageResource(R.drawable.coxs);
            txtplacename.setText(R.string.place_no1);
            txtdescription.setText(R.string.description1);
        }
else if (getPlaceNo.equals("two"))
        {
            imgplace.setImageResource(R.drawable.saint);
            txtplacename.setText(R.string.place_no2);
            txtdescription.setText(R.string.description2);
        }
else if (getPlaceNo.equals("three"))

        {
            imgplace.setImageResource(R.drawable.bandarban);
            txtplacename.setText(R.string.place_no3);
            txtdescription.setText(R.string.description3);
        }

else if (getPlaceNo.equals("four"))
        {
            imgplace.setImageResource(R.drawable.nafakhum);
            txtplacename.setText(R.string.place_no4);
            txtdescription.setText(R.string.description4);
        }
else if(getPlaceNo.equals("five"))
        {
            imgplace.setImageResource(R.drawable.kaptai);
            txtplacename.setText(R.string.place_no5);
            txtdescription.setText(R.string.description5);
        }

    }
}

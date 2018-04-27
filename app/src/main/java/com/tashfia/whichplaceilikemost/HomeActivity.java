package com.tashfia.whichplaceilikemost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn_cox,btn_saint,btn_nafakum,btn_bandarban,btn_kaptai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_cox=(Button)findViewById(R.id.btn_cox);
        btn_bandarban=(Button)findViewById(R.id.btn_bandarban);
        btn_kaptai=(Button)findViewById(R.id.btn_kaptai);
        btn_nafakum=(Button)findViewById(R.id.btn_nafakum);
        btn_saint=(Button)findViewById(R.id.btn_saint);

btn_cox.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(HomeActivity.this,DetailsActivity.class);
        intent.putExtra("place_no","one");
        startActivity(intent);
    }
});
btn_saint.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(HomeActivity.this,DetailsActivity.class);
        intent.putExtra("place_no","two");
        startActivity(intent);
    }
});
btn_nafakum.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(HomeActivity.this,DetailsActivity.class);
        intent.putExtra("place_no","three");
        startActivity(intent);
    }
});
btn_kaptai.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(HomeActivity.this,DetailsActivity.class);
        intent.putExtra("place_no","four");
        startActivity(intent);
    }
});

btn_bandarban.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(HomeActivity.this,DetailsActivity.class);
        intent.putExtra("place_no","five");
        startActivity(intent);
    }
});




    }
}

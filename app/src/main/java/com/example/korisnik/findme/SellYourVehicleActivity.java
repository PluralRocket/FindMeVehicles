package com.example.korisnik.findme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;

/**
 * Created by Korisnik on 4.10.2017..
 */

public class SellYourVehicleActivity extends AppCompatActivity {

    public TabHost host;
    public Button nextBtn;
    public static final String one = "One";
    public static final String two = "Two";
    public static final String three = "Three";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_vehicle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Cars");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Cars");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Bikes");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Bikes");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Vans");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Vans");
        host.addTab(spec);

        String[] items = new String[] {one, two, three};
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), SellYourVehicle2Activity.class);
                view.getContext().startActivity(Intent);}
        });

    }
}

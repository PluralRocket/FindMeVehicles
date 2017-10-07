package com.example.korisnik.findme;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import static android.R.attr.host;

/**
 * Created by Korisnik on 7.10.2017..
 */

public class ResultsActivity extends AppCompatActivity {

    public TabHost host;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Newest First");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Newest First");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Price (Lowest)");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Price (Lowest)");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Price (Highest)");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Price (Highest)");
        host.addTab(spec);
    }
}
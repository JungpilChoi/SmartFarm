package com.example.xaid.smartfarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xaid.smartfarm.Adapter.SensoresAdapter;
import com.example.xaid.smartfarm.Models.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SensoresAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)


        ArrayList<Sensor> myDataset = new ArrayList<Sensor>();

        Sensor s1 = new Sensor(1, 0, false, 0);
        myDataset.add(s1);
        mAdapter = new SensoresAdapter(this, myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}

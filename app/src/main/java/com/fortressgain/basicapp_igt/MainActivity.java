package com.fortressgain.basicapp_igt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.fortressgain.basicapp_igt.Models.GameData;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    final String TAG = this.getClass().getSimpleName();
    RecyclerView rvItem;
    CardView cvItem;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    //    private RecyclerView.LayoutManager mLayoutManager;
    protected LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rvItem = (RecyclerView) findViewById(R.id.rvItem);
        // cvItem = (CardView)findViewById(R.id.cvItem);
        rvItem.setHasFixedSize(true);

        manager = new LinearLayoutManager(this);
        rvItem.setLayoutManager(manager);

        // mAdapter = new MyAdapter(myDataset);
        // mRecyclerView.setAdapter(mAdapter);


        ArrayList<GameData> gameDatas = generatedDummy();

    }

    private ArrayList<GameData> generatedDummy() {
        ArrayList<GameData> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            GameData gameData = new GameData();
            gameData.response = "200";
            gameData.currency = "GBP";
//            gameData.data.set(i, "Game" + i);
            list.add(gameData);
        }

        Log.d(TAG + " response.toString", Arrays.toString(list.toArray()));

        return list;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

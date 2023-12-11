package com.example.favoritemoviesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int[] posters;
    String[] movieNames;
    String[] actorNames;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        prepareData();
        MoviesAdapter ma = new MoviesAdapter(this, posters, movieNames, actorNames);
        recyclerView.setAdapter(ma);
        // Arrange it in vertically scorallable lists
        /*recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));*/
        /*recyclerView.setLayoutManager(new GridLayoutManager(this,2));*/
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }

    private void prepareData() {
        posters = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
                R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};

        movieNames = new String[]{"Attarintiki daaredi", "Bazzigar", "Catch me if you can", "Daddy", "Eega",
                "Fast and Furious", "Ghazi", "Hara Hara Veeramallu", "Indra", "James"};

        actorNames = new String[]{"Pawan kalyan", "Sharukh khan", "Leonardo DiCaprio", "Chiranjeevi", "Nani",
                "Vin Diesel", "RANA", "Pawan Kalyan", "Chiranjeevi", "Puneeth Rajkumar"};
    }
}

// Steps Involved
// TODO 1: Prepare data
// TODO 2: add reyclerview to the project
// TODO 3: Design a Layoutfile for one item in the recyclerview
// TODO 4: Create an Adapter to populate data on the Recyclerview (Remember that you need to create a view holder inside the adapter)
// TODO 5: attach the adapter to the recyclerview
// TODO 6: Define the layout manager to properly arrange the items on the recyclerview.
package com.example.favoritemoviesrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    Context context;
    int[] images;
    String[] movies;
    String[] actors;

    public MoviesAdapter(Context context, int[] images, String[] movies, String[] actors) {
        this.context = context;
        this.images = images;
        this.movies = movies;
        this.actors = actors;
    }

    // this method's job is to attach the one_item_desgn to the recyclerview
    //it sends this information to moviesviewholder to get all the views in one_item_design
    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_item_design, parent, false);
        return new MoviesViewHolder(v);
    }

    //populate daa based on the position of the item
    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        holder.p.setImageResource(images[position]);
        holder.m.setText(movies[position]);
        holder.a.setText(actors[position]);
    }

    //imp total items in recyclerview
    @Override
    public int getItemCount() {
        return movies.length;
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {
        ImageView p;
        TextView m, a;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            p = itemView.findViewById(R.id.movie_poster_image);
            m = itemView.findViewById(R.id.movie_name_tv);
            a = itemView.findViewById(R.id.movie_actor_tv);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();
                    Toast.makeText(context,movies[pos], Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}

package com.example.ejercicio3101listiviewcrossfit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class AdaptadorCrossfit extends ArrayAdapter<Crossfit> {

    ArrayList<Crossfit> crossfits;
    Context c;

    public AdaptadorCrossfit(Context c, ArrayList<Crossfit> crossfits){
        super(c,R.layout.item_crossfit, crossfits);
        this.c = c;
        this.crossfits = crossfits;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_crossfit,null);

        //TextView Ejercicio
        TextView tvejercicio=(TextView)item.findViewById(R.id.tvejercicio);
        tvejercicio.setText(crossfits.get(position).getEjercicio());

        //TextView Pesom
        TextView tvpesom=(TextView)item.findViewById(R.id.tvpesom);
        tvpesom.setText(crossfits.get(position).getPesom());

        //TextView Peso
        TextView tvpeso=(TextView)item.findViewById(R.id.tvpeso);
        tvpeso.setText(crossfits.get(position).getPeso());

        //TextView Repeticiones
        TextView tvrepeticiones=(TextView)item.findViewById(R.id.tvrepeticiones);
        tvrepeticiones.setText(""+crossfits.get(position).getRepeticiones());

        //TextView Minutos
        TextView tvminutos=(TextView)item.findViewById(R.id.tvminutos);
        tvminutos.setText(""+crossfits.get(position).getMinutos());

        //TextView Segundos
        TextView tvsegundos=(TextView)item.findViewById(R.id.tvsegundos);
        tvsegundos.setText(""+crossfits.get(position).getSegundos());

        //ImageView
        String imagen = crossfits.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.ivimagen);

        iv_imagen.setImageResource(idImagen);

        return item;
    }
}
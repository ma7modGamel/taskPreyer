package com.baianat.prayerr.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.baianat.prayerr.R;
import com.baianat.prayerr.model.ResponseTimePrayer;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TimesAdapter  extends RecyclerView.Adapter<TimesAdapter.ViewHolder>{


    List<ResponseTimePrayer.Datetime> datetimeList=new ArrayList<>();
    public TimesAdapter(List<ResponseTimePrayer.Datetime> datetime) {
        datetimeList=datetime;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ResponseTimePrayer.Datetime datetime = datetimeList.get(position);


        String fagr = parseDateToApMp(datetime.getTimes().getFajr());

        Log.e("WW",fagr);
        holder.textViewName1.setText("Fajr");
        holder.textViewTime1.setText(fagr);
        String Dhuhr = parseDateToApMp(datetime.getTimes().getDhuhr());
        holder.textViewName2.setText("Duhr");
        holder.textViewTime2.setText(Dhuhr+" ");
        String Asr = parseDateToApMp(datetime.getTimes().getAsr());
        holder.textViewName3.setText("Asr");
        holder.textViewTime3.setText(Asr);
        String Maghrib = parseDateToApMp(datetime.getTimes().getMaghrib());
        holder.textViewName4.setText("Maghreb");
        holder.textViewTime4.setText(Maghrib);
        String Isha = parseDateToApMp(datetime.getTimes().getIsha());
        holder.textViewName5.setText("Esha");
        holder.textViewTime5.setText(Isha);


    }

    public String parseDateToApMp(String time) {
        String inputPattern = "HH:mm";
        String outputPattern = "h:mm a";
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern, Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern,Locale.ENGLISH);

        Date date = null;
        String str = null;

        try {
            date = inputFormat.parse(time);
            str = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public int getItemCount() {
        return datetimeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName1,textViewTime1,textViewName2
                ,textViewTime2,textViewName3,textViewTime3,textViewName4,textViewTime4,textViewName5,textViewTime5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName1=itemView.findViewById(R.id.txtName1);
            textViewTime1=itemView.findViewById(R.id.txtTime1);

            textViewName2=itemView.findViewById(R.id.txtName2);
            textViewTime2=itemView.findViewById(R.id.txtTime2);

            textViewName3=itemView.findViewById(R.id.txtName3);
            textViewTime3=itemView.findViewById(R.id.txtTime3);

            textViewName4=itemView.findViewById(R.id.txtName4);
            textViewTime4=itemView.findViewById(R.id.txtTime4);

            textViewName5=itemView.findViewById(R.id.txtName5);
            textViewTime5=itemView.findViewById(R.id.txtTime5);


        }
    }
}

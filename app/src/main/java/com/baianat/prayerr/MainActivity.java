package com.baianat.prayerr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.baianat.prayerr.Utils.GlobalPrefrencies;
import com.baianat.prayerr.Utils.Utils;
import com.baianat.prayerr.adapter.TimesAdapter;
import com.baianat.prayerr.databinding.ActivityMainBinding;
import com.baianat.prayerr.model.ResponseTimePrayer;
import com.google.gson.Gson;
import com.mikesu.horizontalexpcalendar.HorizontalExpCalendar;
import com.mikesu.horizontalexpcalendar.common.Config;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    GlobalPrefrencies globalPrefrencies;
    private static final String TAG = MainActivity.class.getName();

    ActivityMainBinding binding;
    MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        globalPrefrencies = new GlobalPrefrencies(this);
        Utils.setLocale(MainActivity.this, "ar");//globalPrefrencies.getLanguage());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        initComp();
        String date=getDate();
        setupApi(date);

    }

    private String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = new Date();
        return formatter.format(date);
    }

    private void setupApi(String date) {

        Log.e("datttte",date);
        mViewModel.OnGetTimes(date);
        mViewModel.datesMutableLiveData.observe(this, new Observer<ResponseTimePrayer>() {
            @Override
            public void onChanged(ResponseTimePrayer responseTimePrayer) {
//                Log.e("AA",new Gson().toJson(responseTimePrayer.getResults().getDatetime()));
                adapter=new TimesAdapter(responseTimePrayer.getResults().getDatetime());
                binding.rv.setAdapter(adapter);
            }
        });

    }

    DateTime dateTimeXX;
    TimesAdapter adapter;
    RecyclerView.LayoutManager manager;
    private void initComp() {
        manager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        binding.rv.setLayoutManager(manager);
        binding.calendar.setHorizontalExpCalListener(new HorizontalExpCalendar.HorizontalExpCalListener() {
            @Override
            public void onCalendarScroll(DateTime dateTime) {
                Log.e("888", dateTime.plus(1)+"");
            }
            @Override
            public void onDateSelected(DateTime dateTime) {
                dateTimeXX=dateTime;
                ClickItemCalinder(dateTime);
            }
            @Override
            public void onChangeViewPager(Config.ViewPagerType viewPagerType) {
                Log.e("666", new Gson().toJson(viewPagerType));
            }
        });


    }

    private void ClickItemCalinder(DateTime dateTime) {
        String timeAndDateString=dateTime.getYear() +"-"+dateTime.getMonthOfYear()+"-"+dateTime.getDayOfMonth();
        setupApi(timeAndDateString);
    }
}
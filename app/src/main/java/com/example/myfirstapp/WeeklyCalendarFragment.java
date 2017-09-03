package com.example.myfirstapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import junit.framework.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class WeeklyCalendarFragment extends Fragment {

    private NestedListView listView;
    private List<String> texts = new ArrayList<String>();
    private List<String> texts2 = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_calendar_weekly, container, false);

        //MY CODE

        Date d = new Date();
        EventObject test = new EventObject("test",d);

        //TextView textView = (TextView) v.findViewById(R.id.test);
        //textView.setText(test.toString());

        listView = (NestedListView) v.findViewById(R.id.listViewToday);

        // Instanciating an array list

        texts.add("foo");
        texts.add("bar");
        texts.addAll(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "eee", "hhh", "iii"));


        // This is the array adapter, it takes the context of the activity as a
            // first parameter, the type of list view as a second parameter and your
            // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                    v.getContext(),
                    android.R.layout.simple_list_item_1,
                    texts);

        listView.setAdapter(arrayAdapter);


        /////////DATES////////
        List <Date> datesList = new ArrayList<Date>();
        Calendar c = Calendar.getInstance();
        //SimpleDateFormat sdf = new SimpleDateFormat("MMM dd");
        //String dt = sdf.format(c.getTime());
        Date date = new Date();
        c.setTime(date);
        //String month = String.valueOf(c.get(Calendar.MONTH));
        datesList.add(date);
        for(int i=1; i<=6; i++){
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            date = c.getTime();
            datesList.add(date);
        }//for

        Integer [] dateIds = {R.id.today, R.id.day2, R.id.day3, R.id.day4, R.id.day5, R.id.day6, R.id.day7};
        TextView textView;
        for(int i =0; i<=6; i++){
            textView = (TextView) v.findViewById(dateIds[i]);
            textView.setTextSize(40);
            textView.setText(datesList.get(i).toString());
        }//for


        //////////LISTS//////////
        texts2.addAll(Arrays.asList("test","test", "test", "test4"));
        listView = (NestedListView) v.findViewById(R.id.listViewDay2);
        arrayAdapter = new ArrayAdapter<String>(
                v.getContext(),
                android.R.layout.simple_list_item_1,
                texts2);

        listView.setAdapter(arrayAdapter);


        //TextView textView = new TextView(v.getContext());
        //textView.setText("Hello. I'm a header view");
        //listView.addHeaderView(textView);


        return v;

    }






}//class

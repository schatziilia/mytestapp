package com.example.myfirstapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SearchFragment extends Fragment implements View.OnClickListener{
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    String message;
    EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(
                R.layout.fragment_search, container, false);

        String res = "test";

        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(res.toString());

        //message = "OMG BETTY";


        return v;

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button newBlockButton = (Button) getActivity().findViewById(
                R.id.buttonToTitle);
        newBlockButton.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), SearchTitleActivity.class);

        editText = (EditText) getActivity().findViewById(R.id.title_to_search);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }
}//class


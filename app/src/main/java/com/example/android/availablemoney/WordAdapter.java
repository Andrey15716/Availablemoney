package com.example.android.availablemoney;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private LayoutInflater inflater;
    private int layout;
    private List<Word> words;

    public WordAdapter(Context context, int resource, List<Word> states) {
        super(context, resource, states);
        this.words = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);


        TextView nameView = (TextView) view.findViewById(R.id.name);
        TextView surnameView = (TextView) view.findViewById(R.id.surname);

        Word state = words.get(position);


        nameView.setText(state.getName());
        surnameView.setText(state.getSurname());

        return view;
    }
}
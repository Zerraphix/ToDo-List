package com.example.to_dolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class TaskDataAdapter extends ArrayAdapter<String> {
    private ArrayList<String> tasks;

    public TaskDataAdapter(Context context, ArrayList<String> tasks) {
        super(context, 0, tasks);
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        // Get the task at the current position
        String task = getItem(position);

        // Set the task text to the TextView in the list item layout
        TextView textViewTask = convertView.findViewById(android.R.id.text1);
        textViewTask.setText(task);

        return convertView;
    }
}


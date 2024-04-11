package com.example.to_dolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TaskDataAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> tasks;

    public TaskDataAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.task_list_item, parent, false);
        }

        Task task = getItem(position);

        TextView textViewTitle = convertView.findViewById(R.id.text_view_title);
        TextView textViewDescription = convertView.findViewById(R.id.text_view_description);

        textViewTitle.setText(task.getTitle());
        textViewDescription.setText(task.getDescription());

        ImageView imageViewCompletedIndicator = convertView.findViewById(R.id.image_view_completed_indicator);
        if (task.isCompleted()) {
            imageViewCompletedIndicator.setVisibility(View.VISIBLE);
        } else {
            imageViewCompletedIndicator.setVisibility(View.GONE);
        }

        return convertView;
    }
}


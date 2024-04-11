package com.example.to_dolist;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Task> tasks;
    private TaskDataAdapter taskDataAdapter;
    private ListView todoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", "Description for Task 1", false));
        tasks.add(new Task(2, "Task 2", "Description for Task 2", true));

        todoListView = findViewById(R.id.todo_list_view);
        taskDataAdapter = new TaskDataAdapter(this, tasks);
        todoListView.setAdapter(taskDataAdapter);
    }
}
package com.ualr.simpletasklist;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.simpletasklist.databinding.ActivityMainBinding;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText mDescriptionET;
    private EditText mIsDoneET;
    private TextView mOutputTask;



    // TODO 05. Add a TaskList member to the MainActivity. Initialize the new member.

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ualr.simpletasklist.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.mDescriptionET = findViewById(R.id.description_edit_text);
        this.mIsDoneET = findViewById(R.id.isDone_edit_text);
        this.mOutputTask = findViewById(R.id.output_text_view);
        Button mAddBtn = findViewById(R.id.add_btn);
        Button mDeleteBtn = findViewById(R.id.delete_btn);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBtnClicked();
            }
        });

        mDeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDeleteBtnClicked();
            }
        });

        //TODO 06.02 Bind the onAddBtnClicked method to the add button, so the onAddBtnClicked is
        // triggered whenever the user clicks on that button

        //TODO 07.02 Bind the onDeleteBtnClicked method to the delete button, so that method is
        // triggered whenever the user clicks on that button

        //TODO 08.02 Bind the onDoneBtnClicked method to the done button, so the onDoneBtnClicked method is
        // triggered whenever the user clicks on that button
    }

    private void onAddBtnClicked() {
        String TaskDescription = this.mDescriptionET.getText().toString();
        String TaskIsDone = this.mIsDoneET.getText().toString();
    }

    private void onDeleteBtnClicked() {
        String TaskIsDone = this.mDescriptionET.getText().toString();
    }

    @Override
    public void markDone(String taskIsDone) {
        this.mOutputTask.setText(taskIsDone);
    }
    // TODO 06. Create a new functionality to add a new task using the description provided
    //  through the text field on the top of the screen by tapping the "+" on the right

    // TODO 06.01. Create a new method called onAddBtnClicked.

    // TODO 06.05. Invoke TaskList class' add method to ask the TaskList to
    //  add a new Task with the description provided through the text field.

    // TODO 06.06. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"


    // TODO 07. Create a new functionality to delete a task from the task list

    // TODO 07.01. Create a new method called onDeleteBtnClicked.

    // TODO 07.04. Invoke TaskList class' delete method to ask the TaskList to
    //  delete a Task given the id provided through the text field on the bottom.

    // TODO 07.05. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"


    // TODO 08. Create a new functionality to mark a task as done.

    // TODO 08.01. Create a new method called onDoneBtnClicked

    // TODO 08.04. Invoke TaskList class' markDone method to ask the TaskList to
    //  mark a Task given the id provided through the text field on the bottom.

    // TODO 08.05. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"

}
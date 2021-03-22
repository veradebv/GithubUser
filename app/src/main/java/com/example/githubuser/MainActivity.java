package com.example.githubuser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView lvUser;
    private ArrayList<User> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvUser = findViewById(R.id.lv_list);
        lvUser.setHasFixedSize(true);

        list.addAll(UserData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        lvUser.setLayoutManager(new LinearLayoutManager(this));
        UserList userList = new UserList(list);
        lvUser.setAdapter(userList);
    }
}
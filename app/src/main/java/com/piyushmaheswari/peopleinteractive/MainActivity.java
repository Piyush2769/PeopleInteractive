package com.piyushmaheswari.peopleinteractive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> userList;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userList=new ArrayList<>();
        userList.add(new User("Piyush Maheswari","21,","Male"));
        userList.add(new User("Diksha Maheswari","21,","Female"));
        userList.add(new User("Piy Maheswari","21,","Male"));
        userList.add(new User("yush Maheswari","21,","Male"));

        UserAdapter userAdapter=new UserAdapter(this,userList);
        recyclerView.setAdapter(userAdapter);
    }
}

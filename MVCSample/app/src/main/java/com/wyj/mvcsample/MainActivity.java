package com.wyj.mvcsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    INameListModel nameListModel;
    private ListView nameListLv;
    private NameListAdapter nameListAdapter;

    void initViews(){
        nameListLv=(ListView)findViewById(R.id.name_list);
    }

    void initVars(){
        nameListModel=new NameListModelImpl(this);
        nameListAdapter=new NameListAdapter(nameListModel.getNameList(),this);
        nameListLv.setAdapter(nameListAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initVars();

    }


}

package com.wyj.helloworld;

import android.content.Context;

import java.util.List;

/**
 * Created by 3020 on 2016/7/16.
 */
public class NameListPresenter {

    INameListModel nameListModel;
    INameListView nameListView;
    Context context;


    NameListPresenter(INameListView nameListView,Context context){
        this.nameListView=nameListView;
        this.context=context;
        nameListModel=new NameListModelImpl(context);
    }
    public void showNameList(){
         List<String> nameList=nameListModel.getNameList();
        nameListView.setNameList(nameList);
        nameListView.showNameList();
    }
}

package com.wyj.helloworld;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 3020 on 2016/7/16.
 */
public class NameListModelImpl implements INameListModel {

    Context context;

    NameListModelImpl(Context context){
        this.context=context;
    }
    @Override
    public List<String> getNameList() {
        String[] nameList=context.getResources().getStringArray(R.array.name_list);

        return Arrays.asList(nameList);
    }

    @Override
    public boolean UpdateNameList() {
        return false;
    }
}

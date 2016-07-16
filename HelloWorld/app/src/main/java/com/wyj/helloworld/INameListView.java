package com.wyj.helloworld;

import java.util.List;

/**
 * Created by 3020 on 2016/7/16.
 */
public interface INameListView {
    public void setNameList(List<String> nameList);
    public void showNameList();
    public boolean updateNameList();
}

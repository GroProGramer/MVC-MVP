package com.wyj.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 3020 on 2016/7/16.
 */
public class NameListAdapter extends BaseAdapter {
    List<String> nameList;
    Context  context;
    NameListAdapter(List<String> nameList,Context context){
          this.context=context;
        this.nameList=nameList;
    }
    @Override
    public int getCount() {
        if(nameList==null)  return 0;
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        if(nameList==null) return null;
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        View nameItem= LayoutInflater.from(context).inflate(R.layout.name_item,null);
        tv=(TextView) nameItem.findViewById(R.id.name_tv);
        tv.setText(nameList.get(position));
        return nameItem;
    }
}

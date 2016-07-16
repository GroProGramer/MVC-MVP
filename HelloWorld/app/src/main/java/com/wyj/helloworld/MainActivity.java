package com.wyj.helloworld;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements INameListView{

    /*OkHttpClient client=new OkHttpClient();
    Request request=new Request.Builder().url("https://www.baidu.com/").build();
    TextView tv;
    Handler handler=new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0x1:
                    tv.setText(msg.obj.toString());
                break;
            }
        }
    };*/
    private ListView nameListLv;
    private NameListAdapter nameListAdapter;

    void initViews(){
        nameListLv=(ListView)findViewById(R.id.name_list);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        NameListPresenter  presenter=new NameListPresenter(this,this);
        presenter.showNameList();

       // tv=(TextView) findViewById(R.id.tv);

       // Request request=new Request().newBuilder().url("www.baidu.com").build();
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {

                            Log.v("hello","exception="+e);
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {

                            Log.v("hello","response="+response);
                        }
                    });


            }
        }).start();*/
       /* new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    final Response response=client.newCall(request).execute();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv.setText(response.body().toString());
                        }
                    });
                }catch (IOException e){

                }
            }
        }).start();8/


        //Log.v("hello","url="+request.url());
       /* client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                Log.v("hello","exception="+e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Message msg=Message.obtain();
                msg.what=0x1;
                msg.obj=response.body().toString();
                handler.sendMessage(msg);
                Log.v("hello","response="+response);
            }
        });*/

    }


    @Override
    public void setNameList(List<String> nameList) {
        nameListAdapter=new NameListAdapter(nameList,this);
       nameListLv.setAdapter(nameListAdapter);
    }

    @Override
    public void showNameList() {
       nameListAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean updateNameList() {
        return false;
    }
}

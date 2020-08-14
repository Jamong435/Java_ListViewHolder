package com.mrhi2020.ex55listviewholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //대량의 데이터들
    ArrayList<String> items= new ArrayList<>();

    //대량의 데이터를 뷰객체로 만들어주는 아답터객체 참조변수
    MyAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //대량의 데이터 추가
        items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  );
        items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  ); items.add(  new String("aaa")  );
        items.add(  new String("bbb")  );
        items.add(  new String("ccc")  );

        //아답터객체 생성
        adapter= new MyAdapter(items, this);
        listView= findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });

    }
}

package com.mrhi2020.ex55listviewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    ArrayList<String> items;
    Context context;

    //생성자
    public MyAdapter(ArrayList<String> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //1. 재활용할 뷰가 없는가?
        if( convertView==null ){
            //없다면 만들어라.
            LayoutInflater inflater= LayoutInflater.from(context);
            convertView= inflater.inflate(R.layout.listview_item, parent, false);

            //참조변수를 멤버로 가지고 있는 객체(ViewHolder) 생성
            ViewHolder holder= new ViewHolder( convertView );
            convertView.setTag(holder);
        }

        //뷰에 저장되어 있는 tag객체(ViewHolder)를 얻어오기
        ViewHolder holder= (ViewHolder)convertView.getTag();


        //텍스트뷰에 넣을 현재번째(position) 데이터
        String s= items.get(position);
        holder.tv.setText(s);

        return convertView;
    }


    //이너 클래스
    class ViewHolder{
        TextView tv;

        //생성자
        public ViewHolder(View itemView){
            tv= itemView.findViewById(R.id.tv);



        }
    }

}

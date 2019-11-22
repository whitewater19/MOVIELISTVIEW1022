package com.example.movielistview1022;
//adapter是view和数据的桥梁。在一个ListView或者GridView中，你不可能手动给每一个格子都新建一个view，
// 所以这时候就需要Adapter的帮忙，它会帮你自动绘制view并且填充数据。

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//12因要把子介面放到主介面,需要橋梁(BaseAdapter), 類別延伸可以修改數量跟資料的方法(BaseAdapter,把固定同樣的4個方法拿過來用
public class adapterClass extends BaseAdapter {
                                //是一個抽象類別
//implement methods:Count(資料) Item(資料) ItemId(資料) View到82行
//13(20、21行)要宣告打氣筒跟資料(2個)類別
    private LayoutInflater myinflater;
    private ArrayList<viewClass>viewitem;//資料透過myinflater打進子介面

//14(24-25行)(每個類別都需要建構子)所以產生建構子(ArrayList修改資料的類別就好), 連接上個類別
    public adapterClass(Context c,ArrayList<viewClass> viewitem) {
        this.viewitem = viewitem;

//15(28-29行)連接上個類別並給個變數名稱
        myinflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
    }                //會紅因為型別不同,一個是object一個是LayoutInflater,所以要強制轉型別


    @Override
    public int getCount() {
                 //資料的總數
        return viewitem.size();
//16(35行)把0值換成(類別)資料的大小(總數)
    }

    @Override
    public Object getItem(int position) {
//17(41)把空值換成(類別)資料的位置(注意型別)(資料的某項目)取得資料的位置的值
        return viewitem.get(position);
    }

    @Override
    public long getItemId(int position) {
//18(48)索引取得項目的位置的值(項目編號)用取所引方式取得資料的資料位置(項目的編號)
        return viewitem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//19(53)要取得view,設定變數取得項目位置(要轉型別)
        viewClass onemovie = (viewClass)getItem(position);//得到一筆資料(圖名稱上映日期大綱)

//20動作轉換後的view指定變數,做打氣動作(子介面)(記得設值)
        convertView = myinflater.inflate(R.layout.itemview,null);
      //52行第2參數              用inflater把子畫面吹進來      52第3參數給null

//下面對應元件都是對應這個layout的元件
//21宣告子畫面中的物件與對應id,(62-65)老師提醒跟Alert客製那個很像(設圖、資料載入等變數, 並指定為轉換後子介面的圖片元件)
        ImageView imgp = convertView.findViewById(R.id.imgP);
        TextView txtname = convertView.findViewById(R.id.textName);
        TextView txtdate = convertView.findViewById(R.id.textDate);
        TextView txtinfo = convertView.findViewById(R.id.textInfo);

//設定物件的資料來源, 總之子介面跟容器要做結合,容器要對應資料
//22(69-72)(剛設定的變數, 用方法令跟畫面類別的變數對應)
        imgp.setImageResource(onemovie.pic);//設定圖片
        txtname.setText(onemovie.name);
        txtdate.setText(onemovie.date);
        txtinfo.setText(onemovie.info);
//(52-75)總之是adapter跟資料結合(view)
//23記得return改值,回MainActivity
        return convertView;//將設定好的view回傳給使用中的Activity
    }

}

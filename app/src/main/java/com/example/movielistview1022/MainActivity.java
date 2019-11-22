package com.example.movielistview1022;
//1複製ch10小圖*6到mipmap或drawable
//2到主介面刪TextView,設一ListView定位並給ID
//3到layout增view(子介面)(NewLayout resource file)(把子介面放到主介面裡)
//4畫子介面
//5string設定電影名稱 上映日期 劇情大綱
//6拉標籤,TextView給ID
//7new一個叫class(view)

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//準備要把東西塞到主介面了
//24宣告主介面元件, 及分別兩個類別及變數(兩類別要有值)
    public ListView listview;
    public ArrayList<viewClass>viewclass = null;
    public adapterClass adapterclass = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//25主介面元件指定
        listview = findViewById(R.id.listView);
//26陣列資料設為新的陣列物件
        viewclass = new ArrayList<viewClass>();
//27開始加資料
        viewclass.add(new viewClass(R.mipmap.superman,"超人特攻隊2","2016-07-25","《超人特攻隊2》故事設定在第一集結束後，民眾們對超級英雄的想法改觀，一連串的事件讓本來在家當家庭主婦的超能太太反而成為超級英雄代言人，四處奔走。超能先生則是在家當超級奶爸，雖然心有不甘，卻意外發現小兒子小杰超驚人的超能力，這次他們又會碰到甚麼挑戰呢?"));
        viewclass.add(new viewClass(R.mipmap.bookshop,"街角的書店","2018/6/29","芙洛倫絲因為先生去世，決定為自己實現長久以來的夢想：開一間書店。最後來到英國濱海的寧靜小鎮哈博洛，展開她追逐夢想的新生活。芙洛倫絲買下了一間荒廢許久的破舊老屋，經營起鎮上唯一的書店。"));
        viewclass.add(new viewClass(R.mipmap.summer,"夏日1993","2018/6/29","★ 代表西班牙角逐2018奧斯卡最佳外語片西班牙「高第獎」最佳加泰隆尼亞語影片、最佳導演、最佳劇本、最佳女配角、最佳剪輯 五項大獎                ★ 2018 西班牙奧斯卡「哥雅獎」最佳新晉導演、最佳男配角、最佳新晉女演員"));
        viewclass.add(new viewClass(R.mipmap.champion,"冠軍大叔","2018/6/29","在美國洛杉磯夜店工作的馬克（馬東石飾），一直夢想在腕力比賽中成為世界冠軍，被自認是他經紀人的晉基（權律飾）說服，回到韓國參加全國腕力大賽。"));
        viewclass.add(new viewClass(R.mipmap.bee,"蟻人與黃蜂女","2018/6/29","故事接續在《美國隊長3：英雄內戰》之後，史考特朗恩因為參與了內戰判刑，帶上電子腳鐐，居家監禁，在父親和蟻人兩個角色中左支右絀。眼看刑期終於快服滿，皮姆博士和荷普又帶著危急的任務找上門，史考特不得不再次穿上蟻人裝束，與黃蜂女一起對抗來自過去的黑暗秘密。"));
//28剛剛是第2項變數,現在來用橋梁變數(新增物件)連接資料
        adapterclass = new adapterClass(this,viewclass);
                                               //要用的資料
//29剩主介面變數, 連接橋梁方法
        listview.setAdapter(adapterclass);
    }
}

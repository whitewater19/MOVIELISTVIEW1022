package com.example.movielistview1022;
//此類別是框架(資料類型的集合)

//8設型別跟變數名稱(圖跟3個標籤)
public class viewClass {
    public int pic;
    public String name;
    public String date;
    public String info;

//9右鍵產生一個建構子
    public viewClass(int pic, String name, String date, String info) {
        this.pic = pic;
        this.name = name;
        this.date = date;
        this.info = info;
    }

//10右鍵產生一個getter and setter
    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
//11增一個adapter類別
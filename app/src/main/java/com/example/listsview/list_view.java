package com.example.listsview;

public class list_view {
    private String Name;
    private String Title;
    private  int Img;

    public list_view(String name, String title, int img){
        Name = name;
        Title = title;
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}

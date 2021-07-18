package com.sumit.recyclerview;

public class CourseModel {
    int imageid;
    String name;
    String Desc;

    public CourseModel(int imageid, String name, String desc) {
        this.imageid = imageid;
        this.name = name;
        Desc = desc;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}

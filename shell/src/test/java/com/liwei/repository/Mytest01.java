package com.liwei.repository;

public class Mytest01 implements Cloneable{
    public Mytest01(){
        System.out.println("创建一个实例");
    }

    private int aInt = 0;

    public int getaInt() {
        return aInt;
    }

    public void setaInt(int aInt1) {
        this.aInt = aInt1;
    }

    public void changeInt() {
        this.aInt = 1;
    }

    public Object clone(){
        Object o = null;
        try{
            o = (Mytest01)super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  o;
    }

}

package com.liwei.repository;

import java.io.*;
public class Mytest02 {
    private FileInputStream fileInputStream;

    private int a =10;


    public static void main(String[] args) {
      /*
        // 克隆的方式创建对象
        Mytest01 m = new Mytest01();
        Mytest01 m2 = (Mytest01) m.clone();
        m2.changeInt();
        System.out.println("a:"+m.getaInt());
        System.out.println("a2:"+m2.getaInt());*/

      /*
        //放射机制创建对象  经过构造函数
        Class classType;

        try {
            classType = Class.forName("com.liwei.repository.Mytest03");
            Mytest03 m = (Mytest03) classType.newInstance();
            System.out.println(m.getA());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        Mytest03 m = new Mytest03();
        System.out.println(m);
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            FileOutputStream fos = new FileOutputStream("mytest.xxx");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Mytest03 m2;

        try {
            FileInputStream fis = new FileInputStream("mytest.xxx");
            ois = new ObjectInputStream(fis);
            m2 = (Mytest03) ois.readObject();
            System.out.println(m2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


class Mytest03 implements Serializable{
    public Mytest03(){
        System.out.println("创建一个mytest03p对象");
    }

    private int a = 1;

    public int getA() {
        return a;
    }
}

package com.xyz.samples;

/**
 * Created by pavani on 7/5/17.
 */
public class StaticEx {

      static int i=0;


    public StaticEx()
    {
        i++;
    }

    public static void main(String[] args) {

        StaticEx s=new StaticEx();
        System.out.println(s.i);

        StaticEx s1=new StaticEx();
        System.out.println(s1.i);

        StaticEx s2=new StaticEx();
        System.out.println(s2.i);


    }

}

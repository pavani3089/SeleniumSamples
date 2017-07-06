package com.xyz.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 7/4/17.
 */
public class StringExample {
    public static void main(String[] args) {


        String s="aba bba ccc aba bba ccc bba";
        HashMap<String, Integer> h = new HashMap<>();
        String x[] =s.split(" ");

        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
            if(h.containsKey(x[i])){
                h.put(x[i],h.get(x[i])+1);
            }
            else{
                h.put(x[i],1);
            }
        }

        ArrayList<Map.Entry> a=new ArrayList<>();
        for (Map.Entry m : h.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
            a.add(m);
        }

        int largest=(int)a.get(0).getValue();

        String lar_word=(String)a.get(0).getKey();


        for(int i=1;i<a.size();i++)
        {


            if((int)a.get(i).getValue()>largest)
            {
                largest=(int)a.get(i).getValue();
                lar_word=(String)a.get(i).getKey();

            }




        }


        System.out.println(lar_word);
        System.out.println(largest);



    }
}

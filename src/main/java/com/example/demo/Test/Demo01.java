package com.example.demo.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList();
        names.add("one");
        names.add("two");
        names.add("three");
        names.add("four");
        names.add("five");
        names.add("six");
        names.add("seven");
        names.forEach(System.out::println);



        final int num=1;
        Converter<Integer,String>s =(param) -> System.out.println(String.valueOf(param+num));
        s.convert(2);


    }
    public interface Converter<T1,T2>{
        void convert(int i);
    }
}

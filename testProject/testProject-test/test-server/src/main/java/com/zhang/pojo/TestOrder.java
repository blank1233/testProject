package com.zhang.pojo;

import lombok.*;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestOrder {
    private Integer zf;

    private Integer pjf;

    /*public static String test(){
        return "冒号调用";
    }

    public void test2(){

    }*/
    public static void print(String str){
        System.out.println(str );
    }

    public void test(){
        List<String> strings = Arrays.asList("111", "222");
        strings.forEach(TestOrder::print);
        ArrayList<Object> objects = new ArrayList<>();

        for (Object object : objects) {

        }


    }

    public static void main(String[] args) {

    }

}

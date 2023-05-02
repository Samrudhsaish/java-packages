package com.acro.netflix;

import java.util.Scanner;

public class TestCode {
    public Movies compareMaxTime(Movies t1,Movies t2) {
        if (t1.maxTime >=t2.maxTime) {
            System.out.println("Maximum time of movie");
            return t1;
        }
            else{
            System.out.println("Minimum time of movie") ;
            return t2;
            }

        }

   public static void main (String[] args){
        Movies m1=new Movies();
        m1.movieName="xtz";
        m1.maxTime=70;
        m1.year=2021;

        Movies m2=new Movies();
        m2.movieName="rty";
        m2.maxTime=60;

     TestCode c=new TestCode();
     Movies res=c.compareMaxTime(m1,m2);
     System.out.println(res);

    }



}

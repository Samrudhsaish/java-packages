package com.acro.healthcarep;

public class TestDriver {
    public boolean comparingAge(int x1,int y1) {

        if (x1>y1) {
            System.out.println("patient is major");
            return true;
        } else {
            System.out.println("patient is minor");
            return false;
        }


    }



    public static void main (String[]args){
        Patient p1=new Patient();
        p1.patientName="Jay";
        p1.gender="m";
        p1.age=9;
        p1.email="Iam@gmail.com";
        Patient p2=new Patient();
        p2.patientName="John";
        p2.gender="F";
        p2.age=35;
        //p2.phoneNumber= Integer.parseInt("7_654_356_789");
        p2.email="fgr@gmail.com";
        TestDriver T=new TestDriver();
      //  boolean res=T.comparingAge(7,98);
         boolean res=T.comparingAge(6,29);

        System.out.println(res);
}
}

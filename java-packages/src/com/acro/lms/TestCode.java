package com.acro.lms;
/*compare which type of material used in library card
material1=standardPvc,material2=polyester laminate;*/
//The price of laminate is higher than PVC

//compare two materials and return a material which is expensive to be used in library cards
public class TestCode {
    public CardMaterial  compare(CardMaterial x,  CardMaterial y) {
     if(x.price>y.price) {
         System.out.println("The price of laminate is higher than PVC");
         return x;
     } else{
             System.out.println("The price of PVC is higher than laminate");
             return y;
         }
    }
    public static void main (String[]args){
            CardMaterial lc1 = new CardMaterial();
            lc1.signature= "Devi";
            lc1.materialUsed = "polyester laminate";
            lc1.price=3000;

            CardMaterial lc2 = new CardMaterial();
            lc2.signature = "Dev";
            lc2.materialUsed = "standard PVC";
            lc2.price=1000;

            TestCode Cm=new TestCode();
            CardMaterial res=Cm.compare(lc1,lc2);
            System.out.println(res);
        }

    }

public class MinOfArray {
    //Find minimum element in an array
     public  int getMinElement(int[] input) {
         int min = input[0];
         for (int i = 1; i < input.length; i++) {
             if (input[i] < min) {
                 min = input[i];

             }
         }
         return min;
     }
    public static void  main (String[] args){
         MinOfArray m=new MinOfArray();
         int[] i1={11,12,3,14,15};
         System.out.println(m.getMinElement(i1));





    }
}

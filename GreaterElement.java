public class GreaterElement {

    public int GreaterThanTen(int[] ar) {
        //element={12,14, 10,31,6, 4, 5};
        //index    0,  1, 2, 3, 4, 5, 6====i
        System.out.println("greater than 10");

        int max = ar[0];
        for (int i = 1; i < ar.length; i++)
            if (ar[i] >= ar[2]) {
                System.out.println(ar[i]);
            }

            return max;
    }
    public static void main (String[]   args){
        int[]  input={12,14,10,31,6,4,5};
        GreaterElement e=new GreaterElement();
       System.out.println(e.GreaterThanTen(input));



    }
}

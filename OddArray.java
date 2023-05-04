public class OddArray {
    public boolean oddElement(int[]  ar){
        System.out.println("print odd number");

        for(int i=0;i<ar.length;i++)
            if(ar[i]% 2!= 0){
               System.out.println(ar[i]);
            }
        return true;
        }


    public static void main(String[]  args){
        OddArray o1=new OddArray();
        int[]  ar1={9,7,4,6};
        System.out.println(o1.oddElement(ar1));
    }
}

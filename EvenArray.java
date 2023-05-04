//Find how many even elements in an array
//eg:: ar1=[1,2,3,4]
//  index   0,1,2,3
public class EvenArray {
    public boolean evenElement(int[] s) {
        //int even = s[0];
        System.out.println("print even array number");

        for (int i = 0; i < s.length; i++)
            if (s[i] % 2 == 0) {
                System.out.println(s[i]);
            }
              return true;
    }



public static void main (String[]  args){
  EvenArray e=new EvenArray();
  int[]  s1={1,4,6,8};
    System.out.println((e.evenElement(s1)));


}
}

public class Chapter60 {
    public static void main(String[] args) {
        ex2();
        ex22();
    }
    public static void ex1() {
        int[] val = {0, 1, 2, 3}; 

        int sum=0;
        for (int i=0; i<val.length; i++){
            sum=val[i];
        }
 
        System.out.println( "Sum of all numbers = " + sum );
 
    }
    public static void ex2(){
    int[] val = {13, -4, 82, 17}; 
    int[] twice= val;
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    } 
    public static void ex22(){
    int[] val = {13, -4, 82, 17}; 
    Double[] twice =new Double[val.length];
    for (int i=0; i<val.length; i++){
        twice[i]=val[i]*1.0;
    }

 
    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }


}
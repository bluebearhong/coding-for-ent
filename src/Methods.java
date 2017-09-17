/**
 * function & method
 * why?
 * parameter  o / x
 * return value  o / x
 */

public class Methods {
    // parameter X , return X
    public void testMethodOne(){
        System.out.println("method One");
    }
    // parameter O , return X
    public void testMethodTwo(String str){
        System.out.println("method " + str);
    }
    // parameter X , return O
    public String testMethodThree(){
        return "method Three";
    }
    // parameter O , return O
    public int testMethodFour(int a, int b){
        return a+b;
    }


}

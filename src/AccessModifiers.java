/**
 * accese modifiers; public, protected, default, private
 * getter, setter
 */

public class AccessModifiers {

    private int a;
    private int b;

    public AccessModifiers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a+b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }


}

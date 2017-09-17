import java.util.ArrayList;
import java.util.Arrays;

/**
 * for-loop
 * - original
 * - for-each
 * while
 */

public class ForLoop {
    public void explainForLoop() {
        String[] strings = {"hello", "this", "is", "blue"};
//        System.out.println("hello");
//        System.out.println("This");
//        System.out.println("is");
//        System.out.println("blue");
//        System.out.println(strings[1]);

//        ++ operator
//        int testInt = 3;
//        System.out.println(testInt);
//        testInt++;
//        System.out.println(testInt);


        for(int i=0; i< strings.length; i++) {
            System.out.println(i);
            System.out.println(strings.length);
            System.out.println(strings[i]);
        }
    }

    public void explainForLoopWithArrayList() {
        String[] strings = {"hello", "this", "is", "blue"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strings));
        arrayList.add("!");
        for(int i=0; i< arrayList.size(); i++) {
//            System.out.println(i);
//            System.out.println(arrayList.size());
            System.out.println(arrayList.get(i));
        }

        for (String targetString: arrayList)
        {
            System.out.println(targetString);
        }
    }

    public void explainWhile() {
        int testInt = 0;
//        while (testInt < 100) {
//            System.out.println(testInt);
//            ++testInt;
//            if(testInt > 100) {
//                break;
//            }
        String[] strings = {"hello", "this", "is", "blue"};
        while(testInt< strings.length){
            System.out.println(strings[testInt]);
            testInt++;
        }
    }

}

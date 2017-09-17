/** 주석 달기
 *
 */

public class TestMain {
    public static void main(String[] args) {
        //System.out.println("hello");

        //Class 01 operators test
//        Operators operators = new Operators();
//        operators.calculate();

        //Class 02 primitive data types
//        PrimitiveDataTypes dataTypes = new PrimitiveDataTypes();
//        dataTypes.explainInteger();
//        dataTypes.explainDouble();
//        dataTypes.castNumber();
//        dataTypes.explainString();
//        dataTypes.parseData();

//        Class 03 Collection frameworks
//        CollectionFrameworks collectionFrameworks = new CollectionFrameworks();
//        collectionFrameworks.explainArray();
//        collectionFrameworks.explainArrayList();
//        collectionFrameworks.explainHashSet();
//        collectionFrameworks.explainHashMap();

//        IfStatement ifStatement = new IfStatement();
//        ifStatement.explainBoolean();
//        ifStatement.explainIfStatement();

//        ForLoop forLoop = new ForLoop();
//        forLoop.explainForLoop();
//        forLoop.explainForLoopWithArrayList();
//        forLoop.explainWhile();

//        MiniProject1 miniProject1 = new MiniProject1();
//        miniProject1.NorthAmerica();
//        miniProject1.KoreanFood();
//        miniProject1.FruitSpec();

//        methods
//        Methods methods = new Methods();
//        methods.testMethodOne();
//        methods.testMethodTwo("Two");
////        methods.testMethodThree();
//        System.out.println(methods.testMethodThree());
////        methods.testMethodFour(3,4);
//        System.out.println(methods.testMethodFour(3,4));

        FavoriteFood favoriteFood = new FavoriteFood();
        favoriteFood.method1();
        favoriteFood.method2("피자");
        System.out.println(favoriteFood.method3());
        System.out.println(favoriteFood.method4("피자"));


    }
}

import java.util.*;
import java.util.function.*;
import hoge.TestFunction;

public class SampleJava{
    public static void main(String[] args){

        //ラムダ式
        IntBinaryOperator func = (int a , int b) -> { return a+b; };
        int result = func.applyAsInt(3,5);
        System.out.println( result );

        //Booleanただ反対にするだけ
        TestFunction dateFunc = ( boolean d ) -> { return !d;};
        boolean date = dateFunc.call(true);
        System.out.println(date);

        List<String> list = new ArrayList<String>();
        list.add("佐藤");
        list.add("鈴木");
        list.add("田中");
        list.add("佐藤2");

        System.out.println(list);

        System.out.println("--------");
        list.forEach(name -> System.out.println(name));
        System.out.println("--------");
        list.forEach(System.out::println);


    }
}

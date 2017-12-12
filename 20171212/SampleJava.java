import java.util.*;
import java.util.function.*;
import hoge.TestFunction;

public class SampleJava{
    public static void main(String[] args){

        //ラムダ式
        IntBinaryOperator func = (int a , int b) -> { return a+b; };
        int result = func.applyAsInt(3,5);
        System.out.println( result );
        //出力 8

        //TextFunctionってインターフェース作ってみた
        //Booleanただ反対にするだけ
        TestFunction boolFunc = ( boolean d ) -> { return !d;};
        boolean b = boolFunc.call(true);
        System.out.println(b);
        //出力 false

        TestFunction boolFunc2 = boo -> { return !boo;};
        boolean c = boolFunc2.call(false);
        System.out.println("端折った式 - "+c);
        //出力 端折った式 - true

        List<String> list = new ArrayList<String>();
        list.add("佐藤");
        list.add("鈴木");
        list.add("田中");
        list.add("佐藤2");

        System.out.println(list);
        //出力 [佐藤, 鈴木, 田中, 佐藤2]

        //本来であれば
        for( String name : list){
            System.out.print(name);
        }
        //出力 佐藤鈴木田中佐藤2

        System.out.println();

        //ラムダ式
        list.stream().forEach(name -> System.out.println(name+"さん"));
        /*
        //出力
        佐藤さん
        鈴木さん
        田中さん
        佐藤2さん
        */

    }
}

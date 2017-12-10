import java.util.*;

public class SampleJava{
    public static void main(String[] args){
        Set<String> texts = new HashSet<String>();
        texts.add("test");
        texts.add("test1");
        texts.add("test2");
        texts.add("test3");
        System.out.println(texts);
        /*
        出力
        [test2, test3, test, test1]
        */
        texts.add("test");
        System.out.print(texts);
        System.out.println(texts.size() +"種類");
        /*
        出力 同じ"test"なので入らない
        [test2, test3, test, test1]4種類
        */

        /* 自然順序付け */

        Set<String> names = new TreeSet<String>();
        names.add("boboob");
        names.add("hoge");
        names.add("age");
        names.add("hugaga");
        System.out.println(names);
        /* 出力
        [age, boboob, hoge, hugaga]
        */
    }
}

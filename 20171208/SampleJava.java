import java.util.*;

public class SampleJava{
  public static void main(String[] args){

    ArrayList<String> hogehugaArr = new ArrayList<String>();
    hogehugaArr.add("フガー");
    hogehugaArr.add("うガー");
    hogehugaArr.add("ぐガー");
    hogehugaArr.add("フガー");

    //サイズを見る size
    System.out.println( hogehugaArr.size() );
    //出力 4

    //"フガー"があるかどうか
    System.out.println( hogehugaArr );//出力 [フガー, うガー, ぐガー, フガー]
    System.out.println( hogehugaArr.contains("フガー") );//出力 true
    System.out.println( hogehugaArr.contains("ほガー") );//出力 false


    Iterator<String> iterator = hogehugaArr.iterator();
    while( iterator.hasNext() ){
      String text = iterator.next();
      System.out.println(text);
    }
  }
}

/*
出力
フガー
うガー
ぐガー
フガー
*/

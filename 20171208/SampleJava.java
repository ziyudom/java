import java.util.*;

public class SampleJava{
  public static void main(String[] args){

    ArrayList<String> hogehugaArr = new ArrayList<String>();
    hogehugaArr.add("フガー");
    hogehugaArr.add("うガー");
    hogehugaArr.add("ぐガー");
    hogehugaArr.add("フガー");

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

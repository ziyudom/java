import java.util.ArrayList;

public class SampleJava{
  public static void main(String[] args){

    ArrayList<String> hogehugaArr = new ArrayList<String>();


    System.out.println(hogehugaArr.isEmpty());
    /* 出力
    true
    */
    hogehugaArr.add("フガー");
    hogehugaArr.add("うガー");
    hogehugaArr.add("ぐガー");
    hogehugaArr.add("フガー");

    System.out.println(hogehugaArr);
    /* 出力
    [フガー, うガー, ぐガー, フガー]
    */
    hogehugaArr.add(3,"そろっと");
    System.out.println(hogehugaArr);
    /* 出力
    [フガー, うガー, ぐガー, そろっと, フガー]
    */

    hogehugaArr.set(2,"ここに決めた！");
    System.out.println(hogehugaArr);
    /* 出力
    [フガー, うガー, ここに決めた！, そろっと, フガー]
    */

    System.out.println(hogehugaArr.isEmpty());
    /* 出力
    false
    */
  }
}

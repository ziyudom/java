public class SampleJava{
  public static void main(String[] args){

    StringBuilder hoge = new StringBuilder("test");
    //こっちのがふつうの文字列結合より速いもよう
    for( int i = 0 ; i < 100 ; i++ ){
      hoge.append("123");
    }
    String output = hoge.toString();
    System.out.printf(output);
  }
}

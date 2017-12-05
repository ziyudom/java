public class SampleJava{
  public static void main(String[] args){

    sample();
    System.out.printf("\n");//改行
    System.out.printf("\n");//改行
    sample2();
  }
  private static void sample(){
    String output = String.format( "これは%5d",10);
    System.out.printf(output);
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%5d",2));
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%5d",100));
  }
  private static void sample2(){
    String output = String.format( "これは%20s","自由に生きたい");
    System.out.printf(output);
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%20s","じゆうに生きたい"));
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%20s","いきたい"));
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%20s","ziyuda"));
    System.out.printf("\n");//改行
    System.out.printf(String.format( "これは%20s","orehajiyuuda"));
  }
}

//出力されるもの
/*
これは   10
これは    2
これは  100

これは             自由に生きたい
これは            じゆうに生きたい
これは                いきたい
これは              ziyuda
これは        orehajiyuuda
*/

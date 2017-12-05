public class SampleJava{
     public static void main(String[] args){

       StringBuilder hoge = new StringBuilder("test");
       
       //こっちのが速いもよう
       for( int i = 0 ; i < 100 ; i++ ){
          hoge.append("123");
       }
       String s = hoge.toString();
       System.out.printf(s);
   }
}

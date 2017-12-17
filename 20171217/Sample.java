import java.util.Date;

public class Sample {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        //Sun Dec 17 22:33:43 JST 2017
        //1513517623213

        //過去を出す
        Date test = new Date(1513517587002L);
        System.out.println(test);
        //Sun Dec 17 22:33:07 JST 2017
    }
}

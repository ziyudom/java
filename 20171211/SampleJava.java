import user.User;
import java.util.*;

public class SampleJava{
    public static void main(String[] args){

        List<User> list = new ArrayList<User>();

        //一人目 太郎君
        User a1 = new User();
        a1.setNumber(150);
        a1.setName("太郎君 150");
        list.add(a1);

        //二人目 ヤマダ君
        User a2 = new User();
        a2.setNumber(100);
        a2.setName("ヤマダ君 100");
        list.add(a2);

        //三人目 サトウ君
        User a3 = new User();
        a3.setNumber(120);
        a3.setName("サトウ君 120");
        list.add(a3);

        for( User user: list){
            System.out.println( user.getName() );
        }
        Collections.sort(list);
        System.out.println("-- 並び変え後 --");
        for( User user: list){
            System.out.println( user.getName() );
        }
        /*
        出力
        太郎君 150
        ヤマダ君 100
        サトウ君 120
        -- 並び変え後 --
        ヤマダ君 100
        サトウ君 120
        太郎君 150
        */
    }
}

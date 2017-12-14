import java.io.*;

public class SampleJava {
    public static void main(String[] args) throws IOException{
        
        FileWriter fw = new FileWriter("hoge.txt",true);
        fw.write("hoge");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader("read.txt");
        int i = fr.read();
        while( i != -1 ){
            char c = (char) i;
            System.out.println(c);
            i = fr.read();
        }
        fr.close();
        /*出力
        わ
        れ
        わ
        れ
        は
        宇
        宙
        人
        か
        ？
        */
    }
}

import java.io.*;

public class SampleJava{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("hoge.txt",true);
        fw.write("hoge");
        fw.flush();
        fw.close();
    }
}

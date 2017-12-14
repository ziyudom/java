import java.io.*;

public class SampleJava {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("test.txt",true);

        fw.write("これはテスト");
        fw.flush();
        fw.close();
        
    }
}

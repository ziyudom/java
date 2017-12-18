import java.io.*;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        String st = "テキストサンプルですhogehuga";
        Reader sr = new StringReader(st);
        char c = (char) sr.read();
        for(int i = 0  ; i < 10; i++){
            System.out.println(c);
            c = (char) sr.read();
        }
    }
}

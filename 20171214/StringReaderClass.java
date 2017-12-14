import java.io.*;

public class StringReaderClass {
    public static void main(String[] args) throws IOException{

        String msg = "今日は木曜日";
        Reader sr = new StringReader(msg);
        while( true ){
            int c = sr.read();
            if( c == -1 ){ break;}
            System.out.print( (char) c );
        }
    }
}

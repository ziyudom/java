import java.io.*;

public class SampleJava {
    public static void main(String[] args) throws IOException{

        FileWriter fw = null;//ここに書かないとfinallyのブロックでよべない

        try {

        fw = new FileWriter("test.txt",true);

        fw.write("これはテスト");
        fw.flush();

        } catch(IOException e){

            System.out.println(e);

        }finally{

            fw.close();

        }

    }
}

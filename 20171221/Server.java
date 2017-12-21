import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        try(ServerSocket server = new ServerSocket(9999)){

            FileOutputStream fos = new FileOutputStream("recv.txt");
            System.out.println("待ちます");
            Socket socket = server.accept();
            System.out.println("接続");

            int ch;

            InputStream in = socket.getInputStream();

            while( (ch = in.read()) != 0){
                fos.write(ch);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

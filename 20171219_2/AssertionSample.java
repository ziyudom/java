//http://kmaebashi.com/programmer/webserver/tcpserver.html

import java.io.*;
import java.net.*;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        try( ServerSocket server = new ServerSocket(8001) ){
            FileOutputStream fos = new FileOutputStream("server_recv.txt");
            FileInputStream fis = new FileInputStream("server_send.txt");
            System.out.println("クライアントの接続を待ちます");
            Socket socket = server.accept();
            System.out.println("クライアント接続");

            int ch;
            //クラアインとから受け取った内容をserver_recvに出力
            InputStream input = socket.getInputStream();
            //一つずつ
            while((ch = input.read()) != 0){
                fos.write(ch);
            }

            OutputStream output = socket.getOutputStream();
            while((ch = fis.read()) != -1 ){
                output.write(ch);
            }
            socket.close();
            System.out.println("通信を終了しました");
        }catch( Exception ex ){
            ex.printStackTrace();
        }
    }
}

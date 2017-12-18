import java.io.*;

public class FileOutPutSample {
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("out.txt",true);){
        byte b1 = 74; //ASCII：(J)
		byte b2 = 65; //ASCII：(A)
		byte b3 = 86; //ASCII：(V)
		byte b4 = 65; //ASCII：(A)

		fos.write(b1);
		fos.write(b2);
		fos.write(b3);
		fos.write(b4);
        }catch( Exception e){
            e.printStackTrace();
        }

    }
}

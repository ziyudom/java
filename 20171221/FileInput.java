import java.io.*;

public class FileInput {
    public static void main(String[] args){
        System.out.println("入力してください。");
        try{
            FileInputStream fis = new FileInputStream("sample.txt");
            FileOutputStream fos = new FileOutputStream("out.txt");
            InputStreamReader in = new InputStreamReader(fis, "UTF-8");
            OutputStreamWriter out = new OutputStreamWriter(fos,"Shift_JIS");
            int contents;
            while ((contents = in.read()) != -1) {
                out.write(contents);
            }
            in.close();
            out.close();
        }catch(IOException e){

        }
    }
}

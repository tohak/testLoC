import java.io.*;


public class FileMassage implements Massage{

    private String pathFile="E:\\java\\codIntellij\\testLoC\\src\\main\\resources\\1.txt";

    public String getMessege() {
        File file= new File(pathFile);
        String msg=null;
        String ms="";
        try(BufferedReader br=new BufferedReader(new FileReader(file))) {
           for (;(msg=br.readLine())!=null;){
               ms+=msg;
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ms;
    }
}

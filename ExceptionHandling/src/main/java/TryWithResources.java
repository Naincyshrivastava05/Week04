import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{
    public static String tryWithResources(String filePath)throws IOException{
            StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = "";
            while((line = br.readLine())!=null){
                sb.append(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            throw e;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
        return  sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "org.txt";
        tryWithResources(filePath);
    }
}

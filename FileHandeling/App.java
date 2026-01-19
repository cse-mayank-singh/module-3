package FileHandeling;
import java.io.IOException;

public class App {
    public static void execution() {
   	 try {
   		 FileHandler.create();
   		 FileHandler.update();
   		 FileHandler.read();
   		 FileHandler.delete();
   	 }
   	 catch (IOException e) {
   		 e.printStackTrace();
   	 }
    }
}

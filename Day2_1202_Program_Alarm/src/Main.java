import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File file = new File("./input.txt");
            Scanner reader = new Scanner(file);
            ArrayList input = new ArrayList<Integer>();
            String[] numbers = reader.next().split(",");
            for(String item : numbers){
                input.add(Integer.parseInt(item));
            }
            System.out.println("lol");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

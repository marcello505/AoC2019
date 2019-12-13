import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File file = new File("./input.txt");
            Scanner reader = new Scanner(file);
            ArrayList<Integer> input = new ArrayList<Integer>();
            String[] numbers = reader.next().split(",");
            for(String item : numbers){
                input.add(Integer.parseInt(item));
            }
            System.out.println("lol");
            int x;
            int y;
            int z;
            for(int i = 0;i < input.size();i+=4){
                if(input.get(i) == 99 ){
                    break;
                }
                if(input.get(i) == 1){
                    x = input.get(input.get(i+1));
                    y = input.get(input.get(i+2));
                    z = input.get(i+3);
                    input.set(z,x+y);
                }
                else if(input.get(i) == 2){
                    x = input.get(input.get(i+1));
                    y = input.get(input.get(i+2));
                    z = input.get(i+3);
                    input.set(z,x*y);
                }
            }
            System.out.println(input.get(0));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

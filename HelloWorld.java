import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student list: ");
        File file = new File(sc.nextLine());
        sc = new Scanner(file);
        System.out.println("Hello World This is TDTU");
        while(sc.hasNextLine()){
            System.out.print(sc.nextLine()+ "\n");
        }
   }
}

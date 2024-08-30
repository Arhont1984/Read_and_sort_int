import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("D:\\new_life\\JAVA\\IDEA\\100gb_sort_int\\src\\main\\resources\\числа.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for(int i:list){
            System.out.println(i);
        }
    }
}


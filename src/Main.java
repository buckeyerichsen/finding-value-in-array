import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        Random r = new Random();
        Scanner key = new Scanner(System.in);

        int number;
        int type;

            for(int i=0; i<51; i++)
        {

            r.nextInt(51);

            number = r.nextInt(51);

            list.add(number);


        }
            System.out.println(list);

        System.out.println("please type a number between 1-50");

        type = key.nextInt();

        if (list.contains(type))
            System.out.println("you are correct");








    }}


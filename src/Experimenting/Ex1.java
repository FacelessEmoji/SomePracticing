package Experimenting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; numbers[i++]*=3,i++) {
            //прикольная шняга
        }
        Arrays.stream(numbers).forEach(System.out::println);

        testLoop: for (int i = 0; i < numbers.length; i++) {
            numbers[i]  = 0;
            if (numbers[i] == 5) break testLoop;
        }
        Arrays.stream(numbers).forEach(System.out::println);
        // хз скорее всего для двух и более циклов(?)

/*        var x = scanner.nextLine();
        if (x instanceof String){
            System.out.println("да-да-да это строка");
        }*/
/*        else if (x instanceof Integer){
            System.out.println("да-да-да это число");
        }*/
        // эксперименты с var и instance
    }
}

package exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static int evenSum(ArrayList<Integer> givenArrayList){
        int sum = 0;
        for (Integer number: givenArrayList){
            if (number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }

    public static void searchByWordLength(){
        int searchLength;
        String submittedString;
        Scanner input = new Scanner(System.in);
        Scanner input2 =new Scanner(System.in);
        System.out.println("What string?");
        submittedString = input.nextLine();
        System.out.println("What word length?");
        searchLength = input2.nextInt();

        String[] submittedWordsArray = submittedString.split(" ");
        List<String> submittedWords = new ArrayList<String>();
        submittedWords = Arrays.asList(submittedWordsArray);

        for (String word: submittedWords){
            if (word.length() == searchLength){
                System.out.println(word);

            }
        }
    }


    public static void main(String[] args){
        ArrayList<Integer> someInts = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            someInts.add(i);
        }
        //System.out.println(evenSum(someInts));
        searchByWordLength();
    }
}

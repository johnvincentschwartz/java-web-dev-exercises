package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args){
        String ALICE_STRING = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word");
        String searchTerm = input.next();
        int searchedIndex = ALICE_STRING.indexOf(searchTerm);
        int searchedLength = searchTerm.length();
        System.out.println("Index: " + searchedIndex + ", Length: " + searchedLength);
        String modifiedAliceString = ALICE_STRING.substring(0,searchedIndex - 1).concat(ALICE_STRING.substring(searchedIndex + searchedLength, ALICE_STRING.length()));
        System.out.println(modifiedAliceString);
    }
}

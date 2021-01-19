package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> studentIds = new HashMap<>();
        studentIds.put(1, "Test Name");
        Scanner idInput = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        int id;
        String name;
        System.out.println("Enter a new ID");
        id = idInput.nextInt();
        System.out.println("Enter student name");
        name = nameInput.nextLine();
        studentIds.put(id, name);
        for (Map.Entry<Integer, String> student : studentIds.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}

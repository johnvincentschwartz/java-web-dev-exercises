package exercises;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name?!");
        String name = input.nextLine();
        System.out.println("Hi " + name);
    }
}

//https://intellij-support.jetbrains.com/hc/en-us/community/posts/207750405-IntelliJ-System-out-println-Cannot-resolve-method-println-java-lang-String-
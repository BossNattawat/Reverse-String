import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Text : ");
        String text = sc.nextLine();

        sc.close();

        StringBuilder reverseText = new StringBuilder();

        for(int i = 0; i < text.length(); i++){

            char output = text.charAt((text.length() - 1) - i);

            reverseText.append(output);

        }

        System.out.print("Reverse text : " + reverseText);

    }

}

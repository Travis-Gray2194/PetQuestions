import java.util.Scanner;

/**
 * Created by ${TravisGray} on 10/11/2017.
 */

//The following code is supposed to ask the user their pet's name, breed and age.
public class PetQuestions {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();//Capture user input as String variable name

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();//Capture user input as String variable breed

        System.out.println( "How old is " + name + "? ");
        age =keyboard.nextInt();//Capture user input as integer variable

        System.out.println( name + " is your " + breed + " and it is " + age );//Print

    }//End Main Method
}//End Main Class

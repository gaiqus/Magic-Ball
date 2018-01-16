package magicball;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class MagicBall {

    public static void main(String[] args) { 

        String answers[] = {"To pewne", "Oczywiście", "Bez żadnych wątpliwości",
            "Tak, zdecydowanie", "Wygląda na to, że tak",
            "Bardzo prawdopodbne", "Wygląda dobrze",
            "Tak", "Sam nie wiem, spróbuj ponownie", "Zapytaj mnie później",
            "Lepiej żeby Ci nie mówić", "Nie jestem w stanie tego przewidzieć", "Skoncentruj się i zapytaj ponownie",
            "Nie licz na to", "Nie", "Moje źródło mówi, że nie",
            "Nie wygląda to dobrze", "Bardzo mało prawdopodobne"};

        //constructs a random number generator 
        SecureRandom randomNumber = new SecureRandom();
        int counter = 0;

        //while loop allows the user to continue asking questions until they click no
        while(counter != 1) {
            //prompts the user to enter a question 
            String answer = JOptionPane.showInputDialog(null, 
                    "Wpisz swoje pytanie", JOptionPane.INFORMATION_MESSAGE);

            //displays the answer
            if(answer != null)
                JOptionPane.showMessageDialog(null, answer+ "\n" + answers[randomNumber.nextInt(answers.length)], 
                "Magiczna kula odpowiedziała:", JOptionPane.PLAIN_MESSAGE);

            //gives the user the option to click yes or no to continue asking questions
            counter = JOptionPane.showConfirmDialog(null, "", "Chcesz zapytać ponownie?", 
                    JOptionPane.YES_NO_OPTION, 0);                           
        }
    }
}
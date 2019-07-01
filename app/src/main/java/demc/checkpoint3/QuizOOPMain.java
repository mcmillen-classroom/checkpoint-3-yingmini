package demc.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{

    // this is where the app starts
    public static void main(String[] args)
    {
        String[] Multi = {"b", "b.", "B", "B.", "9:00"};
        String[] MChoice = {"a.  8:30", "b.  9:00", "or c.  9:30"};

        Question[] questions = new Question[4];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");
        questions[3] = new MultipleChoiceQuesiton("When does room 274 starts?", MChoice, Multi);

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");

        while (index < questions.length)
        {
            System.out.println(questions[index].getText());

            if (questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are incorrect!");
            }

            index++;
        }
    }
}

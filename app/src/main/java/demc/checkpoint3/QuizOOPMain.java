package demc.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{

    // this is where the app starts
    public static void main(String[] args)
    {
        String[] Multi_1 = {"b", "b.", "B", "B.", "9:00"};
        String[] MChoice_1 = {"a.  8:30", "b.  9:00", "or c.  9:30"};

        String[] Multi_2 = {"Depends on the work!", "Depends on the work", "depends on the work!", "depends on the work", "c.", "c", "C.", "C"};
        String[] MChoice_2 = {"a.  11:40~11:50", "b.  11:50~12:00", "or c.  Depends on the work!"};

        Question[] questions = new Question[5];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");
        questions[3] = new MultipleChoiceQuesiton("When does room 271 starts?", MChoice_1, Multi_1);
        questions[4] = new MultipleChoiceQuesiton("When does room 271 ends?", MChoice_2, Multi_2);

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

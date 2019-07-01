package demc.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuesiton extends Question {

    private String[] mOptions;
    private String[] mAnswer;

    public MultipleChoiceQuesiton(String text, String[] options, String[] answer)
    {
        super (text);
        mOptions = options;
        mAnswer = answer;
    }

    public String[] getAnswer() {
        return mAnswer;
    }

    @Override
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : getAnswer())
        {
            if (ans.equals(userAnswer))
            {
                return true;
            }
        }

        return false;
    }


    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.println("Enter answer: " + mOptions[0] + " " + mOptions[1] + " " + mOptions[2]);

        String in = input.nextLine();
        return checkAnswer(in);
    }

}

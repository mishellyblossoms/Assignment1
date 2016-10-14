
/**
 * Michelle Duong
 */
public class TFQuestion extends Question
{
    /**
     * field to hold the question
     */
    private String question;

    /**
     * Constructor for objects of class MCQuestion
     */
    public TFQuestion(String q)
    {
        question = q;
    }
    /**
     * displays the question
     */
    public void printQuestion()
    {
       System.out.println(question);
    }
}

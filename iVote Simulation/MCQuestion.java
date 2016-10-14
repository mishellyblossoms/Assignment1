
/**
 * Michelle Duong
 */
public class MCQuestion extends Question
{
    /**
     * field that holds the question
     */
    private String question;

    /**
     * Constructor for objects of class MCQuestion
     */
    public MCQuestion(String q)
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

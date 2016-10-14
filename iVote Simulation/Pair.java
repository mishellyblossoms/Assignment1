
/**
 * Michelle Duong
 */
public class Pair
{
    /**
     * field to hold Question object
     */
    private Question  q;
    /**
     * field to hold Answer onject
     */
    private Answer a;
    /**
     * Constructor for objects of class Pair
     */
    public Pair(Question q, Answer a)
    {
        this.q = q;
        this.a = a;
    }

    /**
     * returns the Question
     */
    public Question getQuestion()
    {
        return q;
    }

    /**
     * returns the Answer
     */
    public Answer getAnswer()
    {
        return a;
    }
}

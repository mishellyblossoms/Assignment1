
/**
 * 
 * 
 * Michelle Duong 
 * )
 */
public class TF extends Answer
{
    /**
     * private field to hold the answers
     */
    private String ans;
    /**
     * private fiels to hold possible answers
     */
    private String possible = "T, F";
    /**
     * constructor for TF, takes in the answer to a particular question as an argument
     */
    public TF(String ans)
    {
        this.ans = ans;
    }

    /**
     * displays the answer to the question
     */
    public void printAnswer()
    {
        System.out.print(ans);
    }

    /**
     * displays list of possible answers
     */
    public void possibleAnswer()
    {
        System.out.println(possible);
    }
}

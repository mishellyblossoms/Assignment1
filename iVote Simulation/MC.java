import java.util.*;
/**
 *
 * Michelle Duong
 */
public class MC extends Answer
{
    /**
     * field field to hold the answer
     */ 
    private String ans;
    /**
     * field to hold possible answers the question
     */
    private String possible;
    /**
     * constructor, takes in two Strings for arguments
     */
    public MC(String ans, String possible)
    {
        this.ans = ans;
        this.possible = possible;
    }

    /**
     * displays the answer
     */
    public void printAnswer()
    {
        System.out.print(ans);
    }

    /**
     * displays all possible answers for the question
     */
    public void possibleAnswer()
    {
        System.out.println(possible);
    }
}

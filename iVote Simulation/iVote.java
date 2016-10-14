import java.util.*;
/**
 * Michelle Duong
 */
public class iVote implements MySystem
{
    /**
     * private Class object used for access in iVote class
     */
    private Class group;
    /**
     * contain the Question-Answer pair
     */
    private Pair pair;
    /**
     * flag to help keep track of adding and updating the gathered answers
     */
    private boolean flag = false;
    /**
     * array to trackig number of distinct answers
     */
    private int[] tracking;
    /**
     * Constructor for objects of class iVote, takes a Question and Answer as arguements
     */
    public iVote(Question q, Answer a)
    {
        group = new Class(); 
        pair = new Pair(q,a);

    }

    /**
     * prints the beginning information out, question and possible answers
     */
    public void printInfo()
    {

        pair.getQuestion().printQuestion();
        System.out.print("Options: ");
        pair.getAnswer().possibleAnswer();
    }

    /**
     * displays the number of each distinct answers, displays the correct answer
     */
    public void printOutput()
    {
        if ( pair.getQuestion() instanceof MCQuestion)
        {
            System.out.println("A: " + tracking[0]); 
            System.out.println("B: " + tracking[1]);
            System.out.println("C: " + tracking[2]);
            System.out.println("D: " + tracking[3]);
        }
        if( pair.getQuestion() instanceof TFQuestion)
        {
            System.out.println("True: " + tracking[0]); 
            System.out.println("False: " + tracking[1]);
        }
        System.out.print("The correct answer is ");
        pair.getAnswer().printAnswer();
        System.out.println(".");

    }

    /**
     * adds another student into the group 
     * if student already exists, method updates the answer
     */
    public void addStudent(int id, String ans)
    {
        group.add(id, ans);
    }

    /**
     * ask the Class object to fill the tracking array
     */
    public void fillTracking()
    {
        tracking = group.populateTracking();  
    }

}

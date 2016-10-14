import java.util.*;
/**
 * Class represents a group of objects. For this particular project, a group of Students.
 * 
 * Michelle Duong
 * 
 */
public class Class
{
    /**
     * private field to group togehter objects
     */
    private Set<Student> roster;

    private boolean flag = false;
    /**
     * contructor.
     */
    public Class()
    {
        roster = new HashSet<>();
    }

    /**
     * adds a new Student with ID and answer into the set. Will not update an existing Student's answer. 
     */
    public void add(int id, String ans)
    {
        for( Student s: roster)
        {
            if(s.getStudentId() == id)
            {
                s.setAnswer(ans);
                flag = true;
            }
        }
        if (flag == false)
        {
            roster.add(new Student(id, ans));
        }
        flag = false;

    }

    /**
     * returns the size. it was used in checking the program for errors
     */
    public int getSize()
    {
        return roster.size();
    }

    /**
     * counts the number of each type of answer
     */
    public int[] populateTracking()
    {
        int[] tracking = new int[4];
        for (Student s : roster)
        {
            if( s.getAnswer().equals("A") || s.getAnswer().equals("T"))
            {
                tracking[0] = tracking[0]+1;
            }
            else if( s.getAnswer().equals("B") || s.getAnswer().equals("F"))
            {
                tracking[1] = tracking[1]+1;
            }
            else if( s.getAnswer().equals("C") )
            {
                tracking[2] = tracking[2]+1;
            }
            else if( s.getAnswer().equals("D"))
            {
                tracking[3] = tracking[3]+1;
            }

        }
        return tracking;
    }

}


/**
 * Student is a simple object that represents a student. 
 * 
 * Michelle Duong
 *
 */
public class Student
{
    /**
     * private field that holds each Student's specific ID.
     */
    private int student_id;
    /**
     * private field to hold each Student's answer.
     */
    private String answer;
    /**
     * constructor for objects of class Student. constructor take in and int and a String.
     */
    public Student(int id, String ans)
    {
       student_id = id;
       answer = ans;
    }
    /**
     * returns the Student's answer.
     */
    public String getAnswer()
    {
       return answer;
    }
    /**
     * returns the Student's ID.
     */
    public int getStudentId()
    {
        return student_id;
    }
    /**
     * returns the Student's answer
     */
    public void setAnswer(String ans)
    {
      answer = ans;
    }
}

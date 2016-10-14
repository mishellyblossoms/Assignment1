
/**
 * This class is used to run simulations of the iVote System. 
 */
public class SimulationDriver
{

    /**
     * Constructor for SimulationDriver
     */
    public SimulationDriver()
    {
    
    }
   
    /**
     * For running the simulations
     */
    public static void main(String[] args)
    {
      run00();
      
      System.out.println("");
      System.out.println("");
      
      run01();
      
      
      
    }
    /**
     * The first simulation of iVote
     */
    public static void run00()
    {
      Question q = new MCQuestion("Which is my favorite icecream?");
      Answer a = new MC("B", "A. Caramel Talenti  B. Strawberry Mochi   C. Mango Ice Cream Bars   D. Nestle Drumsticks" );
      iVote ivote = new iVote(q,a);
      
      ivote.printInfo();
      
      ivote.addStudent( 1, "A");
      ivote.addStudent( 2, "A");
      ivote.addStudent( 3, "B");
      ivote.addStudent( 4, "C");
      ivote.addStudent( 5, "C");
      ivote.addStudent( 6, "C");
      ivote.addStudent( 7, "D");
      ivote.addStudent( 3, "A");
      
      ivote.fillTracking();
      ivote.printOutput();  
    }
    /**
     * The second simulation of iVote
     */
     public static void run01()
    {
      Question q = new TFQuestion("I like dogs.");
      Answer a = new TF("F");
      iVote ivote = new iVote(q,a);
      
      ivote.printInfo();
      
      ivote.addStudent( 1, "T");
      ivote.addStudent( 2, "T");
      ivote.addStudent( 3, "F");
      ivote.addStudent( 4, "F");
      
      
      ivote.fillTracking();
      ivote.printOutput();  
    }
}

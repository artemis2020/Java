package gradebookavg;


import java.util.Scanner; 

public class GradeBook 
{
    private String courseName; // name of the course this GradeBook represents
    
    // constructor initializes courseName
    public GradeBook(String name)
    {
        courseName = name; // initiliazes courseName 
    } // end constructor
    
    // method to set the course name
    public void setCourseName(String name)
    {
        courseName = name; // store the course name
    }// end method setCourseName 
    
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName; 
    }// end method getCourseName 
    
    //display a welcome message to the GradeBook user
    public void displayMessage()
    {
        // getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for:\n%s!\n\n", 
                getCourseName());
    }// end of method displayMessage
    
    // determine class average based on 10 grades entered by the user
    public void determineClassAverage()
    {
        // create Scanner to obtain input from the command window 
        Scanner input = new Scanner(System.in);
        
        int total; // sum of grades entered by the user
        int gradeCounter; // number of the grade to be entered next
        int grade; // grade value entered by the user
        int average; // average of grades
        
        // initialization phase
        total = 0; // initialize total
        gradeCounter = 1; // initialize loop counter 
        
        // processing phase uses counter-controlled repetition 
        while (gradeCounter <= 10) // loop 10 times
        {
            System.out.print("Enter grade for student" + gradeCounter + ":"); // prompt 
            grade = input.nextInt(); // input next grade 
            total = total + grade; // add grade to total 
            gradeCounter = gradeCounter + 1; // increment counter by 1 
            // the same thing as using: gradeCounter++; 
        }
        
        // termination phase 
        average = total / 10;
        
        // display total and average of grades
        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
    }// end method determineClassAverage
}// end class GradeBook

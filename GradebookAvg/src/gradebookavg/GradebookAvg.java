package gradebookavg;


public class GradebookAvg 
{
    public static void main(String[] args) {
        // create new GradeBook object myGradeBook and
        // pass the course name to the constructor 
        
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming");
        
        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.determineClassAverage(); // find average of 10 grades
    }// end main 
} // end class GradeBookTest

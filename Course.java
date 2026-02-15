package Lab03;
public class Course
{
    public String CourseCode;
    public String CourseName;
    public int CreditHours;

    // Function to Displaying course details
    void display()
    {
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Credit Hours: " + CreditHours);
        System.out.println("\n");
    }

    static void main(String[] args)
    {
        //Creating the object of first course
        Course course1 = new Course();
        course1.CourseCode = "CL1004";
        course1.CourseName = "Object Oriented Programming";
        course1.CreditHours = 3;

        // Creating the object of second course
        Course course2 = new Course();
        course2.CourseCode = "MT1003";
        course2.CourseName = "Multivariable Calculus";
        course2.CreditHours = 3;

        // Calling function to display
        course1.display();
        course2.display();
    }
}
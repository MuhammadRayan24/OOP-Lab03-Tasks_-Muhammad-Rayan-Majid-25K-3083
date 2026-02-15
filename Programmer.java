package Lab03;
public class Programmer
{
    private int Id;
    private String Name;
    private String Language;
    private int ProblemsSolved;

    public Programmer(int id, String name, String language, int problemsSolved)
    {
        this.Id = id;
        this.Name = name;
        this.Language = language;
        this.ProblemsSolved = problemsSolved;
    }

    public void UpdateProblemsSolved(int AdditionalProblems)
    {
        this.ProblemsSolved += AdditionalProblems;
    }

    public void displayDetails()
    {

        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Language: " + Language);
        System.out.println("Problems Solved: " + ProblemsSolved);
        System.out.println("\n");
    }
    static void main(String[] args)
    {
        Programmer p1 = new Programmer(3083, "Rayan", "Java", 50);
        Programmer p2 = new Programmer(3104, "Arham", "Python", 50);

        System.out.println("Initial Details:");
        p1.displayDetails();
        p2.displayDetails();

        p1.UpdateProblemsSolved(20);
        p2.UpdateProblemsSolved(15);

        System.out.println("After Updating:");
        p1.displayDetails();
        p2.displayDetails();
    }
}
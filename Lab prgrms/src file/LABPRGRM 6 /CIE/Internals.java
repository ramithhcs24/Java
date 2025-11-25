package CIE;

public class Internals {

    public int marks[] = new int[5];

    public Internals( int m[])
    {
        this.marks = m;
    }
     public void display2()
     {
        System.out.println("Marks scored in internals : ");
        for (int i = 0; i< marks.length ; i++)
        {
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }
     }
    
}

package CIE;

public class Personal {
    public String name , usn ;
    public int sem ;
    public Personal ( String n , String u , int s)
    {
        this.name = n;
        this.usn = u ; 
        this.sem = s;
    } 

    public void display1()
    {
        System.out.println("Name : " + name);
        System.out.println("Usn : " + usn);
        System.out.println("Sem : "+ sem);
    }
}


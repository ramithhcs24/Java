import java.util.Scanner ; 
import CIE.*;
import SEE.*;
public class Packages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of students : ");
        n= sc.nextInt();
        for(int j = 1 ; j<=n ; j++)
        {
            System.out.println("Enter the name of the student : ");
            String name = sc.next();
            System.out.println("Enter the usn : ");
            String usn = sc.next();
            System.out.println("Enter the sem of the student :");
            int sem = sc.nextInt();
            int imarks[] = new int[5];
            System.out.println("Enter the internals marks of student out of 50 : ");
            for(int i =0 ; i<5 ; i++){
                System.out.print("Internals subject  " + (i+1) + ":");
                imarks[i] = sc.nextInt();
            }
            Internals in = new Internals(imarks);
            int emarks[] = new int[5];
            System.out.println("Enter marks of SEE out of 100 : ");
            for(int i =0 ; i<5 ; i++){
                System.out.print("Externals subject  " + (i+1) + ":");
                emarks[i] = sc.nextInt();
            }

            External ex = new External(name, usn, sem, emarks);
            ex.display1();
            in.display2();
            ex.display3();
            int total[] = new int[5];
            System.out.println("Total marks scored : ");
            for(int k = 0 ; k<5 ; k++)
            {
                total[k] = in.marks[k] + (ex.external[k]/2);
                System.out.println("Subject " + (k+1) + " : " + total[k]);
            }
        }
        


    }
    
}

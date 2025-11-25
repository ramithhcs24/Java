import java.util.Scanner;
    class Std{
        String usn;
        String name;
        int credits[] = new int[5];
        int marks[] = new int[5];
        
        void accept(String u , String n , int m[] , int c[])
        {
            this.usn = u;
            this.name = n;
            this.credits = c;
            this.marks = m;
        }
        float calc(){
            int grade[]= new int[5];
            int sum=0;
            int sumc=0;
            for(int k =0;k<5;k++){
                if(marks[k]>=90 && marks[k]<=100)
                    grade[k]=10;
                else if(marks[k]>=80 && marks[k]<90)
                    grade[k]=9;
                else if(marks[k]>=70 && marks[k]<80)
                    grade[k]=8;
                else if(marks[k]>=65 && marks[k]<70)
                    grade[k]=7;
                else if(marks[k]>=60 && marks[k]<65)
                    grade[k]=6;
                else if(marks[k]>=50 && marks[k]<60)
                    grade[k]=5;
                else
                    grade[k]=0;
                sum+=grade[k]*credits[k];
                sumc+=credits[k];
            }
            float sgpa = (float)sum/sumc;
            return sgpa;

        }
        void display(){
            System.out.println("The usn of student is :");
            System.out.println(this.usn);
            System.out.println("The name of student is:");
            System.out.println(this.name);
        }
        public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Std s1= new Std();
        System.out.println("Enter the usn of the student :");
        String u = s.next();
        System.out.println("Enter the name of the student:");
        String n=s.next();
        int m[]=new int[5];
        int c[]= new int[5];
        for(int j=0;j<5;j++){
            System.out.println("Enter the marks of subject "+(j+1)+":");
            m[j]=s.nextInt();
            System.out.println("Enter the credits of subject"+(j+1)+":");
            c[j]=s.nextInt();
        }
        s1.accept(u,n,m,c);
        float sgp= s1.calc();
        s1.display();
        System.out.println("The sgpa of student is :");
        System.out.println(sgp);
        

    }
}
   

package SEE;

import CIE.*;

public class External extends Personal {
    
    public int external[] = new int[5];

    public External ( String n , String u , int s , int ext[])
    {
        super(n,u,s);
        this.external = ext;

    }

    public void display3()
     {
        System.out.println("Marks scored in externals : ");
        for (int i = 0; i< external.length ; i++)
        {
            System.out.println("Subject " + (i+1) + ": " + external[i]);
        }
     }
}


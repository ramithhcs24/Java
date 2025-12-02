class WrongAgeException extends Exception
{
    WrongAgeException(String msg)
    {
        
        super(msg);
        System.out.println(msg);
    }
}

class Father 
{
    int fage;
    Father(int age) throws WrongAgeException
    {
        if (age<0)
            throw new WrongAgeException("Father age cannot be negative");
        fage=age;

    }
}

class Son extends Father
{
    int sage ;
    Son(int fage , int sage ) throws WrongAgeException
    {
        super(fage);
        if(fage<sage)
            throw new WrongAgeException("Father age cannot be less than son's age");
        if(sage<0)
            throw new WrongAgeException("Son age cannot be negative");
        this.sage=sage;
    }

    public void display()
    {
        System.out.println("Father age :" + fage);
        System.out.println("Son age : "+sage);
    }
}

public class Excdemo
{
    public static void main(String[] args) {
        try{
            
            Son obj3 = new Son(40,20);
            obj3.display();
            Son obj = new Son(40, 50);
            obj.display();


        }
        catch(Exception e)
        {
            System.out.println("Exception caught :"+e);
        }

    }
}





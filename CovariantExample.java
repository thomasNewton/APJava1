class A1  
{  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A2 extends A1  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A3 extends A2  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  
  
public class CovariantExample  
{  
    // main method  
    public static void main(String argvs[])  
    {  
       A1 a1 = new A1();  
         
       // this is ok  
       a1.foo().print();  
         
       A2 a2 = new A2();  
       a2.print();
       a2.foo().print();
         
       // we need to do the type casting to make it   
       // more clear to reader about the kind of object created   
       ((A2)a2.foo()).print();  
         
       A3 a3 = new A3();  


        System.out.println("without any casting");
        a3.print();
        a3.foo().print();
    


       // doing the type casting  
       System.out.println("now with casting the a3 objct to the A# type");
       ((A3)a3.foo()).print();  
         
    }  
}  
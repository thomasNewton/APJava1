

public class sandBox {
    
}

class OverloadingCalculation3{
    void sum(int a,double b){System.out.println("a method invoked");}
    void sum(double a,int b){System.out.println("b method invoked");}
  
    public static void main(String args[]){
    OverloadingCalculation3 obj=new OverloadingCalculation3();
    obj.sum(20.0,20);//now ambiguity
    }
  }
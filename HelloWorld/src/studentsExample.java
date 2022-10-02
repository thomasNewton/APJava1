public class studentsExample {

    public static void main(String[] args) {
       Student3 stu=new Student3();
       stu.display();
       Student4 billy=new Student4(7,"woodrow");
       billy.display();
       Student4 fred=new Student4();
       fred.display();
        
    }
    
}


class Student3{
    int id;
    String name;
    void display(){System.out.println(id+" "+name);}
}

class Student4{
    int id;
    String name;
    
    // constructor--- no return   new is declared whereever object initiated
    Student4(int i,String n){
    id = i;
    name = n;
    }

    // overladed constructor for null values
    Student4(){
        id=-1;
        name ="John Doe";
    }

    void display(){
        System.out.println(id+" "+name);
    }
}
class Demo {  
    //non-static function   
    void display() {  
        System.out.println("\nA non-static function is called.");  
    }  
    //static function  
    static void show() {  
        System.out.println("The static function is called.\n");      
    }
    static void displayVarargs(String... values){  
        System.out.println("Displaying Varargs method ");
        for(String s:values){  
            System.out.println(s);  
        }  
    }  
}

public class SixStaticVarargs {  
    public static void main(String args[]) {  
        //creating an object of the class A  
        Demo obj = new Demo();  

        //calling a the non-static function by using the object of the class  
        obj.display();  
        
        //calling a static function by using the class name  
        Demo.show();  

        Demo.displayVarargs("This","is","Object","Oriented", "Programming");
    }  
}
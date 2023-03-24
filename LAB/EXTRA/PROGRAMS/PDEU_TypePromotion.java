package src;

public class PDEU_TypePromotion {
    void sum(int x, long y) // long will get converted into int on execution
    {  
        System.out.println(x+y);  
    }  
    void sum(int x, int y, int z)  
    {  
        System.out.println(x+y+z);  
    }  
    public static void main(String[] args)  
    {
        PDEU_TypePromotion s = new PDEU_TypePromotion();
        s.sum(40, 40);  
        s.sum(40, 40, 40);
    }  
}  
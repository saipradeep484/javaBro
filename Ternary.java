public class Ternary {
    public static void main(String[] args) {
        boolean result = (55>66)?false:true;
        System.out.println(result);
        Conditional c = new Conditional();
        c.condition();
    }
}
class Conditional{
    void condition()
    {
        int a=9,b=8,c=7;
        if(a>b && a>c)
        System.out.println(a);
        else if(b>a && b>c)
        System.out.println(b);
        else
        System.out.println(c);
    
    }
}
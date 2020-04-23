package w3;

public class Shapes {
    public void metod(){
        System.out.println("Chto-to");
    }
}
 class Shapes1 extends Shapes{
     public void metod(){
         System.out.println("Chto-to tam");
     }
}

class main{
    public static void main(String[] args) {
        Shapes1 d=new Shapes1();
        d.metod();

        Shapes a=new Shapes();
        a.metod();
    }
}

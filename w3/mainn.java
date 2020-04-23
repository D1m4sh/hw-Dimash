package w3;

public class mainn {
    public static void main(String[] args) {
        Problem p=new Problem();

        try {
            p.prob();
        }catch (Exception e){
            System.out.println("You have a mistake");
        }finally {
            System.out.println("test message after exception block");
        }
    }


}

public class TestC implements C {
    public void callA(){
        System.out.println("Call A");
    }
    public void callB(){
        System.out.println("Call B");
    }
    public void callC(){
        System.out.println("Call C");
    }
    public static void main(String[] args){
        TestC c= new TestC();
        c.callA();
        c.callB();
        c.callC();
    }
}

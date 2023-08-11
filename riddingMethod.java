package Data_Structure;

class parent{
    // overriden method
    public void m1(){
        System.out.println("I am m1() in parent class.");
    }
}

class child extends parent{
    // overriding method
    @Override
    public void m1() {
        System.out.println("I am m1() in child class.");
    }
}

public class riddingMethod {
    public static void main(String[] args) {
        child c = new child();
        c.m1();
    }
}

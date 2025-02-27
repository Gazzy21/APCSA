public class Secretary extends Employee{

    public void takeDictation(String text){
        System.out.println("Dictating text:" + text);
    }

    public Secretary() {
        super(0);
    }
}
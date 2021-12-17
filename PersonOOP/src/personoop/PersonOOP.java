package personoop;
public class PersonOOP {
    private final String name;
    private final int age;
    
    public PersonOOP(String initialName) {
        this.name = initialName;
        this.age = 0;
    }
    public void printPerson() {
        System.out.println(this.name + ", age " +   this.age + " years");
    }
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        
    }
    
}
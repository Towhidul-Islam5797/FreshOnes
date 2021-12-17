package inheritance2;
class person {
    private String name;
    private String gender;
    private int age;
    
    public person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getgender() {
        return gender;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public double getage() {
        return age;
    }
    public void setage(String gender) {
        this.age = age;
    }
    
}
class employee extends person {
    private String id;
    private String department;
    private double salary;
    
    public employee(String name, String gender, int age, String id, String department, double salary) {
        super(name, gender, age);
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    public String getId() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }
}
class faculty extends employee {
    private String initial;
    private String rank;

    public faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }
    public String getinitial(){
        return initial;
    }
    public void setinitial(){
        this.initial = initial;
    }
    public String getrank(){
        return rank;
    }
    public void setrank(){
        this.rank = rank;
    }
    
    @Override
        public String toString() {
            return "Faculty{" +
                    "name= '" + getname() + '\'' +
                    " gender= " + getgender() + '\'' +
                    " age= '" + getage() + '\'' +
                    " id= '" + getId() + '\'' +
                    " department= '" + getdepartment() + '\'' +
                    " salary= '" + getsalary() + '\'' +
                    " initial= '" + initial + '\'' +
                    '}';
        }
}
public class Inheritance2 {
    public static void main(String[] args) {
        faculty faculty = new faculty("asdf jlk", "male", 35, "2k3jh432h", "ECE", 115000, "AJK", "A");

        System.out.println(faculty.toString());
    }
    
}

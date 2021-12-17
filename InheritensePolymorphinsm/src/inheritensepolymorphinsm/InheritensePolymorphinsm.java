package inheritensepolymorphinsm;
import java.util.Scanner;
class Plant {
    private String name, color;
    public Plant() {
        this. name = name;
        this.color = color;
    }
    public String getname(String name) {
        return this.name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getcolor(String color) {
        return this.color;
    }
    public void setcolor(String color) {
        this.color = color;
    }

    public String toString(String name, String color) {
        return "Plant {" +
                ", Name = " +name+
                ", Color = " +color+
                "}";
    }
}
class Flower extends Plant {
    private boolean hasSmell, hasThorne;
    public Flower() {
        this.hasSmell = hasSmell;
        this.hasThorne = hasThorne;
    }
    public boolean gethasSmell(boolean hasSmell) {
        return this.hasSmell;
    }
    public void sethasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }
    public boolean gethasThorne(boolean hasThorne) {
        return this.hasThorne;
    }
    public void sethasThorne(boolean hasThorne) {
        this.hasThorne = hasThorne;
    }
    @Override
    public String toString() {
        return "Flower {" + 
                ", Has smell = " +hasSmell+ 
                ", Has thorne = " + hasThorne +
                "}";
    }
}
class Herb extends Plant {
    private boolean isMedicinal;
    private String Season;
    
    public Herb(boolean isMedicinal, String Season) {
        this.isMedicinal = isMedicinal ;
        this.Season = Season;
    }
    public boolean getisMedicinal(boolean isMedicinal) {
        return isMedicinal;
    }
    public void setisMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }
    public String getSeason(String Season) {
        return Season;
    }
    public void setSeason(String Season) {
        this.Season = Season;
    }
    public String toSring() {
        return " Herb {" +
                "Is medicinal = " +isMedicinal+
                "Season = " +Season+
                "}";
    }
}
public class InheritensePolymorphinsm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Plant[] plants = new Plant[10];
        do {
            System.out.println("Select an option: ");
            System.out.println("1 -> Add a plant");
            System.out.println("2 -> Remove a plant");
            System.out.println("3 -> Search a plant");
            System.out.println("4 -> Display a plant");
            System.out.println("0 -> close");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            switch (option) {
            }
        } while (option != 0);

    }

    static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                return;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
    }

    static Plant search(Plant[] plants, String n) {
    }

    static void display(Plant[] plants) {
    }
}

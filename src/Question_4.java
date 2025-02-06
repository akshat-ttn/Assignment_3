import java.util.HashMap;
import java.util.Map;

class Employe {
    String name;
    int age;
    String designation;

    public Employe(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    public String toString() {
        return name;
    }
}
    public class Question_4 {
        public static void main(String[] args) {
            Map<Employe,Double> employees = new HashMap<>();
            employees.put(new Employe("Abhishek Upmanyu",22,"SDE Intern"),15000.0);
            employees.put(new Employe("Anubhav Singh Bassi",26,"SSD"),80000.0);
            employees.put(new Employe("Maheep Singh",58,"Senior DevOps Engineer"),215000.0);
            employees.put(new Employe("Ravi Gupta",30,"Cloud Engineer"),65000.0);

            for(Map.Entry<Employe,Double> entry : employees.entrySet()){
                System.out.println(entry.getKey() + "\nSalary : "+entry.getValue()+"\n");
            }
        }




    }

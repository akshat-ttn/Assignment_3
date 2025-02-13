import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employe {
    String name;
    int age;
    String designation;

    public Employe(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return age == employe.age && Objects.equals(name, employe.name) && Objects.equals(designation, employe.designation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}
    public class Question_4 {
        public void main(String[] args) {
            Map<Employe,Double> employees = new HashMap<>();
            employees.put(new Employe("Abhishek Upmanyu",22,"SDE Intern"),15000.0);
            employees.put(new Employe("Anubhav Singh Bassi",26,"SSD"),80000.0);
            employees.put(new Employe("Maheep Singh",58,"Senior DevOps Engineer"),215000.0);
            employees.put(new Employe("Ravi Gupta",30,"Cloud Engineer"),65000.0);
            employees.put(new Employe("Anubhav Singh Bassi",26,"SSD"),80000.0);


            for(Map.Entry<Employe,Double> entry : employees.entrySet()){
                System.out.println(entry.getKey() + "\nSalary : "+entry.getValue()+"\n");
            }
        }




    }

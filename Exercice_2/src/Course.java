import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students = new ArrayList<Student>();


    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    // ajouter les etudiants
    public  void addStudent(Student student){
        this.students.add(student);
        }
    // suprimer les etudiants
    public void removeStudent(Student student){
        this.students.remove(student);
        }
    //afficher la liste des etudiants
        public void printStudents(){
            for (Student elStudent : students) {
                System.out.println(elStudent);
            }
        
        }

}
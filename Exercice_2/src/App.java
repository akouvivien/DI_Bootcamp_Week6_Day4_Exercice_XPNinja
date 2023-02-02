public class App {
    public static void main(String[] args) throws Exception {
        //creation de l'objet cours
        Course course = new Course("Informatique 101");

        //creation des etudiants
        Student student1 = new Student("John Smith", 20, 3.5);
        Student student2 = new Student("Jane Doe", 21, 3.8);
        Student student3 = new Student("Bob Johnson", 22, 2.5);

        //ajouter tous les etudients a course
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        // afficher la liste des etudiants 
        System.out.println("affichage de la liste des etudiants");
        System.out.println();
        course.printStudents();
        //suppression d'un element
        System.out.println("suprression de l'etudiant John Smith");
        System.out.println();
        course.removeStudent(student3);

        // affichage de la liste des etudiants de nouveau
        System.out.println("affichage apres suppression d'un etudiant");
        System.out.println();
        course.printStudents();

    }
}

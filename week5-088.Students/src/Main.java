
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList();
        boolean check = true;
        String name;
        String studentNumber;
        String search;
        
        while(check){
            System.out.print("name: ");
            name = reader.nextLine();
            
            if(!name.isEmpty()){
                System.out.print("studentnumber: ");
                studentNumber = reader.nextLine();
                
                list.add(new Student(name, studentNumber));
            }
            else{
                check = false;
            }
        }
        
        for(Student student : list){
            System.out.println(student);
        }
        
        System.out.print("Give search term: ");
        search = reader.nextLine();
        
        System.out.println("Result: ");
        for(Student student : list){
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}

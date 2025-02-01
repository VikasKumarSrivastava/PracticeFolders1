package MapInterface.Practice;
//Application of wild cards
import java.util.ArrayList;

class Student{
    void print(){
        System.out.println("Student");
    }
}
class EnggStudent extends Student{
    void print(){
        System.out.println("EnggStudent");
    }
}
class MgmtStudent extends Student{
    void print(){
        System.out.println("MgmtStudent");
    }  
}
public class Main2 {

    static void printStudent(ArrayList<? extends Student> al){
        for(Student s : al){
            s.print();
        }
    }
    public static void main(String[] args) {
        ArrayList<EnggStudent> al1 = new ArrayList<>();
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());
        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        al2.add(new MgmtStudent());
        al2.add(new MgmtStudent());
        printStudent(al1);
        printStudent(al2);
    }
}

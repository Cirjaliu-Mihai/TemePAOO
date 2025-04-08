
import java.util.*;
public class Student{
    int nota;
    String nume;
    Student(int nota,String nume)
    {
        this.nota=nota;
        this.nume=nume;
    }
    public String toString(){
        return nume + " : " + nota;
    }
    
}

/**
 * _04_ArrayOfObject
 */

class Student{
    String name;
    int age;
    char grade;
}

public class _04_ArrayOfObject {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 29;
        s1.grade = 'A';

        Student s2 = new Student();
        s2.name = "Akhilesh";
        s2.age = 27;
        s2.grade = 'A';


        Student s3 = new Student();
        s3.name = "Ragini";
        s3.age = 24;
        s3.grade = 'A';


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for( int i = 0; i < students.length; i++ ){
            System.out.println(students[i].name +"'s age is "+ students[i].age +" and grade is "+students[i].grade);
        } 
    }
}
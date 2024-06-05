import java.util.Scanner;

class student{
    int ro;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    char g;
    int tot;
    int per;
   void getdetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the student id :");
    ro = sc.nextInt();
       System.out.println("Enter the subject 1 :");
       sub1 = sc.nextInt();
       System.out.println("Enter the subject 2 :");
       sub2 = sc.nextInt();
       System.out.println("Enter the subject 3 :");
       sub3 = sc.nextInt();
       System.out.println("Enter the subject 4 :");
       sub4 = sc.nextInt();
       System.out.println("Enter the subject 5 :");
       sub5 = sc.nextInt();
       tot = sub1+sub2+sub3+sub4+sub5;
       per = (tot/5);
    }
    
    void grade(){
        if(per>=90){
            g='S';
        }
        else if(per>=80 && per<90){
            g='A';
        }
        else if(per>=70 && per<80){
            g='B';
        }
        else if(per>=60 && per<70){
            g='C';
        }
        else if(per>=50 && per<60){
            g='D';
        }
        else if(per>=0 && per<50){
            g='F';
        }
       }
    void display(){
        System.out.println("Student Id : " + ro);
        System.out.println("Total Marks :"+ tot);
        System.out.println("Average percentage :"+per);
        System.out.println("Grade : "+g);
    }
    
        
}
public class SGC {
    public static void main(String[] args) {
        student obj = new student();
        obj.getdetails();
        obj.grade();
        obj.display();
        
    }
    
}

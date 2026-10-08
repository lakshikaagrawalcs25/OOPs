import java.util.Scanner;
class Student{
String usn, name;
void accept(){
Scanner sc= new Scanner(System.in);
System.out.print("Enter usn:");
usn=sc.nextLine();
System.out.print("Enter name:");
name=sc.nextLine();
}
void display(){
System.out.print("Student USN"+(usn));
System.out.print("Student name"+(name));
}
}
class StudentRun{
public static void main(String args[]){
int i,n;
Scanner sc=new Scanner (System.in);
System.out.print("Enter no. od students");
n= sc.nextInt();
Student s[]=new Student[n];
for (i=0;i<n;i++){
s[i]=new Student();
s[i].accept();
}
for (i=0;i<n;i++){
s[i].display();}
}
}

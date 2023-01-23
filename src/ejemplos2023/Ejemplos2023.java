package ejemplos2023;

import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       System.out.println("nombre: ");
       String name = read.nextLine();
       System.out.println("edad: ");
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       
       //establece la edad a través de Setter
       if(age>0){
        student.setAge(age);   
       }
else{
           System.out.println("edad no valida");
           student.setAge(0);
       }
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}

class Student {

   public String name;
   private int age;
   
   public int getAge() {
       return age;
       
   }
   public void setAge(int age) {
       //completa Setter
       this.age = age;
       
   }
}
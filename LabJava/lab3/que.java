package LabJava.lab3;


//1. Write a Java program to demonstrate the use of a static variable and a static method in a class to count the number of objects created.

public class que {
    static int count=0;

    public que(){
        count++;
    }
    static int display(){
        return count;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        que q=new que();
        que q1=new que();
        que q2=new que();
        que q3=new que();
        que q4=new que();

        System.out.println("Object created :"+que.display());
    }
}





// // 2)Create a Person superclass and an Employee subclass. Include name, age in Person and employee ID, designation in Employee. Use constructors and super() keyword.

// class person{
//     public String name;
//     public int age;

//     person(String name,int a){
//         this.name=name;
//         this.age=a;
//     }

//     public void display(){
//         System.out.println("Employee id :"+name);
//         System.out.println("Employee Address : "+age);
//     }
// }
// class emp extends person{
//     public String id;
//     public String dis;

//     public emp(String i,String d,String n,int a){
//         super(n,a);
//         this.id=i;
//         this.dis=d;
//     }

//     public void display(){
//         super.display();
//         System.out.println("Employee id :"+id);
//         System.out.println("Employee Address : "+dis);
//     }
// }
// public class que {
    
//     public static void main(String[] args) {
//        emp e=new emp("252ghhdcv", "Abesv ehjjvj", "Sumit", 22);
//        e.display();
//     }
// }



// // 3)Write a Java program to demonstrate the use of a static block and static method.

// public class que {
//     static int count=0;
//     static{
//         count++;
//     }
//     static void display(){
//         System.out.println("Counting :"+count);
//     }
//     public static void main(String[] args) {
//         display();
        
//     }
// }




// // 4)Write a program to demonstrate constructor overloading in Java

// public class que {
//     public que(){
//         System.out.println("helo java");
//     }
//     public void name(String name){
//         System.out.println(name);
//     }
//     public static void main(String[] args) {
//        que q=new que();
//        q.name("Sonu Bhardwaj");
//     }
// }

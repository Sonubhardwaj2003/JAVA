// class copyConPar{
//     String web ;
//     copyConPar(String w){
//         this.web=w;
//     }

//     // copy constructor=
//     copyConPar(copyConPar je){
//         web=je.web;
//     }

//     void display(){
//         System.out.println("Website : "+web);
//     }
// }
// public class copyconst {
//     public static void main(String[] args) {
//         copyConPar c1=new copyConPar("2nd year CSE-D");
//         copyConPar c2=new copyConPar(c1);

//         c1.display();
//         c2.display();
//     }
// }




// // que1.Create a class Book with 3 constructors:
// // 1. Default constructor prints "Book Created".
// // 2. Constructor with 1 parameter (title) that sets the title.
// // 3. Constructor with 2 parameters (title, author) that sets both.
// // Use "constructor chaining" to avoid repeating code.

// class Book{
//     public String title;
//     public String author;

//     public Book(){
//         this("Hlo java!");
//         System.out.println("Book Created");
//     }

//     public Book(String t){
//         this(t,"Sun Macro System");
//     }

//     public Book(String t,String a){
//         this.title=t;
//         this.author=a;
//     }

//     public void display(){
//         System.out.println("Title : "+title);
//         System.out.println("Author : "+author);
//     }
// }
// public class copyconst {
//     public static void main(String[] args) {
//         Book b=new Book();

//         b.display();
//     }
// }




// // que2.Create a class Rectangle with width and height.
// // Use constructor chaining to:
// // - Set default values,
// // - Set width only,
// // - Set both width and height.
// // Display area using a method.
// class Rectangle1{
//     public  int width;
//     public int length;

//     public Rectangle1(){
//         this(10);
//     }

//     public Rectangle1(int bre){
//         this(bre,20);
//     } 

//     public Rectangle1(int bre,int len){
//         this.width=bre;
//         this.length=len;
//     }

//     public int area(){
//         return length*width;
//     }
// }

// public class copyconst {
//     public static void main(String[] args) {
//         Rectangle1 r=new Rectangle1();

//         System.out.println("Area of rectangle is :"+r.area());
//     }
// }



// que3.Create a class Employee with fields: id, name.
//  Include a parameterized constructor and a copy constructor.
// Demonstrate object copying using the copy constructor.
class Emp{
    public String id;
    public String name;

    public Emp(String i,String n){
        this.id=i;
        this.name=n;
    }

    public Emp(Emp e){
        id=e.id;
        name=e.name;
    }

    public void display(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
    }
}
public class copyconst {
    public static void main(String[] args) {
        Emp em=new Emp("252","Sonu bhardwaj");
        Emp em2=new Emp(em);
        em2.display();
    }
}

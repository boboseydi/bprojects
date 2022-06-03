/* originally i had one constructor that executes. 
   i added a second constructor with different number of 
   parameters and created a second object to invoque this secpnd
   constructor.The concept of overloading constructor*/

public class Testconstruct{
 String fname;
 String lname;
 int age;
 String addres;

 public Testconstruct(String firstname, String lastname, int myage){
 fname = firstname;
 lname = lastname;
 age = myage;
 }
 public Testconstruct(String firsname, String lasname, String address, int myagee){
 fname = firsname;
 lname = lasname;
 addres = address;
 age = myagee;
 }
 public static void main(String [] args){
   Testconstruct objectconstruct = new Testconstruct("Bobo", "Diallo", 55);
   Testconstruct object2 = new Testconstruct("Ali", "Sylla", "6325 s lake ct",60);
 
   System.out.println(objectconstruct.fname);
   System.out.println(objectconstruct.lname);
   System.out.println(objectconstruct.age);

   System.out.println("The second employee's name is:");

   System.out.println(object2.fname);
   System.out.println(object2.lname);
   System.out.println(object2.addres);
   System.out.println(object2.age);
  }
}  


/*
outpu:

Bobo
Diallo
55
The second employee's name is:
Ali
Sylla
6325 s lake ct
60

*/

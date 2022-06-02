/* Abstraction

*/

abstract class ImplementAbstraction{
 abstract int multipleCalc();
 abstract int divisionCalc();
 abstract int additionCalc();
 abstract int substractCalc();
 
 public void notAbstract(){
  System.out.println("A Concrete Method");
 }
 public ImplementAbstraction(){
  System.out.println("no-argument constructor");
  } 
}
  
public class AbstractCal extends ImplementAbstraction{
  public void resultDisplay(){
   System.out.println();
   System.out.println("multiplication:"+" "+x1);
   System.out.println("Division:"+" "+x2);
   System.out.println("Addition:"+" "+x3);
   System.out.println("Substraction:"+" "+x4);
  }
  int x;
  int y;
  int x1;
  int x2;
  int x3;
  int x4;
  
  public AbstractCal(int a, int b){
   this.x = a;
   this.y = b;
  }

 public int multipleCalc(){
  x1 = x*y;
  return x1;
 }
 public int divisionCalc(){
  System.out.println("multiplication:"+" "+x1);
  x2 = x/y;
  return x2;
 }

 public int additionCalc(){
  System.out.println("Division:"+" "+x2);
  x3 = x+y;
  return x3;
  }

 public int substractCalc(){
  System.out.println("Addition:"+" "+x3);
  System.out.println("Substraction:"+" "+x4);    
  x4 = x-y;
  return x4;
 }
   
public static void main(String [] args){
   AbstractCal abstractobject = new AbstractCal(2,2);
   abstractobject.multipleCalc();
   abstractobject.divisionCalc();
   abstractobject.additionCalc();
   abstractobject.substractCalc();
   abstractobject.notAbstract();

   abstractobject.resultDisplay();
 }
}


/* 
output:

no-argument constructor
multiplication: 4
Division: 1
Addition: 4
Substraction: 0
A Concrete Method

multiplication: 4
Division: 1
Addition: 4
Substraction: 0
*/
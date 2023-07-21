import java.util.*;
class test1{
    public static void main(String[] args){
      Parentclass p = new Parentclass();
      Childclass q = new Childclass();
      p.pmethod();
      q.cmethod();
      p.pmethod();
    }
  }
class Parentclass{
    public void pmethod(){
      System.out.println("This is parent class");	
    }
  }

  class Childclass extends Parentclass{
    public void cmethod(){
      System.out.println("This is child class");
    }
  }
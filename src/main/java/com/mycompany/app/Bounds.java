package assignment;

public class Bounds<x extends A> {
private x ob;
 public Bounds(x obj)
 {
	 this.ob=obj;
 }
 public String add() {
	 String s=this.ob.add();
	 return s;
 }

}

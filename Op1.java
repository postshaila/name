// about static ,void,public , object creation
package oopss;
import java.util.*;
public class Op1 {
	public  static void hhname(String name) {
    //direct call  public static void no object require
		System.out.println("okyyyi");}
	public int tim(int hh) {   
		return hh;}  // no void use return
		void khan(String kk) {        // only void need object 
		System.out.println( kk);} // void is present use print  
	public static void sayname() {   // if static direct call 
		System.out.println("ok+"); } // if not static create obj
	public static void man (int a) {
		Scanner sc = new Scanner(System.in); //take input     // import java.util.* 
		int k = sc.nextInt(); // create input int
	System.out.println(k);
		sc.close(); }   // close scanner i.e . user input
		public static void main (String [] args) {
		man(50);		
		hhname("all is new");
		sayname();
		//System.out.println( obj.sayname("all"));
		Op1 obj = new Op1();  // object creation
		System.out.println( obj.tim(100));
		obj.khan("stop");}}
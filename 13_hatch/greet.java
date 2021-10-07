/*

Ari Gurovich, Javier

HW 13

10/6/21

Discovery: constructors are similar to methods but are more efficient

Unresolved mystery: I'm still somewhat confused regarding constructors and their function

*/

public class Greet {
        public static void main (String[] args){
		String greeting;
	BigSib richard = new BigSib("Word up");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	BigSib spaceman = new BigSib("Salutation");
	greeting = spaceman.greet("Dr.Spaceman");
	System.out.println(greeting);
	BigSib kong = new BigSib("Hey ya");
	greeting = kong.greet("Kong Foey");
	System.out.println(greeting);
	BigSib mom = new BigSib("Sup");
	greeting = mom.greet("mom");
	System.out.println(greeting);
	}
}

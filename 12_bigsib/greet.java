/*

Ari, John, Eric

APCS HW 12

10/5/21

Discovery: One can assign an instance van using "class varName = new class();"


*/

public class Greet {
        public static void main (String[] args){
		String greeting;
	BigSib richard = new BigSib();
	richard.setHelloMsg("Word up");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	BigSib spaceman = new BigSib();
	spaceman.setHelloMsg("Salutations");
	System.out.println(spaceman.greet("Dr.Spaceman"));
	BigSib kong = new BigSib();
	kong.setHelloMsg("Hey ya");
	System.out.println(kong.greet("Kong Foey"));
	BigSib mom = new BigSib();
	mom.setHelloMsg("Sup");
	System.out.println(mom.greet("mom"));
	}
}

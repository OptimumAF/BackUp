class Main {
	public static void Space(){
		System.out.println("\n");
	}
	public static void Day(){
		System.out.println("Things are going pretty good so far.");
		System.out.println("I finally started doing my college applications.");
		System.out.println("No matter what, stress still finds its way to me.");
		System.out.println("So far I have managed to deal with it easily.");
		System.out.println("So this school year should be a breeze");
		Space();
	}
	public static void Ask(){
		System.out.println("How are you doing so far?");
		System.out.println("I haven't talked to you for a while.");
		System.out.println("Is work going all right and everything?");
		System.out.println("Hopefully I see you some time soon");
		Space();
	}
	public static void Goodbye(){
		System.out.println("Sincerely,");
		System.out.println("	Avery Fernandez");
		Space();
		Space();
	}
	public static void Money(){
		System.out.println("Speaking of things, money isn't doing too well due to COVID.");
		System.out.println("I was wondering if I could borrow some money.");
		System.out.println("All I need is a bit for gas and everything.");
		System.out.println("It would really mean a lot to me!");
		Space();
	}
	public static void Mom(){
		System.out.println("Dear Mom,");
		Space();
		Day();
		System.out.println("I am glad to hear you and Edward are finally getting married!");
		System.out.println("It only took like 8 years haha!");
		System.out.println("It's great to see that you and Edward finally settling down together!");
		System.out.println("Especially since your doing super good at work and Edward's business is doing really good.");
		Space();
		Money();
		Ask();
		Goodbye();
	}
	public static void Dad(){
		System.out.println("Dear Dad,");
		Space();
		Day();
		Money();
		System.out.println("I am glad to hear you finally found someone!");
		System.out.println("I can't wait to meet her, hopefully she treats you well.");
		System.out.println("How did you meet her?");
		System.out.println("Anyway, hopefully she makes you happy.");
		System.out.println("That is all that matters!");
		Space();
		Ask();
		Goodbye();
	}
	public static void Sister(){
		System.out.println("Dear Desiree,");
		Space();
		System.out.println("I heard that you and E finally decided to put a label on it.");
		System.out.println("Honestly, he is a really nice guys, so I am glad.");
		System.out.println("Hopefully, you and E end up together for a good while!");
		Space();
		Day();
		Ask();
		Goodbye();
	}
	public static void main(String[] args) {
		Mom();
		Dad();
		Sister();
  }
}

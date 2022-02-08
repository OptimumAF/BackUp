class Main {
  public static void main(String[] args) {
	  for (int i = 0; i < 6; i++) {
		System.out.println(numberGen(0,50));
		System.out.println(numberGen(0,100));
		System.out.println(numberGen(0,5));
		System.out.println("\n\n----------------------------------------\n\n");
	  } 
    
  }

  public static int numberGen(int max, int min) {
	return (int)Math.floor(Math.random()*(max-min+1)+min);
  }
}
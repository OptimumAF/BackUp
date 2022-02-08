import java.util.Scanner; //input
class Main {
	static Scanner input = new Scanner(System.in); //required for input function
  public static void main(String[] args) 
	{
		System.out.println("\nWrite each method to print a response to the prompts.");
		/* Quarantines due to COVID-19 began in March 2020, 14 months ago. Over the last year, we've all had a wide range of experiences that have changed our perceptions on things and how we value different aspects of our life. Reflect about how your thoughts on different aspects of life have shifted over the last year, if at all. Some areas to think about: school, family, free time, society, politics, time, the past, the future, relationships, friends. Write about any combination of these 
		topics. */
		spacing();
    reflection1();

		/* This past year, everyone has been forced into using technology more than ever before. From using video calls to communicate, to being on the computer all day for school / work. Has your attitude toward technology, your daily use of technology, or the affects of technology on society changed at all throughout all of this? 
		*/
		reflection2();

		/* This was a rough school year for everyone involved, including your teachers and school staff! Luckily, we've made it to the end, vaccinations are on the rise, and next school year should start to feel more familiar. What are your plans for the future? Over this summer, what do you have planned / what would you like to try to do? Are you looking forward to next year, whether it be at Clark, at college, or somewhere else?
		*/
		reflection3();
  }

	public static void reflection1(){
		System.out.print("Do you want to the happy or sad story? ");
		String storyTime = input.nextLine();
		System.out.println("\n");
		if (storyTime.length() > 3) {
			System.out.println("This year has been amazing for meeting new friends. Since I have been stuck at home the whole time, I was able to spend a lot of my time on discord meeting new people. It has been amazing since I talk to many of them on a daily basis and play games with them whenever I have free time. Due to my large amount of free time, I began to branch out my game genres and start playing a lot more RPGs and Roguelikes. So I have been very fortunate to have been able to make so many friends and have a good year.");
		}
		else {
			System.out.println("This year has absolutely been a nightmare.");
			for (int i = 0; i < 10; i++) {
				System.out.print("I hate COVID! ");
			}
			System.out.print(" This year has been filled with drama from my Ex. There hasn't been a single day where I haven't had drama or anxiety or depression until recently. This year has caused me so much pain as COVID made me so unmotivated. Honestly it is a miracle if I even graduate. So this year has been horrible");
		}
		spacing();
	}

	public static void reflection2(){
		System.out.println("Due to being locked behind doors, I have ended up spending 90% of my time awake on my computer. I have been able to keep my entertained with the vast amount of streaming services from Netflix to Disney+ to Hulu. Along with that, my friends have been spending more time playing games and making cool minecraft worlds in our free time. I have kept in contact with all my friends I know in person and also made new friends thanks to communication services like discord. So this year has just pushed me to use technology in every aspect of my dailylife from entertainment to socialization to school and I am thankful for all of it.");
		spacing();
	}

	public static void reflection3(){
		System.out.println(" I am so excited for the future. I get to have an amazing party with all my friends in 2 weeks and have fun with them. I get to spend some time visiting my new college in Alabama with my mom. Then I get to go to my grandparent's ranch and hangout with all my extended family and shoot fireworks for the fourth of July. Then in August I get to celebrate my birthday on a Disney cruise hopefully and then drive 14 hours to start college.");
		spacing();
	}
	public static void spacing(){
		System.out.println("\n");
		System.out.println("--------------------------------------------------------");
		System.out.println("\n");
	}
}
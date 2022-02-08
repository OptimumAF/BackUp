class Main {
    public static void LLStar(){
        L();
        L();
        Star();
    }
    public static void Star(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void L(){
        System.out.println("*****");
    }

    public static void V(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
    
    public static void main(String[] args){
        LLStar();
        LLStar();
        L();
        L();
        V();
        LLStar();
    }
}
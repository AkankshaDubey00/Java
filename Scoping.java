public class Scoping {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        String name="Aman";


        {
             a= 100;
             int c= 99;
             name = "rahul";
             System.out.println(name);

             // values initialized in this block , will remain in block;
        }
        System.out.println(a);
        // System.out.println(c);  // Cannot use outside the block
        System.out.println(name);

    }
    static void random(){
        System.out.println("Hello world");
        // we can't print the another function value in here for example a . It will not be valid
    }
}

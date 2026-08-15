public class overLoading {
    public static void main(String[] args) {
        fun(56);
        fun("Akanksa Dubey");
        int ans =sum(2,3,6);
        System.out.println(ans);
        
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b , int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}

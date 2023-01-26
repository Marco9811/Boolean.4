public class Boolean4 {
    public static void main(String[] args) {

        int a= 1;
        int b= 3;
        int c = a*b;
        int d =c;

        boolean A =(d / c + 2) >= b || !(c + b - c / a == 3); //La risposta è true: True|| !True = True
        System.out.println(A);


        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;

        boolean B =(x * x - y * y / 2 != 12) || !t && f; //La risposta è true: false||true= true. (!t && f)=true
        System.out.println(B);

    }
}

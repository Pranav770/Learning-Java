public class CWH_09_ch2_op_pre {
    public static void main(String[] args){
//        int a = 60*5-34/2;
//        System.out.print(a);
    //Prescedence & Associativity
//        highest precedence goes to * & / .They are then evaluated on the basis of left to right to left associativity
        /*
            =30-34/2
            =30-17
            13
         */
//        int b =60/5-34*2;
         /*
         12-68
         =-56
          */
//        System.out.println(b);
//        a=b=45
//                right to left hoti hai iski
        //Quick Quiz
//        int x =6;
//        int y=1;
//        int k = x * y/2;
//        System.out.println(k);
        int b=1;
        int c=4;
        int a=5;
        int k=b*b -(4*a*c)/(2*a);
        System.out.println(k);
    }
}

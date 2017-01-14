package CoolTasks_1.Task;


public class Ticket {
    public static void main(String[] args) {
        int b = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 999999; i++) {
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                b++;
            }
        }
        System.out.print(System.currentTimeMillis()-start );
        System.out.println(" м.с");
        System.out.println(b);
        //Гамнокод))))))
//        int count = 0;
//        int a0, a1, a2, a3, a4, a5;
//        long t = System.currentTimeMillis();
//        for (a0 = 0; a0 <= 9; a0++) {
//            for (a1 = 0; a1 <= 9; a1++) {
//                for (a2 = 0; a2 <= 9; a2++) {
//                    for (a3 = 0; a3 <= 9; a3++) {
//                        for (a4 = 0; a4 <= 9; a4++) {
//                            for (a5 = 0; a5 <= 9; a5++) {
//
//                                if ((a0 + a1 + a2) == (a3 + a4 + a5)) {
//
////                                    System.out.print(a0);
////                                    System.out.print(a1);
////                                    System.out.print(a2);
////                                    System.out.print(a3);
////                                    System.out.print(a4);
////                                    System.out.print(a5);
////                                    System.out.println("");
//                                    count ++;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//        System.out.println(System.currentTimeMillis()-t);
    }
}

//package BlockChain;
//
//import java.util.Arrays;
//
//public class Driver {
//
//        public static void main(String[] args) {
//    /*
//
//    BlockChain -
//    Block - Hash of Previous Block + Transactions
//    Chained together,
//
//     */
//
//    Transaction transaction1 = new Transaction("Peter",
//            "Sam",100L);
//    Transaction transaction2 = new Transaction("Sam",
//            "Ryan",1000L);
//    Transaction transaction3 = new Transaction("Sam",
//            "Ryan",1000L);
//
//            System.out.println(transaction1.hashCode());
//            System.out.println(transaction2.hashCode());
//            System.out.println(transaction3.hashCode());
//
//    Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
//
//
//
//
//        }
//
//}

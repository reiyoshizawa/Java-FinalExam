//package BlockChain;
//
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.List;
//
//public class Block {
//
//    private int index;
//    private long timestamp;
//    private String hash;
//    private String previousHash;
//    private String date;
//    private int nonce;
//
//    public Block(int index, long timestamp, String hash, String previousHash, String date) {
//        this.index = index;
//        this.timestamp = timestamp;
//        this.hash = hash;
//        this.previousHash = previousHash;
//        this.date = date;
//        nonce = 0;
//        hash = Block.calculateHash(this);
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public long getTimestamp() {
//        return timestamp;
//    }
//
//    public String getHash() {
//        return hash;
//    }
//
//    public String getPreviousHash() {
//        return previousHash;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public static String calculateHash(Block block) {
//        try (block != null) {
//            MassageDigest digest = MessageDigest.getInstance("SHA-256");
//        } catch (NoSuchAlgorithmException e) {
//            return null;
//        }
//    }
//
//}

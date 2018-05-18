package Chapter15;

public class Client {

    public static void main(String[] args) {
//        Chapter15_1.openFile("students/Alex.txt");
//        Chapter15_1.addInfo();
//        Chapter15_1.closeFile();
//        // command+Dでcloseできる
//        Chapter15_1.getFileOrDirectoryInfo();

//        Chapter15_1.openFileToReadInfo("students/Alex.txt");
//        Chapter15_1.readInfo();
//        Chapter15_1.closeFile();

        SequentialFileIO.openFileToWrite();
        SequentialFileIO.writeContent();
        SequentialFileIO.closeFile();
    }

}




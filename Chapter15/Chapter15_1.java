package Chapter15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Chapter15_1 {

    private static Formatter out;
    private static Scanner in;

    // Files, Steams and Object Serialization

    public static void getFileOrDirectoryInfo() {
        // Data stored in variables and arrays in temporary.
        // To store data persistently, computer use files.
        // (Computer store files on secondary storage device. (HDD, SSD, DVD, USB)

        // File Streams - bytes or characters
        // Byte based streams - input and output data in its binary form.
        // Character-based streams - input and output data as a sequence of characters.

        // A Java program opens a file by creating an object and associating a
        // stream of bytes or characters with it.

        // Java creates three stream objects.
        // System.out - standard output (screen)
        // System.in - standard input (keyboard)
        // System.error - standard error, error massages (screen)
        // System class has methods like setIn(), setOut(), setErr()

        // Input and Output (Character-based)
        // - Scanner : get/read input from System.in
        // - Formatter : output any text-based stream (ex. System.out.printf())

        // Path
        // http://
        // absolute path: starts from the root directory
        // (file://) is optional
        // (file://)C:/ (windows)
        // (file://)/   (root)
        // relative path: a path relative to the directory in which the pp

        // URI (Uniform Resource Identifier) URL(UR Locator)

        // Program that takes user input (file name or dir name)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file or directory name: ");
        String name = scan.nextLine();

        // creating a path object based on user input
        Path path = Paths.get(name);

        if (Files.exists(path)) {
            System.out.printf("%s exists%n" ,path.getFileName());
            System.out.printf("%s a directory%n" , Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
            try {
                System.out.printf("Last modified %s%n", Files.getLastModifiedTime(path));
                System.out.printf("Size: %s%n", Files.size(path));
                System.out.printf("Path: %s%n", path);
                System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            } catch (IOException e) {
                e.printStackTrace();
            }
            if (Files.isDirectory(path)) {
                try {
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                    for (Path p : directoryStream) {
                        System.out.println(p);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.printf("%s does not exist%n", path);
        }
    }

    public static void openFile(String filename) {
        try {
            out = new Formatter(filename); // open the file

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1); // terminates the program
        }
    }

    public static void addInfo() {
        // 1. get input(info) from user console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some information about this student: ");

        while (scan.hasNext()) {
            try {
                out.format("%s%n", scan.nextLine());
            } catch (FormatterClosedException e) {
                System.out.println("Error writing to file. Terminating...");
                break;
            }
        }
    }

    public static void openFileToReadInfo(String path) {
        try {
            in = new Scanner(Paths.get(path));

        } catch (IOException e) {
            System.out.println("Error opening file, Terminating...");
            System.exit(1);
        }
    }

    public static void readInfo() {
        try {
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (IllegalStateException e) {
            System.out.println("Error reading from file. Terminating...");
        }
    }

    public static void closeFile() {
        if (out != null) {
            out.close();
        }

        if (in != null) {
            in.close();
        }
    }

}

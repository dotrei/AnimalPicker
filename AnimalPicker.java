import java.util.Scanner;
public class AnimalPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String in = input.nextLine().toUpperCase();
        if (in == "cat") {
            System.out.println("      |\\      _,,,---,,_\r\n" + //
                                "ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + //
                                "     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + //
                                "    '---''(_/--'  `-'\\_)  Felix Lee ");
        } else if (in == "dog")  {
            System.out.println("  .\r\n" + //
                                " ..^____/\r\n" + //
                                "`-. ___ )\r\n" + //
                                "  ||  || mh");
        } else if (in == "fish") {
            System.out.println("|\\   \\\\\\\\__     o\r\n" + //
                                "| \\_/    o \\    o \r\n" + //
                                "> _   (( <_  oo  \r\n" + //
                                "| / \\__+___/      \r\n" + //
                                "|/     |/");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
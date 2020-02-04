package braille;

import java.util.Scanner;

public class braille {
    static void place(String str, String[] bri, String[] bri2, String[] briA, String[] briL){
        int n;
        int i;
        n = 0;
        while (n < 3) {
            i = 0;
            while (i < str.length()) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    if (n == 0) {
                        System.out.print(bri[str.charAt(i) - 65]);   
                    }else if (n == 1){
                        System.out.print(bri2[str.charAt(i) - 65]);
                    }else {
                        System.out.print(briA[str.charAt(i) - 65]);
                    }
                }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    if (n == 0) {
                        System.out.print(bri[str.charAt(i) - 97]);   
                    }else if (n == 1){
                        System.out.print(bri2[str.charAt(i) - 97]);
                    }else {
                        System.out.print(briL[str.charAt(i) - 97]);
                    } 
                }else if (str.charAt(i) == ' ' || str.charAt(i) == '\t') {
                    System.out.print('|'); 
                }
                if (i + 1 < str.length()) {
                    System.out.print("|");
                }
                i++;
            }
            System.out.print("\n");
            n++;
        }
    }
  public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter word or sentence(press enter with blank field to exit):");
    while (myObj.hasNextLine()){

    int i = 0;
    int j = 0;
    String[] bri = {"*  ","** ","***","***","***","***","***","***"," * "," **"," **"," **"," **", " **", "  *", "  *", "  *", "  *", "  *", "* *", "  *", "  *", "* *", "* *", " * "};
    String[] bri2 = {"   ","   ","   ","*  ","** ","***","***","***","*  ","*  ","** ","***","***", "***", "*  ", "** ", "***", "***", "***", "   ", "   ", " * ", " * ", " * ", " * "};
    String[] briA = {"   ","   ","   ","   ","   ","   ","*  ","** ","   ","   ","   ","   ","*  ", "** ", "   ", "   ", "   ", "*  ", "** ", "*  ", "*  ", "*  ", " * ", "   ", "*  "};
    String[] briL = {"  *","  *","  *","  *","  *","  *","* *","***","  *","  *","  *","  *","* *", "***", "  *", "  *", "  *", "* *", "***", "* *", "* *", "* *", " **", "  *", "* *"};
    String str = myObj.nextLine();

    if (str.equals("")) {
        myObj.close();
        break;
    }
    
    while (i < str.length()) {
        if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) == ' ' || str.charAt(i) == '\t')) {
            i++;
        }else {
            j = 1;
            i++;    
        }
    }

    if (j == 1) {
        System.out.println("Non usable character detected: Please only use Alphabetical characters");
    }else {
        place( str, bri, bri2, briA, briL);
    }
    System.out.println("Enter word or sentence(press enter with blank field to exit):");
  }
}
}
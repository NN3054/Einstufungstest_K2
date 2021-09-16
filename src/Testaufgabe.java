/**
 * @author nn
 */
public class Testaufgabe {
    public static void main(String[] args) {

        String test = "Teststring_Einstufungstest";

        //region MyMultiplier
        short result = (short)myMult(3, 7);
        int myResSum1 = myMult(21 , 4);
        int myResSum2 = myMult(2, 3500);

        System.out.println("MyMult output:");
        System.out.println(result);
        System.out.println(myResSum1);
        System.out.println(myResSum2);
        System.out.println("------");
        //endregion

        //region GetThird
        String myResString1 = getThird("toss", "a", "coin");
        String myResString2 = getThird("Teststring", "bleibt", test.substring(0, 10));
        String myResString3 = getThird("EP1", "EP1", "EP1");

        System.out.println("GetThird output:");
        System.out.println(myResString1);
        System.out.println(myResString2);
        System.out.println(myResString3);
        System.out.println("------");
        //endregion

        //region replaceNthChar
        String resText1 = replaceNthChar(test, 1, '0');
        String resText2 = replaceNthChar(test, 3, '#');
        String resText3 = replaceNthChar(test, 10, '-');
        String resText4 = replaceNthChar(test, 30, 'X');

        System.out.println("ReplaceNthChar output:");
        System.out.println(resText1);
        System.out.println(resText2);
        System.out.println(resText3);
        System.out.println(resText4);
        System.out.println("------");
        //endregion

        //region PrintPattern
        System.out.println("PrintPattern output:");
        printPattern(3, '*');
        printPattern(5, '+');
        //endregion
    }

    public static int myMult(int x, int y) {

        if (x <= 0 || y <= 0) {
            throw new RuntimeException("Wrong input");
        }

        int result = 0;

        for (int i = 1; i <= y; i++) {
            result = result + x;
        }
        return result;
    }

    public static String getThird(String a, String b, String c) {

        String resString;

        int aEqualsC = a.compareTo(c);
        int aEqualsB = a.compareTo(b);
        int bEqualsC = b.compareTo(c);

        if (aEqualsB == 0 && aEqualsC == 0) {
            resString = "alle gleich";
        } else if (aEqualsB == 0 && aEqualsC != 0) {
            resString = c;
        } else if (aEqualsC == 0 && aEqualsB != 0) {
            resString = b;
        } else if (bEqualsC == 0 && aEqualsB != 0) {
            resString = a;
        } else {
            resString = "alle unterschiedlich";
        }

        return resString;
    }

    public static String replaceNthChar(String text, int n, char replaceChar) {

        int strLength = text.length() - 1;
        int nInStrLength = strLength / n;

        int boundInt = n;

        char[] charText = text.toCharArray();

        for (int i = 1; i <= nInStrLength; i++) {

            charText[n] = replaceChar;

            n += boundInt;
        }

        String resText = String.valueOf(charText);

        return resText;
    }

    public static void printPattern(int n, char character) {

        String charString = String.valueOf(character);
        String emptySpace = " ";

        int iterator = n;
        int emptySpaceIterator = 1;

        for (int i = 1; i <= n; i++) {

            String iteratedContent = charString.repeat(iterator);

            if (i == 1) {
                System.out.print(iteratedContent + "\n");
            } else {
                String iteratedEmpty = emptySpace.repeat(emptySpaceIterator);
                emptySpaceIterator++;
                System.out.print(iteratedEmpty + iteratedContent + "\n");
            }
            iterator += 1;
        }
    }
}

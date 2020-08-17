package text_statistics;

public class TextStatistics {
    public static int countCharsWithSpaces(String fromUser){
        int count = 0;
        for (int i = 0; i < fromUser.length(); i++) {
            if (Character.isLetter(fromUser.charAt(i)))
                count++;
            if (!Character.isLetter(fromUser.charAt(i)))
                count++;
        }
        return count;
    }
    public static int countCharsWithoutSpaces(String fromUser){
        int count = 0;
        for(int i = 0; i < fromUser.length(); i++) {
            if(fromUser.charAt(i) != ' ')
                count++;
        }

        return count;
    }
    public static int countWords(String fromUser) {
        if (fromUser == null || fromUser.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = fromUser.length() - 1;
        char[] characters = fromUser.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
    public static void printValuesOfTextStatistics (String fromUser){
        System.out.println("ilość znaków ze spacjami wynosi: " + countCharsWithSpaces(fromUser));
        System.out.println("ilość znaków bez spacji wynosi: " + countCharsWithoutSpaces(fromUser));
        System.out.println("ilość słów wynosi: " + countWords(fromUser));
    }
    public static boolean palindromeTest (String fromUser){
        int length = fromUser.length();
        StringBuilder reverse = new StringBuilder();
        for (int i = length - 1; i >= 0; i--)

            reverse.append(fromUser.charAt(i));

        if (fromUser.equals(reverse.toString())){
            System.out.println("Tak to palindrom");
            return true;
        }
        else{
            System.out.println("Nie. Wprowadzony tekst nie jest palindromem");
            return false;
        }

    }
}

// Циклы
// 2. Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками.
//https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/stroki

package intech;

public class CyclesIIStrings {
    public static void main(String[] args) {
        String str1 = new String("Safin Eduard Albertovich de costa-brava cortez");
        String str2 = "Сафин Эдуард Альбертович";
        String str3 = "САфин Эдуард Альбертович";
        String str4 = " Сафин Эдуард Альбертович ";
        System.out.println(str2);
        System.out.println(str2.charAt(7));
        System.out.println(str1.codePointAt(0)); // number in Unicode corresponding to the symbol S
        System.out.println(str2.compareTo(str3)); // characters are subtracted. If they're the same, equals zero
        System.out.println(str2.compareToIgnoreCase(str3)); // the same but cases (lower/upper) ignored. Must be zero in our case
        System.out.println(str2.concat(str1)); // str2+str1
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65)); // returns the corresponding Unicode index number of the letter of the String, starting from first letter (e.g. letter A equals to 65, letter number in 'str1' is 13, counting from 0)
        System.out.println(str1.isEmpty()); // returns true if the selected String is empty
        System.out.println(str3.length()); // returns the length of characters of the selected String

        String [] strings = str1.split("a"); // splits our String for different strings without the selected separator (e.g. the symbol 'a')
        for (String element: strings) {
            System.out.println(element);
        }
        System.out.println(str2.substring(8, 15)); // returns only characters (letters) of the selected String between indexes numbers 8 and 15, not including the 15th character (characters count starts from 0)

        char [] charArray = str2.toCharArray(); // returns out selected String split into symbols separately
        for (char element: charArray){
            System.out.println(element);
        }
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str4);
        System.out.println(str4.trim()); // cuts spaces in the beginning & in the end of the line
        System.out.println(String.valueOf(34444003));
        String str5 = String.valueOf(44);
        System.out.println(str5);
        String str6 = "44";
        System.out.println(str6); // Question: what's the difference of displayed characters: str5 and str6?

        char[] str7 = new char[7];

        try {
            str1.getChars(2, 9, str7, 0); // The method copies values from the selected String into str7 starting from index 2 (letter 3) till index 8 included
            System.out.print("Скопированное значение: " );
            System.out.println(str7);

        } catch (Exception ex) {
            System.out.println("Возникает исключение...");
        }
        String str8 = "Сравнение строк";
        String str9 = new String("Сравнение строк");
        String str10 = new String("СравНение сТрок");
        System.out.println(str8.equals(str9));
        System.out.println(str9.equalsIgnoreCase(str10));

        System.out.print("Starts with: " );
        System.out.println(str9.startsWith("Сравнение") );
        System.out.print("Starts with: " );
        System.out.println(str9.startsWith("строк") );
        System.out.print("Starts with: " );
        System.out.println(str9.startsWith("строк", 10) );

        System.out.print("Ends with: " );
        System.out.println(str9.endsWith("Сравнение") );
        System.out.print("Ends with: " );
        System.out.println(str9.endsWith("строк") );

        boolean endswith;
        endswith = str8.endsWith("Сравнение");
        System.out.println("2|Ends with: " + endswith);
        endswith = str8.endsWith("строк");
        System.out.println("2|Ends with: " + endswith);

        String str11 = "заменяемый еще тест";
        str11 = str11.replace("заменяемый","замененный"); // = "прошел еще тест"
        System.out.println(str11);

        String str12 = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str12.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str12.contains("Example"));
        //String contains method is case sensitive
        System.out.println("Contains sequence 'example': " + str12.contains("example"));
        System.out.println("Contains sequence 'is String': " + str12.contains("is String"));
    }
}
package Sem2_hw.task1;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
import java.io.*;
import java.util.*;

public class programm {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter path of file: ");
        // System.out.println();
        // String path = iScanner.next().toString();

        String path = "Sem2_hw/task1/file.json";
        String headOfSqlQuere = "SELECT * FROM students WHERE";
        String pars = readJSONFile(path);

        if (pars.substring(0, 13).equals("Ошибка чтения")) {
            System.out.println(pars.substring(14));
        } else {
            System.out.printf("SQL Quere: \n %s %s;", headOfSqlQuere, convertJsonToSql(pars));
        }
        // iScanner.close();
    }

    public static String readJSONFile(String tmp) {
        try (FileReader fr = new FileReader(tmp)) {
            StringBuilder resultStr = new StringBuilder();
            int count;
            while ((count = fr.read()) != -1) {
                resultStr.append((char) count);
            }
            return resultStr.toString();
        } catch (IOException ex) {
            String message1 = "Ошибка чтения" + "\n" + ex.getMessage();
            return message1;
        }
    }

    public static String convertJsonToSql(String tmp) {
        tmp = tmp.replaceAll("\\,\\s\"[a-zA-Z]*\":\"null\"", "");
        tmp = tmp.replaceAll("\":",":");
        tmp = tmp.replaceAll(",\\s\"",", ");
        int tmpLength = tmp.length();
        StringBuilder tmpSql = new StringBuilder();
        for (int i = 0; i < tmpLength; i++) {
            if (tmp.charAt(i) == ':') {
                tmpSql.append("=");
            } else if ((tmp.charAt(i) == '{') || (tmp.charAt(i) == '}')) {
                tmpSql.append("");
            } 
            else if (tmp.charAt(i) == '\"'){
                tmpSql.append("'");
            }else {
                tmpSql.append(tmp.charAt(i));
            }
        }
        tmpSql = tmpSql.replace(0, 1, "");
        return tmpSql.toString();
    }
}

package Seminars.Home_work;
/*В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */
public class HW2_001 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        input = input.substring(1, input.length() - 1);
        // System.out.println(input);
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM student WHERE ");

        String[] parts = input.split(", ");
        boolean isFirst =true;
        for (String part : parts) {
            // System.out.println(part);
            String[] keyValue = part.split(":");
            String key =keyValue[0];
            key = key.substring(1, key.length() - 1); 
            String value =keyValue[1];
            // System.out.println(key); 
            // System.out.println(value);
            
            if (value.equals ("\"null\""))
            continue;

            if (isFirst) 
                builder.append("&");
            builder.append(String.format("%s = %s", key, value));
            isFirst = false;
        }
        builder.append(";");

        System.out.println(builder.toString());
    }
    
}

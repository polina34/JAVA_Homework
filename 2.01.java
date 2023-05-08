// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import org.json.JSONObject;

class SqlQueryBuilder {
    
    public static void main(String[] args) {
        String filterJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filter = new JSONObject(filterJson);
        StringBuilder whereClause = new StringBuilder("select * from students where ");
        if (filter.has("name") && !filter.isNull("name")) {
            whereClause.append("name='" + filter.getString("name") + "' and ");
        }
        if (filter.has("country") && !filter.isNull("country")) {
            whereClause.append("country='" + filter.getString("country") + "' and ");
        }
        if (filter.has("city") && !filter.isNull("city")) {
            whereClause.append("city='" + filter.getString("city") + "' and ");
        }
        if (filter.has("age") && !filter.isNull("age")) {
            whereClause.append("age=" + filter.getInt("age") + " and ");
        }
        
        whereClause.setLength(whereClause.length() - 5);
        System.out.println(whereClause.toString());
    }
}
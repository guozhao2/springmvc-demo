import com.cat.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {
        String json = "[{\"name\":\"王晓红\",\"sex\":\"男\",\"age\":13},{\"name\":\"王晓绿\",\"sex\":\"女\",\"age\":14},{\"name\":\"王晓蓝\",\"sex\":\"男\",\"age\":16}]";
        ObjectMapper mapper = new ObjectMapper();

//        // json 转数组对象
//        Person[] person = mapper.readValue(json,Person[].class);
//        for(Person person1:person)
//            System.out.println(person1);

        // json 转List对象
        List<Person> person2 =  Arrays.asList(mapper.readValue(json,Person[].class));
        System.out.println(person2);
    }
}

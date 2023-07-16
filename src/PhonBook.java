import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhonBook {
    Map<String, List<String>> phonBook = new HashMap<>();

    void addBook(String name, String num){
        if (phonBook.containsKey(name)){
            List<String> list = phonBook.get(name);
            list.add(num);
        } else {
            List<String> list = new ArrayList<>();
            list.add(num);
            phonBook.put(name, list);
        }
    }

    String printPhonBook(String nameInput){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: phonBook.entrySet()){
            String name = entry.getKey();
            String num = entry.getValue().toString();
            if (name.equals(nameInput)){
                stringBuilder.append(name);
                stringBuilder.append(" | ");
                stringBuilder.append(num);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}

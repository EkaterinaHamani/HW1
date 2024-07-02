import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class PhoneBook {
    private Map<String, List<String>> phoneBookHm = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (phoneBookHm.containsKey(surname)) {
            phoneNumberList = phoneBookHm.get(surname);
            phoneNumberList.add(phoneNumber);
            phoneBookHm.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phoneBookHm.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return phoneBookHm.get(surname);
    }


}
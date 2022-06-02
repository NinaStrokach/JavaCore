package HW4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneList {
    private HashMap<String, HashSet<String>> phoneList = new HashMap<>();
    public void addElementPhoneList(String name, String phone) {
        HashSet<String> phones;
        if (phoneList.containsKey(name)){
            phones = phoneList.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll("1", ""));
        phoneList.put(name,phones);
    }

    public Set<String> getPhoneByName (String name) {return phoneList.get(name);}
}

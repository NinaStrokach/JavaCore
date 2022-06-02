package HW4;

import java.util.HashMap;
import java.util.Map;

public class AddArray {
    private String[] arrayAdd;

    public AddArray(String[] arrayAdd) {
        this.arrayAdd = arrayAdd;
    }

    public void doArrayAdd() {
        HashMap<String, Integer> mapAdd = getMapAdd(arrayAdd);
        for (Map.Entry entry : mapAdd.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapAdd(String[] arrayAdd) {
        HashMap<String, Integer> mapAdd = new HashMap<>();
        for (int i = 0; i < arrayAdd.length; i++) {
            if (mapAdd.containsKey(arrayAdd[i])) {
                mapAdd.put(arrayAdd[i], mapAdd.get(arrayAdd[i]) + 1);
            } else {
                mapAdd.put(arrayAdd[i], 1);
            }
        }
        return mapAdd;
    }
}

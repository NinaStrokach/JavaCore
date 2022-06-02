package HW4;

public class main {
    public static void main(String[] args) {
        doPhone();
        AddArray addArray = new AddArray(createArrayAdd());
        addArray.doArrayAdd();
    }

    private static void doPhone() {
        PhoneList phone = new PhoneList();
        phone.addElementPhoneList("Anthony", "34534534568");
        phone.addElementPhoneList("Anthony", "56543567899");
        phone.addElementPhoneList("Anthony", "97754456788");
        phone.addElementPhoneList("Mike", "98775544333");

        phone.addElementPhoneList("Greg", "989898");
        phone.addElementPhoneList("Greg", "989898");
        phone.addElementPhoneList("Greg", "9898981");
        phone.addElementPhoneList("Greg", "98981918");
        phone.addElementPhoneList("Greg", "91898198");
        phone.addElementPhoneList("Greg", "9181981918");


        System.out.println("Antony: " + phone.getPhoneByName("Anthony"));
        System.out.println("Greg: " +  phone.getPhoneByName("Greg"));
        System.out.println("Mike: " +  phone.getPhoneByName("Mike"));
        System.out.println("Judy: " +  phone.getPhoneByName("Judy"));
    }
    private static String[] createArrayAdd(){
            String [] strings = new String[10];
            strings[0] = "user";
            strings[1] = "user_a";
            strings[2] = "user_b";
            strings[3] = "user_c";
            strings[4] = "user_d";
            strings[5] = "user_b";
            strings[6] = "user_a";
            strings[7] = "user";
            strings[8] = "user_f";
            strings[9] = "user_g";
            return strings;
        }
    }

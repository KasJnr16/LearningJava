package collectionAPI;

import java.util.*;

public class DemoCollection {

    public static void main(String[] a){

        List<String> names = new ArrayList<>();
        names.add("Kassim");
        names.add("Innocent");
        names.add("Junior");
        names.add("Abdulai");
        names.add("Franka");
        names.add("David");

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else
                    return -1;
            }
        };



        names.sort(com);
        System.out.println(names);

        //not sorted by default
        Set<Integer> nums1 = new HashSet<>();
        nums1.add(26);
        nums1.add(34);
        nums1.add(82);
        nums1.add(70);
        nums1.add(41);

        System.out.println(nums1);

        Map<String, Integer> students = new HashMap<>();
        students.put("Kassim", 98);
        students.put("Innocent", 87);

        System.out.println(students);
        System.out.println(students.get("Kassim"));


    }
}

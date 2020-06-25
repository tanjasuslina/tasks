package task.collections;

import java.util.*;

public class MyCollectionsTask {

    public List<User> commonInLists(List<User> list1, List<User> list2) {
        list1.retainAll(list2);
        return list1;
    }

    public Set<User> commonInSets(Set<User> set1, Set<User> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public void printArrayList() {
        List<User> list1 = new ArrayList<User>(Arrays.asList(
                new User(2, "A"), new User(1, "A"), new User(2, "A")));

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + ": " + list1.get(i));
        }
    }

    public void printHashSet() {
        Set<User> set1 = new HashSet<User>(Arrays.asList(
                new User(2, "A"), new User(1, "A"), new User(2, "A")));

        for (User u : set1)
            System.out.println(u);
    }

    public void printHashMap() {
        User b2 = new User(2, "B");
        User a1 = new User(1, "A");

        Map<String, User> map1 = new HashMap<String, User>();
        map1.put(a1.getName(), a1);
        map1.put(b2.getName(), b2);
        map1.put(a1.getName(), a1);
        map1.put("C", b2);

        for (User u : map1.values())
            System.out.println(u);

        for (String key : map1.keySet())
            System.out.println(key + ": " + map1.get(key));

        for (Map.Entry<String, User> pair : map1.entrySet())
            System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}

package task.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestsData {

    public static void main(String[] args) {
        MyCollectionsTask mct = new MyCollectionsTask();

        mct.printArrayList();
        mct.printHashSet();
        mct.printHashMap();

        User a1 = new User(1, "A");
        List<User> list1 = new ArrayList<User>(Arrays.asList(
                a1, new User(2, "A"), new User(1, "A"), a1));

        List<User> list2 = new ArrayList<User>(Arrays.asList(
                a1, new User(2, "A")));

        List<User> commonList = mct.commonInLists(list1, list2);
        System.out.println(commonList.stream().map(u -> u.toString()).reduce((acc, usr) -> acc += usr).orElse(""));
    }
}

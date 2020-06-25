package task.collections;

public class User {

    private final int age;
    private final String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "U{" + age + name + '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof User) {
            User u = (User) other;
            if (u.name == null) {
                if (name != null)
                    return false;
            } else {
                if (!u.name.equals(name))
                    return false;
            }

            if (u.age != age)
                return false;

            return true;
        }
        return false;
    }
}

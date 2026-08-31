import java.util.List;

public class EjercicioPres3 {
    public static class User {
        private String id;
        private String name;
        private int age;
        private boolean active;

        public User(String id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public boolean isActive() { return active; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("1", "Carlos", 25, true),
                new User("2", "Ana", 22, false),
                new User("3", "Beatriz", 20, true)
        );


        List<String> result = users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println(result);
    }
}
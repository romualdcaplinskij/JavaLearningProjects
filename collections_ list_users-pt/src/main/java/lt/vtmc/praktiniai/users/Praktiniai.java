package lt.vtmc.praktiniai.users;

import java.util.*;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int countOlder = 0;
        for (User user : users) {
            if (user.getAge() > 25) countOlder++;
        }
        return countOlder;
    }

    public static double getAverageAge(List<User> users) {
        return (double) sumAge(users) / users.size();
    }

    public static Object getMinAge(List<User> users) {
        int minAge = users.get(0).getAge();
        for (User user: users) {
            if (minAge > user.getAge())
                minAge = user.getAge();
        }
        return minAge;
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (Objects.equals(name, user.getName())) return user;
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        List<User> sortedList = new ArrayList<>(users);
        sortedList.sort(Comparator.comparingInt(User::getAge));
        return sortedList;
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        int ageSum = 0;
        for (User user : users) {
            ageSum += user.getAge();
        }
        return ageSum;
    }
}

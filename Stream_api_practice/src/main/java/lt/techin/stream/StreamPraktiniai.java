package lt.techin.stream;


import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {


    public static List<Integer> returnSquareRoot(List<Integer> numbers){
        return numbers.stream().mapToInt(value -> (int) Math.sqrt(value)).boxed().toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        return users.stream().map(user -> user.getAge()).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream().map(user -> user.getAge()).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users){
        return Math.toIntExact(users.stream().filter(user -> user.getAge() > 25).count());
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream().map(s -> s.toUpperCase()).toList();
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream().reduce(0, (a, b) -> a + b);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream().map(s -> s.split(" ")[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names){
        return names.stream().flatMapToInt(String -> String.chars()).distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream().map(user -> user.getName()).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users){
        return users.stream().mapToDouble(user -> user.getAge()).average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users){
        return users.stream().mapToInt(user -> user.getAge()).max().getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(user -> user.getAge()).min().getAsInt();
    }

    public static boolean anyMatch(List<User> users, int age){
//        throw new UnsupportedOperationException("Not implemented");
        return users.stream().anyMatch(user -> user.getAge().equals(age));
    }

    public static boolean noneMatch(List<User> users, int age){
        return users.stream().noneMatch(user -> user.getAge().equals(age));
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream().sorted(Comparator.comparing(user -> user.getAge())).collect(Collectors.toList());
    }


    public static Stream<Integer> getBoxedStream(IntStream stream){
        return Arrays.stream(stream.toArray()).boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        return IntStream.iterate(2, i -> i+1).filter(number -> number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(divisor -> number % divisor == 0)).limit(10).boxed().collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        return Stream.generate(() -> new Random().nextInt()).limit(10).collect(Collectors.toList());
    }

    public static User findOldest(List<User> users){
        return users.stream().max(Comparator.comparing(User::getAge)).orElse(null);
    }

    public static int sumAge(List<User> users){
        return users.stream().map(user -> user.getAge()).reduce((a,b) -> a + b).orElse(0);
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        return users.stream().collect(Collectors.partitioningBy(user -> user.isMale()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){

        return users.stream().collect(Collectors.groupingBy(user -> user.getAge()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream().collect(Collectors.groupingBy(user -> user.isMale(), Collectors.groupingBy(person -> person.getAge())));
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream().collect(Collectors.groupingBy(user -> user.isMale(), Collectors.counting()));
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        return users.stream().mapToInt(user -> user.getAge()).summaryStatistics();
    }

}

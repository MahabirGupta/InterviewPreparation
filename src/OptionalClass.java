import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
//        Optional.of(value): Creates an Optional with the specified non-null value. If the value is null, it throws a NullPointerException.
        Optional<String> optional = java.util.Optional.of("Hello");
        System.out.println(optional);

//        Optional.ofNullable(value): Creates an Optional with the specified value, which can be null. If the value is null, it returns an empty Optional.
        Optional<String> optional1 = java.util.Optional.ofNullable(null); // Creates an empty Optional
        System.out.println(optional1);

//        Optional.empty(): Creates an empty Optional, representing a missing value.
        Optional<String> emptyOptional = java.util.Optional.empty();
        System.out.println(emptyOptional);

//        isPresent(): Returns true if the value is present, otherwise false.
        Optional<String> optional2 = java.util.Optional.of("Hello");
        if (optional2.isPresent()) {
            System.out.println(optional2.get()); // Output: Hello
        }

//        ifPresent(Consumer<? super T> action): Executes the given action if the value is present.
        optional.ifPresent(value -> System.out.println(value)); // Output: Hello

//        get(): Returns the value if present, otherwise throws NoSuchElementException. It’s generally better to avoid using this method and use safer alternatives like orElse() or orElseThrow().
        String value = optional.get();
        System.out.println(value);

//        String value1 = optional1.get();
//        System.out.println(value1);

//        orElse(T other): Returns the value if present, otherwise returns the specified default value.
        String value2 = optional.orElse("Default Value");
        System.out.println(value2); // Output: Hello

//        orElseGet(Supplier<? extends T> other): Returns the value if present, otherwise invokes the provided Supplier and returns the result.
        String value3 = optional.orElseGet(() -> "Generated Value");
        System.out.println(value3);

//        orElseThrow(Supplier<? extends X> exceptionSupplier): Returns the value if present, otherwise throws an exception created by the provided Supplier.
        String valu4 = optional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        System.out.println(valu4);

//        map(Function<? super T, ? extends U> mapper): If a value is present, applies the provided mapping function to it and returns an Optional describing the result. If no value is present, returns an empty Optional.
        Optional<String> upperCaseOptional = optional.map(String::toUpperCase);
        upperCaseOptional.ifPresent(System.out::println); // Output: HELLO

//        flatMap(Function<? super T, Optional<U>> mapper): Similar to map(), but the mapping function must return an Optional
        Optional<Integer> lengthOptional = optional.flatMap(value5 -> java.util.Optional.of(value.length()));
        System.out.println(lengthOptional);
    }
//    Consider a method that may return a User object, or null if the user is not found:
//    public Optional<User> findUserById(String userId) {
//        Object database = new Object();
//        User user = database.findUser(userId);
//        return Optional.ofNullable(user);
//    }
//
////    Using Optional, you can handle the absence of a user more gracefully:
//Optional<User> userOptional = findUserById("123");
//
//userOptional.ifPresent(user -> System.out.println("User found: " + user.getName()));
//
//    User user = userOptional.orElse(new User("default", "Default User"));
//
//    User user = userOptional.orElseThrow(() -> new UserNotFoundException("User not found"));


}

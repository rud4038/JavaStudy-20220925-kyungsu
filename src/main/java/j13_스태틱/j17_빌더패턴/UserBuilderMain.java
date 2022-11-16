package j13_스태틱.j17_빌더패턴;

public class UserBuilderMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .password("1234")
                .username("kyungsu")
                .name("경수")
                .build();

        System.out.println(user);
    }
}

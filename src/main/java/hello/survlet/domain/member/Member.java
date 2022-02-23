package hello.survlet.domain.member;


import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StreamUtils;

@Getter @Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member( String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Member() {
    }

}

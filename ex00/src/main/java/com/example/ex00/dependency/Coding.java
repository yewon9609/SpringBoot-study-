package com.example.ex00.dependency;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
//@ToString
//@Getter
//@AllArgsConstructor 전체필드를 초기화하는 생성자를 선언한다.
@RequiredArgsConstructor    //final또는 @NonNull이 붙은 필드만 초기화 생성자로 선언한다.
public class Coding {
//    필드 주입
//    굉장히 편하게 주입할 수 있으나 순환 참조(무한 루프) 시 오류가 발생 하지 않기 때문에 StackOverFlow 발생.
//    final 을 붙일 수 없기 때문에 다른 곳에서 변형 가능



//    @Autowired
    private final Computer computer;

//    setter 주입
//    굉장히 편하게 주입할 수 있으나 순환 참조(무한 루프) 시 오류가 발생 하지 않기 때문에 StackOverFlow 발생.
//    final 을 붙일 수 없기 때문에 다른 곳에서 변형 가능
//    외부에서 직접 주입이 가능함.
//    @Autowired
//    public void setComputer(Computer computer) {
//        this.computer = computer;
//    }


//    생성자 주입
//    순환 참조시 컴파일러가 인지 가능, 오류 발생 ( 즉, StackOverFlow발생 x)
//    메모리에 할당하면서 초기값으로 주입되므로 final키워드 사용 가능, 다른 곳에서 변형 불가능(안전).
//    의존성 주입이 되지 않으면 객체가 생성되지 않으므로 NPE 방어. (NullPointerException)
//    @Autowired
//    public Coding(Computer computer) {
//        this.computer = computer;
//    }
}

package com.metacoding.myhttp;

import lombok.*;

//어노테이션 : jvm이 보는 주석 / 실행할 때 참조 /실행 시에 jvm이 보고 주석 보고 실행 시에 만들어짐.
//puglin 안하면 툴 자체에는 게터가 없는 줄 알아서, 그래야 어노보고 이거 있다잉 읽을 수 있음 / 라이브러리

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Setter
//@Getter 다 들고 있음
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}

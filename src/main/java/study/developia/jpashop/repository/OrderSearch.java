package study.developia.jpashop.repository;

import lombok.Getter;
import lombok.Setter;
import study.developia.jpashop.domain.OrderStatus;

@Getter @Setter
public class OrderSearch {
    private String memberName; //회원 이름

    private OrderStatus orderStatus; //주문 상태
}

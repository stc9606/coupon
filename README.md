# coupon
쿠폰 발급 시스템을 개발

요구사항
1. 선착순으로 쿠폰을 발급 ex) 100명에게만 발급
2. RDBMS로 먼저 테스트 (Redis를 사용하지 않는다.)
3. 동시성 데이터 처리 (Redis 분산락, 트랜잭션 처리)
4. Queue를 사용하여 요청 비동기 처리
5. 멀티 모듈 프로젝트를 구성


예상 아키텍처
![image](https://github.com/user-attachments/assets/8b7576bf-12f6-4fd2-b75c-83d960595071)

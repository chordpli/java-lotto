package lotto;

public enum Winning {
    FirstPlace("6개 일치", "2,000,000,000원", 2_000_000_000),
    SecondPlace("5개 일치, 보너스 볼 일치", "30,000,000원", 30_000_000),
    ThirdPlace("5개 일치", "1,500,000원", 1_500_000),
    FourthPlace("4개 일치", "50,000원", 50_000),
    FifthPlace("3개 일치", "5,000원", 5_000);

    private final String DESCRIPTION;
    private final String SRING_PRICE;
    private final int PRICE;

    Winning(String DESCRIPTION, String SRING_PRICE, int PRICE) {
        this.DESCRIPTION = DESCRIPTION;
        this.SRING_PRICE = SRING_PRICE;
        this.PRICE = PRICE;
    }
}

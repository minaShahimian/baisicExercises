package abstract6.exercise1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {

        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("small balloon--");
        smallBalloon.LiftUp();
        smallBalloon.land();

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("big balloon--");
        bigBalloon.LiftUp();
        bigBalloon.land();

        System.out.println("small--");
        HotAirBalloon small = smallBalloon;
        small.LiftUp();
        small.land();

        System.out.println("big--");
        HotAirBalloon big = bigBalloon;
        big.LiftUp();
        big.land();
    }
}

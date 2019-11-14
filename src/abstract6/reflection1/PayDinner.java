package abstract6.reflection1;

import java.util.Scanner;

public class PayDinner {

    public static void main(String[] args) {
        Integer money = getMoney();
        Integer debt = getFriendsDebt();
        concludeWhetherDerekCanTreatHisFriends(money, debt);

    }

    private static Integer getMoney() {
        System.out.println("How much money do I have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Integer getFriendsDebt() {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfFriends = getFriendsDebt();
        Integer debt = 0;
        for (int time = 0; time < numberOfFriends; time++) {
            System.out.println("How much do you have to pay?");
            Integer money = scanner.nextInt();
            debt = debt + money;
        }
        return debt;
    }

    public static Integer getNumberOfFriends() {
        System.out.println("How many friends are here?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void concludeWhetherDerekCanTreatHisFriends(Integer money, Integer debt) {
        boolean canInvite = money >= debt;
        if (!canInvite) {
            System.out.println("Sorry mates, I can't invite you today.");
            return;
        }
        System.out.println("you are all invited. ");
        Integer myDebt = getMyDebt();
        canInvite = money >= myDebt + debt;
        if (!canInvite) {
            System.out.println("Sry mates, I miscalculated! I can't invite you today.");
        }

    }

    private static Integer getMyDebt() {
        System.out.println("How much money do I have to pay?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}

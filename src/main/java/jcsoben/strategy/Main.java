package jcsoben.strategy;

import jcsoben.strategy.context.Match;
import jcsoben.strategy.impl.AttackStrategyImpl;
import jcsoben.strategy.impl.DefenseStrategyImpl;
import jcsoben.strategy.impl.StandardStrategyImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Match match;

        System.out.println("How is the match?");
        System.out.println("1 - We are losing");
        System.out.println("2 - We are winning");
        var option = Integer.parseInt(in.nextLine());

        match = switch (option) {
            case 1 -> new Match(new AttackStrategyImpl());
            case 2 -> new Match(new DefenseStrategyImpl());
            default -> new Match(new StandardStrategyImpl());
        };

        match.execute();
    }
}

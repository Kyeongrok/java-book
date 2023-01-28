package org.book.chapter02.p01;

public class SwitchCaseEx {
    private boolean canUpgradeLevel(User user) {
        switch (user.getLevel()) {
            case BASIC: return (user.getLogins() >= 50);
            case SILVER: return (user.getLogins() >= 100);
            case GOLD: return false;
            default:
                throw new IllegalArgumentException("Unknown Level: " + user.getLevel());
        }
    }
}

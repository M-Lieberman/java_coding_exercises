package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = (vatRate / 100) * originalPrice;

        BigDecimal priceIncludingVat = new BigDecimal(Double.toString(Double.sum(originalPrice, vat)));
        return priceIncludingVat.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public String reverse(String sentence) {
        // not sure if this is cheating ;)
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return users.stream()
                .filter(user -> "Linux".equals(user.getType()))
                .collect(Collectors.toList())
                .size();
    }

    public int countLinuxUsersPreJava8(List<User> users) {
        int linuxUserCounter = 0;
        for(User user : users) {
            if ("Linux".equals(user.getType())) {
                linuxUserCounter++;
            }
        }
        return linuxUserCounter;
    }

}

package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    // Central Pattern Storage
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                " ***** "
        });
    }

    // Render Function
    static void renderBanner(String word) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++)
            banner[i] = new StringBuilder();

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append(" ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }
}
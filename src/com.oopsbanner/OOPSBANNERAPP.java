package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp7 {

    // CharacterPattern Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // CharacterPatternMap Class
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> map = new HashMap<>();

        static {
            map.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    " ***** "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "**   **",
                    "**   **",
                    "****** ",
                    "**     ",
                    "**     ",
                    "**     "
            }));

            map.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "**     ",
                    "**     ",
                    " ***** ",
                    "     **",
                    "     **",
                    " ***** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return map.get(ch);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern =
                    CharacterPatternMap.getPattern(ch).getPattern();

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append(" ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line.toString());
        }
    }
}
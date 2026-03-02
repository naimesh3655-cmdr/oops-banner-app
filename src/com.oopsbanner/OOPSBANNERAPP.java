public class OOPSBANNERAPP{

    // Class to store character and its pattern
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    // Create pattern mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
"  *****   ",
" **   **  ",
" **   **  ",
" **   **  ",
" **   **  ",
" **   **  ",
"  *****   "
        };

        String[] P = {
"  ******  ",
" **    ** ",
" **    ** ",
" ******   ",
" **       ",
" **       ",
" **       "
        };

        String[] S = {
"  ******  ",
" **       ",
" **       ",
"  ******  ",
"       ** ",
" **    ** ",
"  ******  "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };
    }

    // Get pattern for character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }
// Print banner
public static void printMessage(String message, CharacterPatternMap[] charMaps) {

    int height = charMaps[0].pattern.length;

    for (int row = 0; row < height; row++) {
        for (int i = 0; i < message.length(); i++) {
            String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
            if (pattern != null) {
                System.out.print(pattern[row] + "   ");
            }
        }
        System.out.println();
    }
}

// Main method
public static void main(String[] args) {

    CharacterPatternMap[] charMaps = createCharacterPatternMaps();
    String message = "OOPS";
    printMessage(message, charMaps);
}
}
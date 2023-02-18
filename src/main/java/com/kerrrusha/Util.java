package com.kerrrusha;

import java.util.List;

public class Util {

    public static class Pair {

        public final char ch;
        public final int index;

        public Pair(char ch, int index) {
            this.ch = ch;
            this.index = index;
        }

    }

    public enum Algorithm {
        LINEAR,
        NON_LINEAR,
        FREE_TEXT
    }

    public enum Operation {
        CRYPTING,
        DECRYPTING
    }

    public static final List<Pair> DEFAULT_ALPHABET = List.of(
            new Pair('а', 1),
            new Pair('б', 2),
            new Pair('в', 3),
            new Pair('г', 4),
            new Pair('д', 5),
            new Pair('е', 6),
            new Pair('ё', 7),
            new Pair('ж', 8),
            new Pair('з', 9),
            new Pair('и', 10),
            new Pair('й', 11),
            new Pair('к', 12),
            new Pair('л', 13),
            new Pair('м', 14),
            new Pair('н', 15),
            new Pair('о', 16),
            new Pair('п', 17),
            new Pair('р', 18),
            new Pair('с', 19),
            new Pair('т', 20),
            new Pair('у', 21),
            new Pair('ф', 22),
            new Pair('х', 23),
            new Pair('ц', 24),
            new Pair('ч', 25),
            new Pair('ш', 26),
            new Pair('щ', 27),
            new Pair('ь', 28),
            new Pair('ы', 29),
            new Pair('ъ', 30),
            new Pair('э', 31),
            new Pair('ю', 32),
            new Pair('я', 33),
            new Pair(' ', 34)
    );

    public static final List<Pair> CUSTOM_ALPHABET = List.of(
            new Pair('ы', 1),
            new Pair('р', 2),
            new Pair('о', 3),
            new Pair('в', 4),
            new Pair('ж', 5),
            new Pair('х', 6),
            new Pair('ч', 7),
            new Pair('я', 8),
            new Pair('д', 9),
            new Pair('б', 10),
            new Pair('ц', 11),
            new Pair('ш', 12),
            new Pair('и', 13),
            new Pair('т', 14),
            new Pair('г', 15),
            new Pair('з', 16),
            new Pair('ъ', 17),
            new Pair('щ', 18),
            new Pair('к', 19),
            new Pair('й', 20),
            new Pair('л', 21),
            new Pair('ь', 22),
            new Pair(' ', 23),
            new Pair('п', 24),
            new Pair('у', 25),
            new Pair('е', 26),
            new Pair('м', 27),
            new Pair('ё', 28),
            new Pair('н', 29),
            new Pair('э', 30),
            new Pair('с', 31),
            new Pair('ф', 32),
            new Pair('ю', 33),
            new Pair('а', 34)
    );

}

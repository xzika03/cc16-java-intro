package cz.codecamp.intro;

public class InnerClasses {

    public static final class Level1 {

        int value1;
        Level2 level2;

        public static final class Level2 {

            int value2;
            Level3 level3;

            public static final class Level3 {

                int value3;
                // ...
            }
        }

    }

    public static void main(String[] args) {
        Level1 level1 = new Level1();
        level1.value1 = 1;
        level1.level2 = new Level1.Level2();
        level1.level2.value2 = 2;
        level1.level2.level3 = new Level1.Level2.Level3();
        level1.level2.level3.value3 = 3;
    }

}

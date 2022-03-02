import java.util.Arrays;

class TwelveDays {
//    private int verseNumber, startVerse, endVerse;
//    private String idleLine = " day of Christmas my true love gave to me: ";
//    private String onThe = "On the ";
//    private String[] gifts = {
//            "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings",
//            "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping",
//            "eleven Pipers Piping", "twelve Drummers Drumming"
//    };
//    private String[] days = {
//            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
//    };
//
//    String verse(int verseNumber) {
//        this.verseNumber = verseNumber;
//        String completeLine = "";
//        completeLine = onThe + days[verseNumber-1] + idleLine;
//        for(int i = verseNumber ; i>0 ; i--){
//            completeLine += gifts[i-1];
//            if(i != 1){
//                completeLine += ", ";
//            }
//            if(i == 2){
//                completeLine += "and ";
//            }
//        }
//        completeLine += ".\n";
//        return completeLine;
//    }
//
//    String verses(int startVerse, int endVerse) {
//        this.startVerse = startVerse;
//        this.endVerse = endVerse;
//        String singTheSong = "";
//        for(int i = startVerse ;i<endVerse; i++){
//            singTheSong += verse(i) ;
//            if(i != endVerse){
//                singTheSong += "\n";
//            }
//        }
//        return singTheSong;
//    }
//
//    String sing() {
//        return verses(1,12);
//    }

    public String[] Lines = {"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" ,
        "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
        "and a Partridge in a Pear Tree.\n" ,
        "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
        "and a Partridge in a Pear Tree.\n" ,
        "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +
        "two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
        "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
        "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" ,
        "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
        "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
        "and a Partridge in a Pear Tree.\n" ,
        "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
        "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
        "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" ,
        "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
        " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
        "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" ,
        "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
        " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
        "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" ,
        "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
        "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
        "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
        "and a Partridge in a Pear Tree.\n" ,
        "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
        "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
        "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
        "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"};
        String verse(int verseNumber){
            return Lines[verseNumber - 1];
        }
        String verses(int startVerse, int endVerse){
            return String.join("\n", Arrays.copyOfRange(Lines, startVerse - 1, endVerse));
        }
        String sing(){
            return String.join("\n", Lines);
        }


}

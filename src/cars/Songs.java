package cars;

public class Songs {
    private final static String[] songs = {"As It Was - Harry Styles",
                                    "Anti-Hero - Taylor Swift",
                                    "Blinding Lights - The Weeknd",
                                    "Levitating - Dua Lipa",
                                    "Bad Habit - Steve Lacy",
                                    "Unholy - Sam Smith & Kim Petras",
                                    "Flowers - Miley Cyrus",
                                    "Peaches - Justin Bieber ft. Daniel Caesar & Giveon",
                                    "Stay - The Kid LAROI & Justin Bieber",
                                    "Save Your Tears - The Weeknd & Ariana Grande",
                                    "About Damn Time - Lizzo",
                                    "Easy On Me - Adele",
                                    "Good 4 U - Olivia Rodrigo",
                                    "Shivers - Ed Sheeran",
                                    "Watermelon Sugar - Harry Styles",
                                    "Positions - Ariana Grande",
                                    "Don't Start Now - Dua Lipa",
                                    "MONTERO (Call Me By Your Name) - Lil Nas X",
                                    "Ghost - Justin Bieber",
                                    "Heat Waves - Glass Animals",
                                    "Break My Soul - Beyoncé",
                                    "Dance The Night - Dua Lipa",
                                    "Vampire - Olivia Rodrigo",
                                    "Cruel Summer - Taylor Swift",
                                    "Calm Down - Rema & Selena Gomez"
                                    };
    
    public static String getRandomSong() {
        int randIndex = (int) (Math.random() * songs.length);
        return songs[randIndex];
    }
}

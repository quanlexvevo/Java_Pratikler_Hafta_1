package enumpractice;

public enum Difficulty {
    Easy,
    Medium,
    Hard,
    Unknown;

    public static Difficulty fromString(String text){
        for (Difficulty d : Difficulty.values()){
            if (d.name().equalsIgnoreCase(text)){
                return d;
            }
        }
        return Unknown;
    }


}

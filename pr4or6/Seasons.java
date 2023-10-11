package pr4or6;

public enum Seasons {
    Winter(2, "Зима"), Spring(20, "Весна"),
    Summer(35, "Лето"), Autumn(23, "Осень");
    private int maxTemp;
    private String nameOfSeason;

    Seasons(int maxTemp, String nameOfSeason) {
        this.maxTemp = maxTemp;
        this.nameOfSeason = nameOfSeason;
    }

    @Override
    public String toString() {
        return "Я люблю " + nameOfSeason + ", когда " + maxTemp + " и это - " + getDiscriptions();
    }

    public String getDiscriptions() {
        if (nameOfSeason == "Зима") {
            return "Холодное время года";
        }
        else if (nameOfSeason == "Лето") {
            return "Теплое время года";
        }
        return "Что-то между летом и зимой";
    }
}


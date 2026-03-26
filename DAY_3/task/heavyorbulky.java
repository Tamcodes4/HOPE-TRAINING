package DAY_3.task;

public class heavyorbulky {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulk = false;
        boolean Heav = false;
        if (length >= 10000 || width >= 10000 || height >= 10000)
            Bulk = true;
        else {
            long vol = (long) length * width * height;
            if (vol >= 1000000000L)
                Bulk = true;
        }
        if (mass >= 100)
            Heav = true;
        if (Bulk && Heav) return "Both";
        if (Bulk) return "Bulky";
        if (Heav) return "Heavy";
        
        return "Neither";
    }
}

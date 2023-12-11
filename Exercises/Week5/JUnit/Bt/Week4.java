public class Week4 {
    public static int max2Int(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int minArray (int[] array) {
        int min = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i] < min) min = array[i];
        }
        return min;
    }

    public static String calculateBMI(double weight, double height){
        double BMI = weight / (height * height);
        if(BMI < 18.4) {
            return "Thiếu cân";
        } else if(weight < height * height * 18.5){
            return "Bình thường";
        } else if (BMI >=18.5 && BMI <23) {
            return "Bình thường";
        } else if (BMI >=23 && BMI <25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
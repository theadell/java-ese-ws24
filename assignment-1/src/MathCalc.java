
public class MathCalc {

    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {

        double radiusEarth = 7600.0 / 2.0;
        double radiusSun = 865000.0 / 2.0;

        double volumeEarth = calculateVolume(radiusEarth);
        double volumeSun = calculateVolume(radiusSun);

        double ratio = volumeSun / volumeEarth;

        System.out.printf("The volume of the Earth is %.3e cubic miles.%n", volumeEarth);
        System.out.printf("The volume of the Sun is %.3e cubic miles.%n", volumeSun);
        System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.3e.%n", ratio);
    }

}
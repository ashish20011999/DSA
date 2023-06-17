class Maths {
    public final double secret = 2;
}

class ComplexMath extends Maths {
    public final double secret = 4;
}

public class InfiniteMath extends ComplexMath {
    public final double secret = 8;

    public static void main(String[] numbers) {
        Maths math = new InfiniteMath();
        System.out.print(math.secret);
    }
}
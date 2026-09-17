package homework;

public class Task4HeronGeometry {
    public static void main(String[] args) {
    double a = 7.0;
    double b = 8.0;
    double c = 9.0;

    double perimeter = a + b + c;
    double halfPerimeter = perimeter / 2.0;

    double area = Math.sqrt(
            halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)
    );

    double inscribedRadius = area / halfPerimeter;
    double inscribedArea = Math.PI * Math.pow(inscribedRadius, 2);

    double circumscribedRadius = (a * b * c) / (4.0 * area);
    double circumscribedArea = Math.PI * Math.pow(circumscribedRadius, 2);

    System.out.println("================ ГЕОМЕТРИЧНИЙ ЗВІТ ===============");
    System.out.println("Сторони: a = " + a + ", b = " + b + ", c = " + c);
    System.out.println("Периметр (P):               " + perimeter);
    System.out.println("Напівпериметр (p):          " + halfPerimeter);
    System.out.println("Площа трикутника (S):       " + area + " кв. од.");
    System.out.println("Радіус вписаного кола (r):  " + inscribedRadius);
    System.out.println("Площа вписаного круга:      " + inscribedArea + " кв. од.");
    System.out.println("Радіус описаного кола (R):  " + circumscribedRadius);
    System.out.println("Площа описаного круга:      " + circumscribedArea + " кв. од.");
    System.out.println("==================================================");
}
}


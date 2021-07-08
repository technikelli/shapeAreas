
public class shapeAreas {

    public static void main (String[] args){

        for(int i=1; i<11; i++){
            circle circle = new circle(i);
            System.out.println("Area of a circle with radius " + i + " is " + circle.area() + " circumference is " + circle.circumference());
        }

        System.out.println();

        for( int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                rectangle rectangle = new rectangle(i, j);
                System.out.println("Area of a rectangle " + i + " by " + j + " is " + rectangle.area() + " it's perimeter is " + rectangle.perimeter());
            }
        }

        System.out.println();

        triangle triangle1 = new triangle(18, 30, 24);
        System.out.println("Area of a triangle 18x30x24 is "  + triangle1.area() + " it's perimeter is " + triangle1.perimeter() + " and it's height is " + triangle1.height());

        triangle triangle2 = new triangle();
        System.out.println("Area of a triangle 3x4x5 is "  + triangle2.area() + " it's perimeter is " + triangle2.perimeter() + " and it's height is " + triangle2.height());



    }

    static class circle {
        private final double radius;


        public circle(double radius) {
            this.radius = radius;
        }

        public double circumference() {
            return 2 * Math.PI * radius;
        }

        public double area() {
            return Math.PI * (radius * radius);

        }

    }

    static class triangle {
        private final double side1;
        private final double side2;
        private final double side3;

        public triangle(double side1, double side2, double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }

        public triangle() {
            side1 = 3;
            side2 = 4;
            side3 = 5;

        }

        public double perimeter() {
            return side1 + side2 + side3;

        }

        public double area() {
            double p=(side1 + side2 + side3)/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));

        }

        public double height() {
            double smallest;
            if (side1 < side2 && side1 < side3){
                smallest = side1;
            }
            else if (side2 < side1 && side2 < side3){
                smallest = side2;
            }
            else {
                smallest = side3;
            }

            return (area() * 2) /smallest;
        }

        @Override
        public String toString() {
            System.out.println("Triangle has sides " + side1 + ", "
                    + side2 + ", and "
                    + side3 + ". It has an area of " + area()
                    + " and perimeter of " + perimeter());

            return "";
        }



    }

    static class rectangle{
        private final double height;
        private final double width;

        public rectangle(double height, double width){
            this.height = height;
            this.width = width;

        }

        public double perimeter() {
            return (2 * height) + (2 * width);
        }

        public double area() {
            return height * width;

        }
    }



}

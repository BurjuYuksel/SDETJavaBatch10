package class27.EastCteamProject2;

import java.text.DecimalFormat;

class CalculateArea {

        public interface Shape{
                void calculateArea(double x);
                void calculatePerimiter(double y);


        }
        static class Circle implements Shape{

                private static DecimalFormat xy2 = new DecimalFormat("#.##");

                @Override
                public void calculateArea(double x) {
                        //pi.r.r
                        double area=Math.PI*x*x;
                        System.out.println("The area of the circle is "+xy2.format(area));
                }

                @Override
                public void calculatePerimiter(double y) {
                        //2.Pi.r
                        double perimiter=2*Math.PI*y;
                        System.out.println("The perimiter of the circle is "+xy2.format(perimiter));

                }
        }

        static class Square implements Shape{
                private static DecimalFormat xy2 = new DecimalFormat("#.##");
                @Override
                public void calculateArea(double x) {
                        double area=x*x;
                        System.out.println("The area of the square is "+xy2.format(area));

                }

                @Override
                public void calculatePerimiter(double y) {
                        double perimiter=4*y;
                        System.out.println("The perimiter of the square is "+xy2.format(perimiter));

                }
        }

        public static void main(String[] args) {
                Shape c=new Circle();
                c.calculatePerimiter(7);
                c.calculateArea(2);
                Shape s=new Square();
                s.calculateArea(5);
                s.calculatePerimiter(3);
        }
}








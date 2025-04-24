package praktic.geometry.mains;

/* KHALIZ IRFANUR HAFIZ
   245150707111039
 __  __   __  __  ______  __     ______  ________     
/\ \/\ \ /\ \/\ \/\  _  \/\ \   /\__  _\/\_____  \    
\ \ \/'/'\ \ \_\ \ \ \L\ \ \ \  \/_/\ \/\/____//'/'   
 \ \ , <  \ \  _  \ \  __ \ \ \  __\ \ \     //'/'    
  \ \ \\`\ \ \ \ \ \ \ \/\ \ \ \L\ \\_\ \__ //'/'___  
   \ \_\ \_\\ \_\ \_\ \_\ \_\ \____//\_____\/\_______\
    \/_/\/_/ \/_/\/_/\/_/\/_/\/___/ \/_____/\/_______/
/* */

import java.util.Scanner;
import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.Weightable;

public class ShapeCalculator {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(GREEN + "======================================" + RESET);
        System.out.println(GREEN + "Shape Calculator" + RESET);
        System.out.println(GREEN + "KHALIZ IRFANUR HAFIZ" + RESET);
        System.out.println(GREEN + "245150707111039" + RESET);
        System.out.println(GREEN + "======================================" + RESET);

        // Circle
        System.out.println(BLUE + "2D Circle" + RESET);
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("======================================");
        circle.printInfo();
        System.out.println("======================================");

        // Square
        System.out.println(BLUE + "2D Square" + RESET);
        System.out.println("======================================");
        System.out.print("Enter side      : ");
        double side = input.nextDouble();
        Square square = new Square(side);
        System.out.println("======================================");
        square.printInfo();
        System.out.println("======================================");

        // Cube
        System.out.println(YELLOW + "3D Weightable Cube" + RESET);
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double edge = input.nextDouble();
        System.out.print("Enter mass      : ");
        double cubeMass = input.nextDouble();
        Cube cube = new Cube(edge, cubeMass);
        System.out.println("======================================");
        cube.printInfo();
        System.out.println("======================================");

        // Sphere
        System.out.println(YELLOW + "3D Weightable Sphere" + RESET);
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double sphereRadius = input.nextDouble();
        System.out.print("Enter mass      : ");
        double sphereMass = input.nextDouble();
        Sphere sphere = new Sphere(sphereRadius, sphereMass);
        System.out.println("======================================");
        sphere.printInfo();
        System.out.println("======================================");

        // Polymorphism section in full RED
        System.out.println(RED + "Volume of Cube and Sphere" + RESET);
        System.out.println(RED + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "======================================" + RESET);
        System.out.print(RED + "Enter edge      : " + RESET);
        double polyEdge = input.nextDouble();
        System.out.print(RED + "Enter radius    : " + RESET);
        double polyRadius = input.nextDouble();
        System.out.print(RED + "Enter mass      : " + RESET);
        double polyMass = input.nextDouble();

        Weightable polyCube = new Cube(polyEdge, polyMass);
        Weightable polySphere = new Sphere(polyRadius, polyMass);

        System.out.println(RED + "======================================" + RESET);
        System.out.println(RED + "Cube’s volume   : " + ((Cube) polyCube).getVolume() + RESET);
        System.out.println(RED + "Sphere’s volume : " + ((Sphere) polySphere).getVolume() + RESET);
        System.out.println(RED + "Weight          : " + (polyCube.getWeight() + polySphere.getWeight()) + RESET);
        System.out.println(RED + "======================================" + RESET);
    }
}
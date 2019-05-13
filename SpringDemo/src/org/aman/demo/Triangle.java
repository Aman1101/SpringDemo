package org.aman.demo;

public class Triangle {

    /*private String type;
    private int height;

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height){
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/


    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("PointA = (" + getPointA().getX() + ", " + getPointA().getY() + ") " +
                "PointB = (" + getPointB().getX() + ", " + getPointB().getY() + ") "
                + "PointC = ("+ getPointC().getX() + ", " + getPointC().getY() + ")");
    }
}

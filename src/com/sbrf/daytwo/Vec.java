package com.sbrf.daytwo;

public class Vec {
    private int x;
    private int y;
    private int z;

    public Vec(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vec plus(Vec o) {
        int tempX = this.x + o.x;
        int tempY = this.y + o.y;
        int tempZ = this.z + o.z;
        return new Vec(tempX, tempY, tempZ);
    }

    public Vec minus(Vec o) {
        int tempX = this.x - o.x;
        int tempY = this.y - o.y;
        int tempZ = this.z - o.z;
        return new Vec(tempX, tempY, tempZ);
    }

    public double scalarMultCos(Vec o) {
        double chisl = (this.x * o.x) + (this.y * o.y) + (this.z * o.z);
        double znam = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2)) * Math.sqrt(Math.pow(o.x, 2) + Math.pow(o.y, 2) + Math.pow(o.z, 2));
        double cos = chisl / znam;
        return this.length() * o.length() * cos;
    }

    public int scalarMult(Vec o) {
        int tempX = this.x * o.x;
        int tempY = this.y * o.y;
        int tempZ = this.z * o.z;
        return tempX + tempY + tempZ;
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " , " + z + " )";
    }

}

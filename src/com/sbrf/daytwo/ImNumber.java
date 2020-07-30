package com.sbrf.daytwo;

public class ImNumber<T extends Number> {
    private final char i = 'i';
    private T real;
    private T im;

    public ImNumber(T real, T im) {
        this.real = real;
        this.im = im;
    }

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getIm() {
        return im;
    }

    public void setIm(T im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return real + " + " + im + i;
    }

    public ImNumber<T> plus(ImNumber<T> imNumber) {
        if (this.im instanceof Integer) {
            Integer tempReal = this.real.intValue() + imNumber.real.intValue();
            Integer tempIm = this.im.intValue() + imNumber.im.intValue();
            return new ImNumber<>((T) tempReal, (T) tempIm);
        } else {
            Double tempReal = this.real.doubleValue() + imNumber.real.doubleValue();
            Double tempIm = this.im.doubleValue() + imNumber.im.doubleValue();
            return new ImNumber<>((T) tempReal, (T) tempIm);
        }
    }

    public ImNumber<T> minus(ImNumber<T> imNumber) {
        if (this.im instanceof Integer) {
            Integer tempReal = this.real.intValue() - imNumber.real.intValue();
            Integer tempIm = this.im.intValue() - imNumber.im.intValue();
            return new ImNumber<>((T) tempReal, (T) tempIm);
        } else {
            Double tempReal = this.real.doubleValue() - imNumber.real.doubleValue();
            Double tempIm = this.im.doubleValue() - imNumber.im.doubleValue();
            return new ImNumber<>((T) tempReal, (T) tempIm);
        }
    }

    public ImNumber<T> multiply(ImNumber<T> imNumber) {
        if (this.im instanceof Integer) {
            Integer tempReal = (this.real.intValue() * imNumber.real.intValue()) - (this.im.intValue() * imNumber.im.intValue());
            Integer tempIm = (this.real.intValue() * imNumber.im.intValue()) + (this.im.intValue() * imNumber.real.intValue());
            return new ImNumber<>((T) tempReal, (T) tempIm);
        } else {
            Double tempReal = (this.real.doubleValue() * imNumber.real.doubleValue()) - (this.im.doubleValue() * imNumber.im.doubleValue());
            Double tempIm = (this.real.doubleValue() * imNumber.im.doubleValue()) + (this.im.doubleValue() * imNumber.real.doubleValue());
            return new ImNumber<>((T) tempReal, (T) tempIm);
        }
    }

    public ImNumber<T> divide(ImNumber<T> imNumber) {
        if (this.im instanceof Integer) {
            Integer tempReal = ((this.real.intValue() * imNumber.real.intValue()) + (this.im.intValue() * imNumber.im.intValue()))
                    / (int) (Math.pow(imNumber.real.intValue(), 2) + Math.pow(imNumber.im.intValue(), 2));
            Integer tempIm = ((this.im.intValue() * imNumber.real.intValue()) - (this.real.intValue() * imNumber.im.intValue()))
                    / (int) (Math.pow(imNumber.real.intValue(), 2) + Math.pow(imNumber.im.intValue(), 2));
            return new ImNumber<>((T) tempReal, (T) tempIm);
        } else {
            Double tempReal = ((this.real.doubleValue() * imNumber.real.doubleValue()) + (this.im.doubleValue() * imNumber.im.doubleValue()))
                    / (Math.pow(imNumber.real.doubleValue(), 2) + Math.pow(imNumber.im.doubleValue(), 2));
            Double tempIm = ((this.im.doubleValue() * imNumber.real.doubleValue()) - (this.real.doubleValue() * imNumber.im.doubleValue()))
                    / (Math.pow(imNumber.real.doubleValue(), 2) + Math.pow(imNumber.im.doubleValue(), 2));
            return new ImNumber<>((T) tempReal, (T) tempIm);
        }
    }
}

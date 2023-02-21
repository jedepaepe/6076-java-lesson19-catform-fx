package com.example.lesson19fxcatform;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    private String breed;   // race
    private LocalDate birth;
    private double weight;
    private double size;
    private String[] colors;

    public Cat() {
    }

    public Cat(String breed, LocalDate birth, double weight, double size, String[] colors) {
        this.breed = breed;
        this.birth = birth;
        this.weight = weight;
        this.size = size;
        this.colors = colors;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", birth=" + birth +
                ", weight=" + weight +
                ", size=" + size +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}

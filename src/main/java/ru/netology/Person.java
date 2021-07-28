package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected final Integer age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = null;
        this.city = null;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = null;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if(age != null){
            return false;
        }else{
            return true;
        }
    }

    public boolean hasAddress() {
        if(city != null && !city.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        if(hasAge()){
            System.out.println(age+1);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder()
                .setSurname(surname)
                .setAge(age-20) //из условия задачи не понятно откуда берется везраст ребенка
                .setAddress(city);
        return child;
    }

}

package ru.netology;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) throws IllegalStateException {
        this.age = age;
        if(age>=0 && age<=150) {
            return this;
        }else{
            throw new IllegalStateException("Возраст должен находиться в диапазоне от 0 до 150");
        }
    }
    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if( (name != null && !name.trim().isEmpty())&&(surname != null && !surname.trim().isEmpty()) ) {
            Person person = new Person(name, surname, age, city);
            return person;
        }else{
            throw new IllegalStateException("Не достаточно данных для создания объекта");
        }

    }
}

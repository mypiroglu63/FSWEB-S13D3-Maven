package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String title;
    int number;
    String gender;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstname, String lastName, int age, String title, String gender, int number ) {
        this(firstname, lastName, age);
        this.title = title;
        this.gender = gender;
        this.number = number;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return (this.age>= 13 && this.age<=19);
    }



//    getFirstName => firstname değerini dönmeli
//
//    getLastName => lastname değerini dönmeli.
//
//            getAge => age değerini dönmeli.
//
//            isTeen => age değeri 13-19 arasında true dönmeli. Diğer koşullarda false dönmeli.
}

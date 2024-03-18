package homeworks.homework40.task6;
//Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
// Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    private List<String> skill;

    public Person(String name, int age, List<String> skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + skill +
                '}';
    }
}

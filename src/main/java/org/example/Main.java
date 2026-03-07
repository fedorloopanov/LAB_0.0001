package org.example;

public class Main {
    public static void main(String[] args) {
        String filePath = "people.yaml";

        PeopleReader reader = new YamlPeopleReader();

        try {
            PeopleWrapper data = reader.read(filePath);

            if (data.getPeople() == null || data.getPeople().isEmpty()) {
                System.out.println("Список people пуст.");
                return;
            }

            for (Person person : data.getPeople()) {
                System.out.println(person);
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

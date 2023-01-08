package encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        Person person = new Person("anbish", 19);

        System.out.println(person.getAge()); // tinh dong goi
        System.out.println(person.getName()); // tinh dong goi

        person.setName("an.bit"); // tinh dong goi
        System.out.println(person.getName()); // tinh dong goi

        // ko the truy cap truc tiep vao thuoc tinh cua doi tuong
        // System.out.println(person.name); => ERROR
    }
}

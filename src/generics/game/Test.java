package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolarOne = new Schoolar("Nick",15);
        Schoolar schoolarTwo = new Schoolar("Bob",16);

        Student studentOne = new Student("Alfred",20);
        Student studentTwo = new Student("Niki",22);

        Employee employeeOne = new Employee("Jorge",32);
        Employee employeeTwo = new Employee("Ann",31);

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        Team<Student> studentTeam = new Team<>("GoGoGo");
        Team<Employee> employeeTeam = new Team<>("Snake");

        schoolarTeam.addNewParticipant(schoolarOne);
        schoolarTeam.addNewParticipant(schoolarTwo);

        studentTeam.addNewParticipant(studentOne);
        schoolarTeam.addNewParticipant(schoolarTwo);

        employeeTeam.addNewParticipant(employeeOne);
        employeeTeam.addNewParticipant(employeeTwo);

        Team<Schoolar> schoolarTeamTwo = new Team<>("DragonTwo");
        Schoolar schoolarThree = new Schoolar("Jon",17);
        Schoolar schoolarFgee = new Schoolar("Olya",16);

        schoolarTeamTwo.addNewParticipant(schoolarThree);
        schoolarTeamTwo.addNewParticipant(schoolarFgee);

        schoolarTeam.playWith(schoolarTeamTwo);

    }
}

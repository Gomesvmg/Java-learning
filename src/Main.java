void main() {
    IO.println("Anything");
    IO.println("Hello, My name is Vinicius!");

    int year = 2022;
    String film = "Substance";
    boolean isFree = true;
    double grades = 9.5;
    double grades2 = 4.8;
    double grades3 = 3.3;
    double finalResult = (grades + grades2 + grades3) / 3;

    if (isFree) {
        IO.println(String.format("Name: %s | Released in: %d | Review", film, year, finalResult ));
    }

    String password = "65189";
    if (password.equals("651389")) {
        IO.println("Access allowed");
    } else {
        IO.println("Access denied");
    }
}
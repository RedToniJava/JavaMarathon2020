package day6;

class Motorcycle {
    private int inputYear;

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }

    public int getInputYear() {
        return inputYear;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    void yearDifference(int inputYear) {
        inputYear = 2020 - inputYear;
        if (inputYear >= 0) System.out.println("Мотоциклу " + inputYear);
        if (inputYear < 0) System.out.println(Math.abs(inputYear));

    }

}

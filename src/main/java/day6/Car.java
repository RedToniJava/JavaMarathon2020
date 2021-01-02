package day6;

class Car {
    private int inputYear;

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }

    public int getInputYear() {
        return inputYear;
    }

    void info() {
        System.out.println("Это машина");
    }

    void yearDifference(int inputYear) {
        inputYear = 2020 - inputYear;
        if (inputYear >= 0) System.out.println("Машине " + inputYear);
        if (inputYear < 0) System.out.println(Math.abs(inputYear));

    }


}


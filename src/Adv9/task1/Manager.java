package Adv9.task1;

public final class Manager extends Employee {

    private int numOfSubs;
    private static final int SALARY_COEF = 3;

    public Manager(String name, int age, float salary) {
        super(name, age, salary);
    }

    public Manager (String name, int age, float salary, int numOfSubs){
        super(name, age, salary);
        this.numOfSubs = numOfSubs;
    }


    @Override
    public float getSalary() {
        if (numOfSubs == 0 ) {
            return BASE_SALARY_PER_MONTH;
        }
        else {
            return BASE_SALARY_PER_MONTH * numOfSubs / 100 * SALARY_COEF;
        }
    }






}

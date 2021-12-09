class UseCase3 {
    public int computeWage() {
        //variables
        int totalWorkingDay = 0;
        int totalEmpHours = 0;

        while (totalEmpHours <= 100 && totalWorkingDay < 20) {
            UseCase2 useCase2 = new UseCase2();
            int empHours = useCase2.UseCase2();  // for calling empHours

            totalEmpHours += empHours;

            System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);

            totalWorkingDay++;
        }
        return totalEmpHours * 20;
    }
}

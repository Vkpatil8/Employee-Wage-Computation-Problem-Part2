public class UseCase2 {

     int UseCase2() {
         UseCase1 presentOrNot = new UseCase1();
        int empcheck = presentOrNot.UseCase1(); // for checking present absent or part-time
        

        //Condition statement switch case
        int empHours = 0;
        switch (empcheck) {
            case 1:
                empHours = 8;
                break;
            case 2:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
    return empHours;
    }
}

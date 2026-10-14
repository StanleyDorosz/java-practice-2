public class UsingVariables {
    public static void main(String[] args) {

        int intVar;
        char charVar;
        double dVar1;
        double dVar2;

        intVar = 5;
        charVar = 'c';
        dVar1 = 3.7;
        dVar2 = 5.5;

        System.out.println("The current value of intVar is " + intVar);
        System.out.println("The current value of charVar is " + charVar);
        System.out.println("The current value of dVar1 is " + dVar1);
        System.out.println("The current value of dVar2 is " + dVar2);

        intVar = 6;
        charVar = 'd';
        dVar1 = 3.8;
        dVar2 = 5.6;

        System.out.println("The new value of intVar is " + intVar);
        System.out.println("The new value of charVar is " + charVar);
        System.out.println("The new value of dVar1 is " + dVar1);
        System.out.println("The new value of dVar2 is " + dVar2);

        double dVarPlaceHolder1;
        double dVarPlaceHolder2;
        dVarPlaceHolder1 = dVar1;
        dVarPlaceHolder2 = dVar2;
        dVar1 = dVarPlaceHolder2;
        dVar2 = dVarPlaceHolder1;



        System.out.println("The final value of dVar1 is " + dVar1);
        System.out.println("The final value of dVar2 is " + dVar2);



    }
}
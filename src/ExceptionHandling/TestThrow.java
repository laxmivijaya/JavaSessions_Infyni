package ExceptionHandling;

public class TestThrow {
    public static void main(String[] args) {

        // if age id below 18 then throw an exception saying voter is not allowed for voting..
        // else  print message voting done.
        try {
            validateVotingAgeInIndia(12, "Ram");
        }catch(CustomUnCheckedException exception){
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(14, "Ram1");
        }catch(CustomUnCheckedException exception){
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(20, "Ram2");
        }catch(CustomUnCheckedException exception){
            System.out.println(exception.getErrorMessage());
        }


    }

    private static  void validateVotingAgeInIndia(int age,String voterName){

        if(age<=18){
            //throw new <ExceptionName>(<message>)
            throw new CustomUnCheckedException("voter is not allowed for voting..");
        }
        else{
            System.out.println(voterName+" is allowed with age "+age);
        }

    }
}

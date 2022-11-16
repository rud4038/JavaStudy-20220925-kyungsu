package j21_람다식;

public class Main {

    public static void main(String[] args) {
        Calc anonymousAddition = new Calc(){

            @Override
            public Integer operator(Integer[] dataArray) {
                int result = 0;
                for(int data : dataArray){
                    result += data;
                }
                return result;
            }

        };

        Calc lambdaAddition = nums -> {
            int result = 0;
            for(int num : nums){
                result += num;
            }
            return result;
        };

        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        int result = anonymousAddition.operator(numbers);
        System.out.println("결과1: " + result);

        int result2 = anonymousAddition.operator(numbers);
        System.out.println("결과2: " + result2);

    }

}

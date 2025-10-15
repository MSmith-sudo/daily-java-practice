public class PowerFunction{
  private static double power(double base, int exponent){
    if (exponent == 0){
      return 1;
    }
    if (exponent < 0){
      return 1/power(base, -exponent);
    }
    double half = power(base, exponent/2);
    if (exponent % 2 == 0){
      return half * half;
    }
    else{
      return half * half * base;
    }

    public static void main(String[] args){
      System.out.println(power(2, 10));
      System.out.println(power(2, -10));
    }
  }
}
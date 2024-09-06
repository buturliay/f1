public class Main {
  public static void main(String[] args) {
    ApiSearch test = new ApiSearch();
    System.out.println(test.generateReference(
            "https://api.openf1.org/v1/drivers?driver_number=1&session_key=9158"));
  }
}

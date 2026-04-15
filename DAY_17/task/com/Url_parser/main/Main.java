package DAY_17.task.com.Url_parser.main;

import DAY_17.task.com.Url_parser.model.UrlData;
import DAY_17.task.com.Url_parser.parser.UrlParser;
import DAY_17.task.com.Url_parser.service.UrlService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UrlParser parser = new UrlParser();
        UrlService service = new UrlService();

        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Enter URL : ");
            input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            UrlData u1 = parser.parse(input);
            service.showDetails(u1);
            System.out.println();
        }

        sc.close();
    }
}
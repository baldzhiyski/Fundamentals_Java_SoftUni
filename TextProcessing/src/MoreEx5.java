import java.util.Scanner;

public class MoreEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String titleOfArticle = scan.nextLine();
        String contentOfArticle = scan.nextLine();
        printArticleAndContent(titleOfArticle,contentOfArticle);
        String input = scan.nextLine();
        while(!input.equals("end of comments")){
            String commend = input;
            printCommends(commend);
            input= scan.nextLine();
        }
    }
    public static void printArticleAndContent(String article,String content){
        System.out.println("<h1>");
        System.out.println("   "+ article);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("   "+ content);
        System.out.println("</article>");
    }
    public static void printCommends(String commend){
        System.out.println("<div>");
        System.out.println("     "+commend);
        System.out.println("</div>");
    }
}

package board.main;

import board.service.Board;
import board.service.BoardListService;
import board.service.BoardViewService;
import board.service.BoardWriteService;

import java.util.Scanner;

public class IndexMain {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        Board board = null;
        int num;

        while (true) {
            System.out.println();
            System.out.println("******************");
            System.out.println("   1. 글쓰기");
            System.out.println("   2. 목록");
            System.out.println("   3. 작성한 글 내용 보기");
            System.out.println("   4. 끝");
            System.out.println("******************");
            System.out.print("  번호 : ");
            num = scan.nextInt();

            if (num == 4) break;
            if (num == 1) board = new BoardWriteService();
            else if (num == 2) board = new BoardListService();
            else if (num == 3) board = new BoardViewService();
            
            board.execute();
          }
        
      }
    

    public static void main(String[] args) {
        IndexMain indexMain = new IndexMain();
        indexMain.menu();
        System.out.println("프로그램을 종료합니다.");
    }
}

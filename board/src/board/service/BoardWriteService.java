package board.service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

import java.util.Scanner;

public class BoardWriteService implements Board {

    @Override
    public void execute() {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        
        BoardDAO boardDAO = BoardDAO.getInstance();

        System.out.print("아이디 입력 : ");
        String id = scan.nextLine();
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();
        System.out.print("제목 입력 : ");
        String sub = scan.nextLine();
        System.out.print("내용 입력 : ");
        String date = scan.nextLine();

        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(id);
        boardDTO.setName(name);
        boardDTO.setSub(sub);
        boardDTO.setDate(date);

        int exist = boardDAO.write(boardDTO);

        if (exist > 0) {
            System.out.println("작성하신 글이 등록되었습니다.");
        } 
    }
}

package board.service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

import java.util.Scanner;

public class BoardViewService implements Board {

    @Override
    public void execute() {
        System.out.println();
        
        Scanner scan = new Scanner(System.in);

        System.out.print("글번호 : ");
        int seq = scan.nextInt();

        BoardDAO boardDAO = BoardDAO.getInstance();
        BoardDTO boardDTO = boardDAO.getBoard(seq);

        if (boardDTO != null) {
            System.out.println("글번호: " + boardDTO.getNumber() +
                               "\t아이디: " + boardDTO.getId() +
                               "\t이름: " + boardDTO.getName());
            System.out.println("날짜: " + boardDTO.getDate());
            System.out.println("제목: " + boardDTO.getSub());
            System.out.println("내용: " + boardDTO.getDate());
        } 
    }
}

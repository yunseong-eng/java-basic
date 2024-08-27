package board.service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

import java.util.List;

public class BoardListService implements Board {

    @Override
    public void execute() {
        BoardDAO boardDAO = BoardDAO.getInstance();
        List<BoardDTO> boardList = boardDAO.getAllBoards();

        System.out.println("-----------------------------------------------------");
        System.out.println("글번호\t제목\t아이디\t날짜");
        System.out.println("-----------------------------------------------------");
        for (BoardDTO board : boardList) {
            System.out.println(board.getNumber() + "\t" +
                               board.getSub() + "\t" +
                               board.getId() + "\t" +
                               board.getDate());
        }
    }
}

package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CheckersGame extends JPanel {
    private static final int SIZE = 8; // 8x8 taxta
    private static final int CELL_SIZE = 80; // Har bir hujayraning o‘lchami
    private static final Color DARK = new Color(139, 69, 19);
    private static final Color LIGHT = new Color(245, 222, 179);

    private int[][] board = new int[SIZE][SIZE]; // 0 = bo‘sh, 1 = qora, 2 = qizil
    private boolean isRedTurn = true; // Qizil o‘yinchi boshlaydi
    private int selectedRow = -1, selectedCol = -1;

//    public CheckersGame() {
//        setPreferredSize(new Dimension(SIZE * CELL_SIZE, SIZE * CELL_SIZE));
//        initializeBoard();
//
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                int col = e.getX() / CELL_SIZE;
//                int row = e.getY() / CELL_SIZE;
//
//                if (selectedRow == -1 && board[row][col] != 0 && isCorrectTurn(row, col)) {
//                    selectedRow = row;
//                    selectedCol = col;
//                } else if (selectedRow != -1 && isValidMove(selectedRow, selectedCol, row, col)) {
//                    board[row][col] = board[selectedRow][selectedCol];
//                    board[selectedRow][selectedCol] = 0;
//                    if (Math.abs(row - selectedRow) == 2) {
//                        board[(selectedRow + row) / 2][(selectedCol + col) / 2] = 0; // O‘rtadagi donani o‘chirish
//                    }
//                    isRedTurn = !isRedTurn;
//                    selectedRow = -1;
//                    selectedCol = -1;
//                } else {
//                    selectedRow = -1;
//                    selectedCol = -1;
//                }
//                repaint();
//            }
//        });
//    }
//
//    private void initializeBoard() {
//        for (int row = 0; row < SIZE; row++) {
//            for (int col = 0; col < SIZE; col++) {
//                if ((row + col) % 2 == 1) {
//                    if (row < 3) board[row][col] = 1; // Qora
//                    else if (row > 4) board[row][col] = 2; // Qizil
//                }
//            }
//        }
//    }
//
//    private boolean isCorrectTurn(int row, int col) {
//        return (isRedTurn && board[row][col] == 2) || (!isRedTurn && board[row][col] == 1);
//    }
//
//    private boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
//        if (board[endRow][endCol] != 0 || (startRow + startCol) % 2 == 0 || (endRow + endCol) % 2 == 0) return false;
//        int direction = (board[startRow][startCol] == 1) ? 1 : -1;
//        if (endRow == startRow + direction && Math.abs(endCol - startCol) == 1) return true;
//        if (endRow == startRow + 2 * direction && Math.abs(endCol - startCol) == 2) {
//            int midRow = (startRow + endRow) / 2;
//            int midCol = (startCol + endCol) / 2;
//            return board[midRow][midCol] != 0 && board[midRow][midCol] != board[startRow][startCol];
//        }
//        return false;
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Taxtani chizish
//        for (int row = 0; row < SIZE; row++) {
//            for (int col = 0; col < SIZE; col++) {
//                g.setColor((row + col) % 2 == 0 ? LIGHT : DARK);
//                g.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
//
//                if (board[row][col] == 1 || board[row][col] == 2) {
//                    g.setColor(board[row][col] == 1 ? Color.BLACK : Color.RED);
//                    g.fillOval(col * CELL_SIZE + 10, row * CELL_SIZE + 10, CELL_SIZE - 20, CELL_SIZE - 20);
//                }
//            }
//        }
//
//        // Tanlangan donani chizish
//        if (selectedRow != -1) {
//            g.setColor(Color.YELLOW);
//            g.drawRect(selectedCol * CELL_SIZE, selectedRow * CELL_SIZE, CELL_SIZE, CELL_SIZE);
//        }
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Checkers");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(new CheckersGame());
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
}

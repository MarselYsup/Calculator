import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CalSwing {
    private static final int SIZE_BUTTON = 30;
    private JFrame calculator;
    private JTextField textField;
    private JPanel mainPanel;

    private JButton oneNumberButton;
    private JButton twoNumberButton;
    private JButton threeNumberButton;
    private JButton plusButton;

    private JButton fourNumberButton;
    private JButton fiveNumberButton;
    private JButton sixNumberButton;
    private JButton minusButton;

    private JButton sevenNumberButton;
    private JButton eightNumberButton;
    private JButton nineNumberButton;
    private JButton multiplyButton;

    private JButton leftBracketButton;
    private JButton zeroNumberButton;
    private JButton rightBracketButton;
    private JButton divisionButton;

    private JButton equalButton;
    public void start() {
        calculator = new JFrame("Calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(800,800);
        calculator.setVisible(true);

        Font fontForTextField = new Font("SansSerif", Font.BOLD, 80);
        textField = new JTextField(15);
        textField.setFont(fontForTextField);
        textField.setText("1+1");
        calculator.getContentPane().add(BorderLayout.NORTH,textField);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4,4,5,12));

        //for number one
        oneNumberButton = new JButton("1");
        oneNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        oneNumberButton.addActionListener(new OneNumberListener());
        mainPanel.add(oneNumberButton);
        //for number two
        twoNumberButton = new JButton("2");
        twoNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        twoNumberButton.addActionListener(new TwoNumberListener());
        mainPanel.add(twoNumberButton);
        //for number three
        threeNumberButton = new JButton("3");
        threeNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        threeNumberButton.addActionListener(new ThreeNumberListener());
        mainPanel.add(threeNumberButton);
        //for character plus
        plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        plusButton.addActionListener(new PlusListener());
        mainPanel.add(plusButton);

        //for number four
        fourNumberButton = new JButton("4");
        fourNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        fourNumberButton.addActionListener(new FourNumberListener());
        mainPanel.add(fourNumberButton);
        //for number five
        fiveNumberButton = new JButton("5");
        fiveNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        fiveNumberButton.addActionListener(new FiveNumberListener());
        mainPanel.add(fiveNumberButton);
        //for number three
        sixNumberButton = new JButton("6");
        sixNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        sixNumberButton.addActionListener(new SixNumberListener());
        mainPanel.add(sixNumberButton);
        //for character minus
        minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        minusButton.addActionListener(new MinusListener());
        mainPanel.add(minusButton);

        //for number seven
        sevenNumberButton = new JButton("7");
        sevenNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        sevenNumberButton.addActionListener(new SevenNumberListener());
        mainPanel.add(sevenNumberButton);
        //for number eight
        eightNumberButton = new JButton("8");
        eightNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        eightNumberButton.addActionListener(new EightNumberListener());
        mainPanel.add(eightNumberButton);
        //for number nine
        nineNumberButton = new JButton("9");
        nineNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        nineNumberButton.addActionListener(new NineNumberListener());
        mainPanel.add(nineNumberButton);
        //for character multiply
        multiplyButton = new JButton("*");
        multiplyButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        multiplyButton.addActionListener(new MultiplyListener());
        mainPanel.add(multiplyButton);

        //for character leftBracket
        leftBracketButton = new JButton("(");
        leftBracketButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        leftBracketButton.addActionListener(new LeftBracketListener());
        mainPanel.add(leftBracketButton);
        //for number zero
        zeroNumberButton = new JButton("0");
        zeroNumberButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        zeroNumberButton.addActionListener(new ZeroNumberListener());
        mainPanel.add(zeroNumberButton);
        //for rightBracket
        rightBracketButton = new JButton(")");
        rightBracketButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        rightBracketButton.addActionListener(new RightBracketListener());
        mainPanel.add(rightBracketButton);
        //for character division
        divisionButton = new JButton("/");
        divisionButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        divisionButton.addActionListener(new DivisionListener());
        mainPanel.add(divisionButton);

        //set color for panel
        mainPanel.setBackground(Color.GREEN);
        //adding mainPanel to frame
        calculator.getContentPane().add(BorderLayout.CENTER,mainPanel);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Arial", Font.BOLD, SIZE_BUTTON));
        equalButton.addActionListener(new EqualListener());
        calculator.getContentPane().add(BorderLayout.SOUTH,equalButton);


    }


    private class OneNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"1");
        }
    }

    private class TwoNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"2");
        }
    }

    private class ThreeNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"3");
        }
    }

    private class PlusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"+");
        }
    }

    private class FourNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"4");
        }
    }

    private class FiveNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"5");
        }
    }

    private class SixNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"6");
        }
    }

    private class MinusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"-");
        }
    }

    private class SevenNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"7");
        }
    }

    private class EightNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"8");
        }
    }

    private class NineNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"9");
        }
    }

    private class MultiplyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"*");
        }
    }

    private class LeftBracketListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"(");
        }
    }

    private class ZeroNumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"0");
        }
    }

    private class RightBracketListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+")");
        }
    }

    private class DivisionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(textField.getText()+"/");
        }
    }

    private class EqualListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expressionText = textField.getText();
            MathExpression expression = new MathExpression();
            try {
                List<MathExpression.Lexeme> lexemes = expression.lexAnalyze(expressionText);
                MathExpression.LexemeBuffer lexemeBuffer = new MathExpression.LexemeBuffer(lexemes);
                textField.setText(Integer.toString(expression.expr(lexemeBuffer)));
            }catch (RuntimeException ex) {
                textField.setText("Error-incorrectly typed expression!");
            }

        }
    }
}

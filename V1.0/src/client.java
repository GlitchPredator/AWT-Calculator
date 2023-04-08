import java.awt.*;
import java.awt.event.*;

class AWT extends Frame {
    private int i=0,choice=-1;
    private double a=0,b=0;
    private final String welcomeString = "Alege un instrument de calcul";
    public AWT(){
        setSize(500,600);
        setTitle("GSV GUI Calculator [V1.0]");
        setBackground(Color.BLACK);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        TextField textField = new TextField();
        textField.setBounds(0,50,500,50);
        textField.setEditable(false);
        textField.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        textField.setText(welcomeString);

        Button powerButton = new Button("N^2");
        Button radicalButton = new Button("√");
        Button infoButton = new Button("X");
        Button[] butonCifre = new Button[10];
        Button periodButton = new Button(".");
        Button modulButton = new Button("%");
        Button divideButton = new Button("\\");
        Button multiplyButton = new Button("*");
        Button minusButton = new Button("-");
        Button addButton = new Button("+");
        Button resultButton = new Button("="), clearButton = new Button("CLEAR");
        //Proprietati butoane
        for(i=0; i<10; i++){
            butonCifre[i] = new Button(String.valueOf(i));
            butonCifre[i].setForeground(Color.WHITE);
            butonCifre[i].setFont(new Font("Sans-Serif", Font.BOLD, 24));
        }
        powerButton.setForeground(Color.YELLOW);
        powerButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        radicalButton.setForeground(Color.YELLOW);
        radicalButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        infoButton.setForeground(Color.YELLOW);
        infoButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        periodButton.setForeground(Color.WHITE);
        periodButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        modulButton.setForeground(Color.WHITE);
        modulButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        divideButton.setForeground(Color.WHITE);
        divideButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        multiplyButton.setForeground(Color.WHITE);
        multiplyButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        minusButton.setForeground(Color.WHITE);
        minusButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        resultButton.setForeground(Color.YELLOW);
        resultButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        clearButton.setForeground(Color.YELLOW);
        clearButton.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        /*Pozitionare butoane
        /rand_0 power radical info*/
        powerButton.setBounds(0, 100, 200, 100);
        radicalButton.setBounds(200, 100, 200, 100);
        infoButton.setBounds(400, 100, 100, 100);
        //rand_1 - 7 4 1 0
        butonCifre[7].setBounds(0, 200, 100, 100);
        butonCifre[4].setBounds(0, 300, 100, 100);
        butonCifre[1].setBounds(0, 400, 100, 100);
        butonCifre[0].setBounds(0, 500, 100, 100);
        //rand_2 - 2 5 8 .
        butonCifre[8].setBounds(100, 200, 100, 100);
        butonCifre[5].setBounds(100, 300, 100, 100);
        butonCifre[2].setBounds(100, 400, 100, 100);
        periodButton.setBounds(100,  500, 100, 100);
        //rand_3 - 9 6 3 %
        butonCifre[9].setBounds(200, 200, 100, 100);
        butonCifre[6].setBounds(200, 300, 100, 100);
        butonCifre[3].setBounds(200, 400, 100, 100);
        modulButton.setBounds(200, 500, 100, 100);
        //rand_4 - / * - +
        divideButton.setBounds(300, 200, 100, 100);
        multiplyButton.setBounds(300, 300, 100, 100);
        minusButton.setBounds(300, 400, 100, 100);
        addButton.setBounds(300, 500, 100, 100);
        //rand_5 - = && clear
        resultButton.setBounds(400,200, 100, 200);
        clearButton.setBounds(400, 400, 100, 200);

        //adaugare butoane in frame
        add(textField);
        add(powerButton);
        add(radicalButton);
        add(infoButton);
        for(i=0; i<10; i++){
            add(butonCifre[i]);
        }
        add(periodButton);
        add(modulButton);
        add(divideButton);
        add(multiplyButton);
        add(minusButton);
        add(addButton);
        add(resultButton);
        add(clearButton);

        //Events
        for(i=0; i<10; i++){
            String l = butonCifre[i].getLabel();
            butonCifre[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(textField.getText().equals(welcomeString) || textField.getText().equals("Introdu un numar!")){
                        textField.setText("");
                    }
                    textField.setText(textField.getText() + l);
                }
            });
        }
        periodButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText(textField.getText() + ".");
            }
        });
        modulButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                choice = 4;
                a = Double.parseDouble(textField.getText());
                textField.setText("");
            }
        });
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                choice = 0; // add
                a = Double.parseDouble(textField.getText());
                textField.setText("");
            }
        });
        minusButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                choice = 1;
                a = Double.parseDouble(textField.getText());
                textField.setText("");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                choice = 2;
                a = Double.parseDouble(textField.getText());
                textField.setText("");
            }  
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                choice = 3;
                a = Double.parseDouble(textField.getText());
                textField.setText("");
            }

        });
        powerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int value = (Integer.parseInt(textField.getText())) * (Integer.parseInt(textField.getText()));
                textField.setText(String.valueOf(value));
            }
        });
        radicalButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double value = Math.sqrt((Integer.parseInt(textField.getText())));
                textField.setText(String.valueOf(value));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("");
            }
        });
        resultButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result(textField);
            }
        });
        infoButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
            }
        });

        //Key events
        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if((e.isShiftDown() == false) && (e.getKeyCode() >= KeyEvent.VK_0 && e.getKeyCode() <= KeyEvent.VK_9) || (e.getKeyCode() >= KeyEvent.VK_NUMPAD0 && e.getKeyCode() <= KeyEvent.VK_NUMPAD9)){
                    if(textField.getText().equals(welcomeString) || textField.getText().equals("Introdu un numar!")){
                        textField.setText("");
                    }
                    textField.setText(textField.getText() + e.getKeyChar());
                }
                else if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
                    textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                }
                else if(e.getKeyCode() == KeyEvent.VK_ADD || (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_EQUALS)){
                    choice = 0; // add
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_MINUS || e.getKeyCode() == KeyEvent.VK_SUBTRACT){
                    choice = 1;
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_MULTIPLY || e.getKeyCode() == KeyEvent.VK_8 && e.isShiftDown()){
                    choice = 2;
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_DIVIDE || e.getKeyCode() == KeyEvent.VK_SLASH){
                    choice = 3;
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_5 && e.isShiftDown()){
                    choice = 4;
                    a = Double.parseDouble(textField.getText());
                    textField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_EQUALS || e.getKeyCode() == KeyEvent.VK_ENTER){
                    result(textField);
                }
                else if(e.getKeyCode() == KeyEvent.VK_DELETE || (e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_DECIMAL)){
                    textField.setText("");
                }
                else {
                    if(e.getKeyCode() == KeyEvent.VK_PERIOD || e.getKeyCode() == KeyEvent.VK_DECIMAL){
                        textField.setText(textField.getText() + ".");
                    }
                }
            }
        });
    }
    
    public void result(TextField textField){
        b = Double.parseDouble(textField.getText());
        double rez=0;
        if(choice == 0){
            rez = a+b;
        }
        else if(choice == 1){
            rez = a-b;
        }
        else if(choice == 2){
            rez = a*b;
        }
        else if(choice == 3){
            rez = a/b;  
        }
        else {
            rez = a%b;
        }
        if(choice == 0 || choice == 1 || choice == 2){
            if(rez%1 == 0){
                textField.setText(String.valueOf((int)rez));
            }
            else {
                textField.setText(String.valueOf(rez));
            }
        }
        else {
            if(choice != -1)
                textField.setText(String.valueOf(rez));
        }
        choice = -1;
    }
}   

public class client {
    public static void main(String[] args)
    {
        new AWT();
    }
}